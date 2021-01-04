package com.ashokit.binding;

import java.util.List;

import lombok.Data;

@Data
@XmlRootElement
public class Users {

	private List<User> user;

}
