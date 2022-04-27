package com.abc.pizza.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.pizza.entity.PizzaAccount;
import com.abc.pizza.entity.PizzaAccount;
import com.abc.pizza.exceptions.InvalidUserException;

@Service

public interface PizzaAccountService 
{
	public String login(String username,String password) throws InvalidUserException;

	public boolean logout(String username);
	public List<PizzaAccount> getAllPizza();
	public boolean insertPizzaAccount(PizzaAccount a);
	public PizzaAccount getPizzaAccount(int pId);
	
}
