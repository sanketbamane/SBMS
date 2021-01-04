package com.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ContactDao {

	public ContactDao() {
		System.out.println("** ContactDao :: Constructor ** ");
	}

	public String findNameById(Integer cid) {
		return "Ashok";
	}

}
