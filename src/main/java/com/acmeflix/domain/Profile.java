package com.acmeflix.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Profile extends BaseModel {
    private String profileNickname;
    private boolean under18;
    private Language language;
}
