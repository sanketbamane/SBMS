package com.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Entity
@Table(name = "STUDENT_DTLS")
@Data
@XmlRootElement
public class Student {

	@Id
	@GeneratedValue
	private Integer sid;
	private String sname;
	private Integer marks;

}
