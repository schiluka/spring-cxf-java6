package com.san.customer.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingType;

import org.springframework.stereotype.Service;

import com.san.customer.domain.Customer;

@Service(value="customerService")
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class CustomerServiceImpl implements CustomerService {

	@Override
	public List<Customer> getCustomers() {
		List<Customer> list = init();
		return list;
	}
	
	private List<Customer> init() {
		List<Customer> list = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setName("john");
		customer.setCity("nyc");
		list.add(customer);
		
		customer = new Customer();
		customer.setName("will");
		customer.setCity("sfo");
		list.add(customer);
		
		return list;
		
	}

}
