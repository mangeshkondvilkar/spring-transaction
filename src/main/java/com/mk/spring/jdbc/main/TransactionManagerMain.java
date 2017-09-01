package com.mk.spring.jdbc.main;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mk.spring.jdbc.model.Address;
import com.mk.spring.jdbc.model.CatEventMessage;
import com.mk.spring.jdbc.model.Customer;
import com.mk.spring.jdbc.service.CustomerManager;
import com.mk.spring.jdbc.service.CustomerManagerImpl;
import com.mk.spring.jdbc.service.EventManager;

public class TransactionManagerMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");

		CustomerManager customerManager = ctx.getBean("customerManager",
				CustomerManagerImpl.class);

		Customer cust = createDummyCustomer();
		//customerManager.createCustomer(cust);
		
		//test
		DataSource ds = (DataSource)ctx.getBean("dataSource");
		
		EventManager eventManager = ctx.getBean("eventManager", EventManager.class);
		eventManager.createCatEvent(new CatEventMessage());
		
		ctx.close();
	}

	private static Customer createDummyCustomer() {
		Customer customer = new Customer();
		customer.setId(2);
		customer.setName("Mangesh");
		Address address = new Address();
		address.setId(2);
		address.setCountry("India");
		// setting value more than 20 chars, so that SQLException occurs
		address.setAddress("Wakad, Pune 411057, MH");
		customer.setAddress(address);
		return customer;
	}

}
