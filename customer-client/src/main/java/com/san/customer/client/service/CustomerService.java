package com.san.customer.client.service;

import java.util.List;

import javax.jws.WebService;

import com.san.customer.client.domain.Customer;

@WebService(targetNamespace="http://service.customer.san.com/")
public interface CustomerService {

	public List<Customer> getCustomers();
}
