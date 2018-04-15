package com.san.customer.client;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.san.customer.client.domain.Customer;
import com.san.customer.client.service.CustomerService;

public class Main {
	
	public static final Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) throws Exception
	{		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");		
		CustomerService teamServiceClient = (CustomerService) applicationContext.getBean("customerServiceClient");		

		List<Customer> customers = teamServiceClient.getCustomers();
		for (Customer customer : customers)
		{
			logger.info("Customer:id-" + customer.getId() + ",name-"+customer.getName()
					+ ",city-" + customer.getCity());
			System.out.println("Customer:id-" + customer.getId() + ",name-"+customer.getName()
			+ ",city-" + customer.getCity());
		}
	}
}