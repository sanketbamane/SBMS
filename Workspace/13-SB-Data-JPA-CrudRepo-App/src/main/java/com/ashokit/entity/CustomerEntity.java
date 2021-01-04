package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CUSTOMER_DTLS_TBL")
public class CustomerEntity {

	@Id
	@Column(name = "C_ID")
	private Integer customerId;

	@Column(name = "CUSTOMER_NAME")
	private String customerName;

	@Column(name = "CUSTOMER_EMAIL")
	private String customerEmail;

}
