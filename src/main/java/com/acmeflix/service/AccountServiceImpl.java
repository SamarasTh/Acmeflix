package com.acmeflix.service;

import com.acmeflix.domain.Account;
import com.acmeflix.repository.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService {

    @Override
    public BaseRepository<Account, Long> getRepository() {
        return null;
    }
}
