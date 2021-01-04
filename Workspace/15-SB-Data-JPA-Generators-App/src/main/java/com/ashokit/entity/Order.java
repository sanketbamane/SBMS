package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ORDERS_TBL")
public class Order {

	@Id
	@Column(name = "ORDER_ID")
	@SequenceGenerator(sequenceName = "ORDER_ID_SEQ", name = "abc-SEQ", allocationSize = 1)
	@GeneratedValue(generator = "abc-SEQ", strategy = GenerationType.SEQUENCE)
	private Integer orderId;

	@Column(name = "ORDER_BY")
	private String orderBy;

	@Column(name = "ORDER_STATUS")
	private String orderStatus;

}
