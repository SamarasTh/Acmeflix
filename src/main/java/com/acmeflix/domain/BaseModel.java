package com.acmeflix.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

@Data
@SuperBuilder
public class BaseModel implements Serializable {
    //    Indicates that an annotated field or method is part of the serialization mechanism defined by the Java Object Serialization Specification. This annotation type is intended to allow compile-time checking of serialization-related declarations, analogous to the checking enabled by the Override annotation type to validate method overriding. Serializable classes are encouraged to use @Serial annotations to help a compiler catch mis-declared serialization-related fields and methods, mis-declarations that may otherwise be difficult to detect.
    @Serial
    public static final Long serialVersionUID = 1L;
    Long id;
}
