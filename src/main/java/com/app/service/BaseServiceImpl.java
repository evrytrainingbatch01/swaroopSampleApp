package com.app.service;

import com.app.dao.BaseDao;
import com.app.dao.BaseDaoImpl;
import com.app.pojo.User;

public class BaseServiceImpl implements BaseService {
	private BaseDao loginDao = new BaseDaoImpl();

	public boolean login(String userid, String password,String username) {
		// TODO Auto-generated method stub
		return loginDao.login(userid, password,username);
	}

	public String registration(User user) {
		// TODO Auto-generated method stub
		  return loginDao.register(user);
	}

}
