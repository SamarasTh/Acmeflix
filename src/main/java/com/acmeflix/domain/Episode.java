package com.acmeflix.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Episode extends BaseModel {
    private int duration;
    private String summary;
}
