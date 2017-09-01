package com.mk.spring.jdbc.service;

import org.springframework.transaction.annotation.Transactional;

import com.mk.spring.jdbc.dao.CustomerDAO;
import com.mk.spring.jdbc.model.Customer;

public class CustomerManagerImpl implements CustomerManager {

	private CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	@Transactional
	public void createCustomer(Customer cust) {
		customerDAO.create(cust);
	}

}
