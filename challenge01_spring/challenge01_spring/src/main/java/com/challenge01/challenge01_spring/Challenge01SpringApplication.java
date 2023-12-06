package com.challenge01.challenge01_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.challenge01.challenge01_spring.entities.Order;
import com.challenge01.challenge01_spring.services.ShippingService;

@SpringBootApplication
@ComponentScan({"com.challenger01.challenge01_spring"})
public class Challenge01SpringApplication implements CommandLineRunner {
	
	@Autowired
	ShippingService shippingService;

	public static void main(String[] args) {
		SpringApplication.run(Challenge01SpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order or1 =new Order(1034, 150.0, 20.0);
		Order or2 =new Order(2282, 800.0, 10.0);
		Order or3 =new Order(1309, 95.90, 0.0);
		
		
		System.out.println("Order Code:"+or1.getCode()+" Total:"+shippingService.shipment(or1));
		System.out.println("Order Code:"+or2.getCode()+" Total:"+shippingService.shipment(or2));
		System.out.println("Order Code:"+or3.getCode()+" Total:"+shippingService.shipment(or3));
		
		
	}

}
