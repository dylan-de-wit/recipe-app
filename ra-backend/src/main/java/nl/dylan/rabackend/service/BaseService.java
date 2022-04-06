package nl.dylan.rabackend.service;

import lombok.RequiredArgsConstructor;
import nl.dylan.rabackend.domain.BaseModel;
import nl.dylan.rabackend.dto.BaseDto;
import nl.dylan.rabackend.mapper.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Transactional
@RequiredArgsConstructor
public abstract class BaseService<D extends BaseDto, M extends BaseModel> {
    private final Class<M> modelClass;

    /**
     * Implement this method to provide the {@link JpaRepository} that handles all CRUD operations on the entity this
     * service maintains.
     *
     * @return {@link JpaRepository}
     */
    protected abstract JpaRepository<M, UUID> repository();

    /**
     * Implement this method to provide the {@link Mapper} that maps from and to dto
     *
     * @return {@link Mapper}
     */
    protected abstract Mapper<D, M> mapper();

    @NotNull
    public Optional<D> findById(@NotNull UUID id) {
        M m = repository().findById(id).orElse(null);

        return Optional.of(mapper().toDto(m));
    }

    public void deleteById(@NotNull UUID id) {
        repository().deleteById(id);
    }

    @NotNull
    public List<D> findAll() {
        return repository().findAll().stream().map(m -> mapper().toDto(m)).collect(Collectors.toList());
    }

    @NotNull
    public D create(@NotNull D dto) {
        M m = mapper().toModel(dto);

        return mapper().toDto(repository().save(m));
    }

    @NotNull
    public D update(@NotNull UUID id, @NotNull D dto) {
        M m = mapper().toModel(dto);

        return mapper().toDto(repository().save(m));
    }
}
