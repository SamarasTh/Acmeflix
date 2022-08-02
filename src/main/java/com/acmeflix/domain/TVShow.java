package com.acmeflix.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
public class TVShow extends ContentCatalog {
    private List<Season> seasons;
    private int totalDuration;
}
