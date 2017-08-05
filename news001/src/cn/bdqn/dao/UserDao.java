package cn.bdqn.dao;

import cn.bdqn.bean.News_User;

public interface UserDao {
	
	News_User login(String userName,String password);
}
