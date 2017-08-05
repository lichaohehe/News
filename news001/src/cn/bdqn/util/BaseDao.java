package cn.bdqn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	protected Connection conn = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;

	// 加载驱动
	public boolean getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 建立连接
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/news", "root", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	//增、删、改
	public int executeUpdate(String sql,Object... params){
		int row=0;			//影响的行数
		if (getConnection()) {
			try {
				pstmt = conn.prepareStatement(sql);
				if(params!=null){      // 有参数？ 有几个呀？
					for (int i = 0; i < params.length; i++) {
						pstmt.setObject(i+1, params[i]);
					}
				}
				row = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				closeConnection();
			}
		}
		return row;
	}
	//查
	public ResultSet executeQuery(String sql,Object... params){

		if (getConnection()) {
			try {
				pstmt = conn.prepareStatement(sql);
				if(params!=null){
					for (int i = 0; i < params.length; i++) {
						pstmt.setObject(i+1, params[i]);
					}
				}
				rs = pstmt.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		return rs;
	}
	
	//关闭资源
	public void closeConnection() {
		
		try {
			if(rs!=null){
				rs.close();
			}
			if(pstmt!=null){
				pstmt.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
