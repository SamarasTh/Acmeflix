package com.acmeflix.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
public class ContentCatalog extends BaseModel {
    private String title;
    private String year;
    private List<Genre> genres;
    List<ContentCatalog> contentCatalogRecommendations;
    private List<Language> languages;
    private List<Language> subtitles;


}
