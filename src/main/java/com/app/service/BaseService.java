package com.app.service;

import com.app.pojo.User;

public interface BaseService {
	public boolean login(String userid,String username,String password);

	 public String registration(User user);
	}


