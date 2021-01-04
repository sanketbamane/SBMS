package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.UserDao;
import com.ashokit.util.EmailUtils;

@Service
public class UserService {

	public UserService() {
		System.out.println("** UserService:: Constructor ** ");
	}

	private UserDao userDao;
	private EmailUtils emailUtils;

	@Autowired
	public void setUserDao(UserDao userDao) {
		System.out.println("**setUserDao() method called**");
		this.userDao = userDao;
	}

	@Autowired
	public void setEmailUtils(EmailUtils emailUtils) {
		System.out.println("**setEmailUtils() method called **");
		this.emailUtils = emailUtils;
	}

	public void getName(Integer id) {
		String name = userDao.findNameById(id);
		System.out.println(name);
	}

	public void saveUser(Integer id, String name) {
		boolean isSaved = userDao.save(id, name);
		if (isSaved) {
			emailUtils.sendEmail();
		}
	}

}
