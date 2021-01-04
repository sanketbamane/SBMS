package com.ashokit.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class User {

	private Integer userId;
	private String username;
	private String userEmail;

}
