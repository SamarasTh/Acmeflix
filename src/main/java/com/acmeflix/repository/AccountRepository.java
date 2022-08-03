package com.acmeflix.repository;

import com.acmeflix.domain.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends BaseRepository<Account, Long> {
}
