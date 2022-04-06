package nl.dylan.rabackend.mapper;

import nl.dylan.rabackend.domain.BaseModel;
import nl.dylan.rabackend.dto.BaseDto;

public interface Mapper<D extends BaseDto, M extends BaseModel> {

    D toDto(M model);
    M toModel(D dto);
    M updateFromDto(M model, D dto);
}
