package com.acmeflix.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Rating {
    private double rating;
    private Program program;
    private Profile profile;

}
