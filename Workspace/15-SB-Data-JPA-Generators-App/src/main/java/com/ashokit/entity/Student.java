package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "STUDENTS_TBL")
public class Student {

	@Id
	@Column(name = "STUDENT_ID")
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer studentId;

	@Column(name = "STUDENT_NAME")
	private String studentName;

	@Column(name = "STUDENT_GENDER")
	private String studentGender;

}
