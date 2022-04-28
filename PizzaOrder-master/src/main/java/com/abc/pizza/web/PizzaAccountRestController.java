package com.abc.pizza.web;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.pizza.entity.*;
import com.abc.pizza.service.PizzaAccountService;

@RestController

public class PizzaAccountRestController {
	@Autowired
	PizzaAccountService pizzaAccountService;
	
	@GetMapping("/pizzas")
	public List<PizzaAccount> doThis()
	{
		return pizzaAccountService.getAllPizza();
	}
	
	
	@PostMapping("/admin") 
	public String savedAccountFromWeb(@RequestBody PizzaAccount a)
	{
		boolean status = pizzaAccountService.insertPizzaAccount(a);
	
		return status == true?"Pizza Added ":"Contact to customer Care";
	}
	
	/*
	//update operation
	@PutMapping("/admin/pizza/{id}")
	public PizzaAccount updatePizzaAccount(@RequestBody PizzaAccount pizzaAccount, @PathVariable("id") Long pizzaId)
	{
		return PizzaAccountService.updatePizzaAccount(pizzaId);
	}
	
	//Delete operation
	@DeleteMapping("/admin/pizza/{id}")
	
	public String deletePizzaAccountById(@PathVariable("id") Long pizzaId)
	{
		PizzaAccountService.deletePizzaAccountById(pizzaId);
		return "Deleted Successfully";
	}*/
	
}
