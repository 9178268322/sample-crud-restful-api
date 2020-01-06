package com.api.bootmain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.bootmain.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {


}
