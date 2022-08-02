package com.acmeflix.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Person extends BaseModel {
    private String firstName;
    private String lastName;
    private int Age;

}
