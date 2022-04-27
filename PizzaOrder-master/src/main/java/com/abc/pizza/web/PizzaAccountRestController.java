package com.abc.pizza.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.pizza.entity.*;
import com.abc.pizza.service.PizzaAccountService;

@RestController
@RequestMapping("/pizza")
public class PizzaAccountRestController {
	@Autowired
	PizzaAccountService pizzaAccountService;
	
	@GetMapping("/admin/pizza")
	public List<PizzaAccount> doThis()
	{
		return pizzaAccountService.getAllPizza();
	}
	
	
	@PostMapping("/admin/pizza") 
	public String savedAccountFromWeb(@RequestBody PizzaAccount a)
	{
		boolean status = pizzaAccountService.insertPizzaAccount(a);
	
		return status == true?"Pizza Added ":"Contact to customer Care";
	}
}
