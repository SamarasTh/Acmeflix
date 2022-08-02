package com.acmeflix.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;
@Data
@SuperBuilder
public abstract class BaseModel {
    Long id;
}
