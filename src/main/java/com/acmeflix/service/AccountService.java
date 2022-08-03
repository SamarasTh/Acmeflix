package com.acmeflix.service;

import com.acmeflix.domain.Account;
import com.acmeflix.domain.Profile;
import com.acmeflix.domain.SubscriptionPlan;

public interface AccountService {

    void resetPassword(Account account, String password);

    void createProfile(Account account, Profile... profiles);

    void changeSubscriptionPlan(Account account, SubscriptionPlan subscriptionPlan);
}
