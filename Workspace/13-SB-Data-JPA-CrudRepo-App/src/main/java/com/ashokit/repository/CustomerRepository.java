package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ashokit.entity.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Serializable> {

	public CustomerEntity findByCustomerEmail(String emailId);

	public CustomerEntity findByCustomerName(String cname);

	public CustomerEntity findByCustomerEmailAndCustomerName(String email, String name);

	@Query(value = "from CustomerEntity where customerName=:cname")
	public CustomerEntity getCustomer(String cname);

	@Query(value = "from CustomerEntity where customerName=:name and customerEmail=:email")
	public CustomerEntity findCustomer(String name, String email);

}
