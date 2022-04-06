package nl.dylan.rabackend.dto;

import lombok.*;

import java.util.UUID;

@Data
public abstract class BaseDto {
    private UUID id;
}
