package com.acmeflix.domain;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import java.util.List;
@Data
@SuperBuilder
public class Account {
    private String username;
    private String password;
    private String email;
    private String subscriptionPlan;
    private String fullName;
    private List<Profile> profiles;
    private String phone;
}
