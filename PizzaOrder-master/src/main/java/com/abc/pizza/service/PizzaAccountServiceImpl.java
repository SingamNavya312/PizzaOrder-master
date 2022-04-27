package com.abc.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.pizza.entity.PizzaAccount;
import com.abc.pizza.exceptions.InvalidUserException;
import com.abc.pizza.repository.PizzaAccountRepository;

import com.abc.pizza.service.PizzaAccountService;

@Service
public class PizzaAccountServiceImpl implements PizzaAccountService{
	
	@Autowired
	PizzaAccountRepository hotelAccountRepository;

	@Override
	public String login(String username, String password) throws InvalidUserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<PizzaAccount> getAllPizza() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertPizzaAccount(PizzaAccount a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PizzaAccount getPizzaAccount(int pId) {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	
