package com.api.bootmain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.bootmain.entity.Account;
import com.api.bootmain.repo.AccountRepository;

@Service
public class AccountService { 

	@Autowired
	private AccountRepository accountRepository;

	public List<Account> getAllAccounts() {
		return (List<Account>) accountRepository.findAll();
	}

	public Optional<Account> getAccount(Long id) {
		return accountRepository.findById(id);
	}

	public Account addAccount(Account ac) {
		return accountRepository.save(ac);
	}

	public Account updateAccount(Account ac, Long id) {
		return accountRepository.save(ac);
	}

	public void deleteAccount(Account ac) {
		accountRepository.delete(ac);
	}

}
