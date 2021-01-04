package com.ashokit.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.ashokit.entity.Student;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@XmlRootElement
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Students {

	@XmlElement(name = "student")
	@JsonProperty("student")
	private List<Student> students;

}
