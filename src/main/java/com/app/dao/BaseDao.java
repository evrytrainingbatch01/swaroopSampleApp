package com.app.dao;

import com.app.pojo.User;

public interface BaseDao {
	public boolean login(String userid, String username, String password);

	 public String register(User user);
	

}

