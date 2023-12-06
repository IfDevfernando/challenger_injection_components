package com.challenge01.challenge01_spring.services;

import org.springframework.stereotype.Service;

import com.challenge01.challenge01_spring.entities.Order;

@Service
public class Orderservice {
	
	
	public double total(Order order) {
		return order.getBasic() -( order.getBasic() * order.getDiscount() /100);
	}

	
}
