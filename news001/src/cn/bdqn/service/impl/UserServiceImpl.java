package cn.bdqn.service.impl;

import cn.bdqn.bean.News_User;
import cn.bdqn.dao.UserDao;
import cn.bdqn.dao.impl.UserDaoImpl;
import cn.bdqn.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao dao=new UserDaoImpl();
	
	public News_User login(String userName, String password) {
		
		return dao.login(userName, password);
	}

}
