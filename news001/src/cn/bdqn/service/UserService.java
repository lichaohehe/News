package cn.bdqn.service;

import cn.bdqn.bean.News_User;


public interface UserService {

	News_User login(String userName,String password);
}
