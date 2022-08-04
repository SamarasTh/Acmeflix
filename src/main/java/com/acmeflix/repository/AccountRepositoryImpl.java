package com.acmeflix.repository;

import com.acmeflix.domain.Account;
import com.acmeflix.domain.TVShow;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;


@Component
public class AccountRepositoryImpl extends BaseRepositoryImpl<Account> implements AccountRepository {

    private final AtomicLong id = new AtomicLong(1);
    private final Map<Long, Account> entity = new LinkedHashMap<>();
    @Override
    public Map<Long, Account> getEntity() {
        return entity;
    }

    @Override
    public AtomicLong getID() {
        return id;
    }
}
