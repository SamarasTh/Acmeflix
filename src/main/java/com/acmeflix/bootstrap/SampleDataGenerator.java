package com.acmeflix.bootstrap;

import com.acmeflix.base.BaseComponent;
import com.acmeflix.domain.Account;
import com.acmeflix.domain.Profile;
import com.acmeflix.domain.SubscriptionPlan;
import com.acmeflix.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SampleDataGenerator extends BaseComponent implements CommandLineRunner {
    private final AccountService accountService;

    @Override
    public void run(String... args) throws Exception {
//create dummy accounts
        Account account1 = Account.builder()
                .id(1L)
                .email("test@test.com")
                .username("tester")
                .password("1344365472")
                .phone("6978384185")
                .subscriptionPlan(SubscriptionPlan.BASIC)
                .build();

        Account account2 = Account.builder()
                .id(1L)
                .email("test@test.com")
                .username("thanos")
                .password("afg4524414f")
                .phone("6972324185")
                .subscriptionPlan(SubscriptionPlan.FAMILY)
                .build();

        Account account3 = Account.builder()
                .id(1L)
                .email("test@test.com")
                .username("thanos")
                .password("afg4524414f")
                .phone("6972324185")
                .subscriptionPlan(SubscriptionPlan.PREMIUM)
                .build();

//one way to set Profiles to our accounts
        account1.setProfiles(List.of(
                Profile.builder()
                        .id(1L)
                        .profileNickname("Agelos")
                        .build(),
                Profile.builder()
                        .id(2L)
                        .profileNickname("Thanos")
                        .build(),
                Profile.builder()
                        .id(3L)
                        .profileNickname("Georgia")
                        .build()));

        account2.setProfiles(List.of(
                Profile.builder()
                        .id(1L)
                        .profileNickname("Nikos")
                        .build(),
                Profile.builder()
                        .id(2L)
                        .profileNickname("maria")
                        .build(),
                Profile.builder()
                        .id(3L)
                        .profileNickname("Together")
                        .build()));
//        second way to add profiles via service layer
        accountService.createProfiles(account3,
                Profile.builder().id(1L).profileNickname("Takis").build(),
                Profile.builder().id(2L).profileNickname("Manolia").build());
    }

}
