package com.ashokit.response;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class User {

	private Integer userId;
	private String username;
	private String userEmail;

}
