package cn.bdqn.dao.impl;

import java.sql.SQLException;

import cn.bdqn.bean.News_User;
import cn.bdqn.dao.UserDao;
import cn.bdqn.util.BaseDao;

public class UserDaoImpl extends BaseDao implements UserDao {

	public News_User login(String userName, String password) {
		
		String sql="select * from news_user where userName=? and password=?";
		Object [] params={userName,password};
		rs=this.executeQuery(sql, params);
		
		News_User user=null;
		try {
			if(rs.next()){
				user=new News_User();
			user.setId(rs.getInt("id"));
			user.setUserName(rs.getString("userName"));
			user.setPassword(rs.getString("password"));
			user.setEmail(rs.getString("email"));
			user.setUserType(rs.getInt("userType"));
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeConnection();
		}
		return user;
	}

}
