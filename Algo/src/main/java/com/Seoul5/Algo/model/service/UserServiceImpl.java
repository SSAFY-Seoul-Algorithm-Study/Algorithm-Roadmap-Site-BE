package com.Seoul5.Algo.model.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Seoul5.Algo.model.dao.UserDao;
import com.Seoul5.Algo.model.dto.User;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	private UserDao userDao;
	
	public UserDao getUserRepo() { return userDao; }
	
	@Autowired
	public void setUserRepo(UserDao dao) { this.userDao = dao; }
	
	@Override
	public List<User> selectAll() { return userDao.selectAll(); }
	
	@Override
	@Transactional
	public int insert(User user) { return userDao.insert(user); }
}
