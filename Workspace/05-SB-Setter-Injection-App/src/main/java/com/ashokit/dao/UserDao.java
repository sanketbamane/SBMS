package com.ashokit.dao;

public interface UserDao {

	public String findNameById(Integer id);
	
	public boolean save(Integer id, String name);

}
