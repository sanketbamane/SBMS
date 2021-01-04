package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Serializable> {

}
