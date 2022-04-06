package nl.dylan.rabackend.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "ingredients")
public class Ingredient extends BaseModel {

    @Column(nullable = false)
    private String name;
}
