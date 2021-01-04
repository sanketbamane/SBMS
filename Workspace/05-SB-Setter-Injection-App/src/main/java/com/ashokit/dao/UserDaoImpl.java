package com.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {
		System.out.println("** UserDaoImpl :: Constructor **");
	}

	@Override
	public String findNameById(Integer id) {
		if (id == 101) {
			return "John";
		} else if (id == 102) {
			return "Smith";
		} else {
			return null;
		}
	}
	
	@Override
	public boolean save(Integer id, String name) {
		System.out.println("User saved.....!!");
		return true;
	}
}
