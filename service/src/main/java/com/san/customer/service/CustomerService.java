package com.san.customer.service;

import java.util.List;

import javax.jws.WebService;

import com.san.customer.domain.Customer;

@WebService
public interface CustomerService {

	public List<Customer> getCustomers();
}
