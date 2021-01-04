package com.ashokit.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class User {
	
	private Integer userId;
	private String username;
	private String userEmail;

}
