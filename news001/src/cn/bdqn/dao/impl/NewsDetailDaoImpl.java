package cn.bdqn.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import cn.bdqn.bean.News_Detail;
import cn.bdqn.dao.NewsDetailDao;
import cn.bdqn.util.BaseDao;

public class NewsDetailDaoImpl extends BaseDao implements NewsDetailDao {

	public List<News_Detail> findAllNewsDetail() {
		
		String sql="select * from news_detail";
		rs=this.executeQuery(sql);
		List<News_Detail> news_Details=new ArrayList<News_Detail>();
		try {
			while(rs.next()){
				News_Detail detail=new News_Detail();
				detail.setId(rs.getInt("id"));
				detail.setAuthor(rs.getString("author"));
				detail.setCategoryId(rs.getInt("categoryId"));
				detail.setTitle(rs.getString("title"));
				detail.setContent(rs.getString("content"));
				detail.setSummary(rs.getString("summary"));
				detail.setPicPath(rs.getString("picPath"));
				detail.setCreateDate(rs.getDate("createDate"));
				detail.setModifyDate(rs.getDate("modifyDate"));
				
				news_Details.add(detail);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeConnection();
		}
		
		return news_Details;
	}
	//删除新闻
	public int DelByNewsDetailId(int id) {
		String sql="delete from news_detail where id=?";
		Object [] params={id};
		
		return this.executeUpdate(sql, params);
	}
	

	public News_Detail findById(Serializable id) {
		String sql="SELECT * FROM news_detail WHERE id=?";
		Object [] params={id};
		News_Detail detail=null;
		rs=executeQuery(sql, params);
		try {
			while(rs.next()){
				detail=new News_Detail();
				detail.setId(rs.getInt("id"));
				detail.setAuthor(rs.getString("author"));
				detail.setCategoryId(rs.getInt("categoryId"));
				detail.setTitle(rs.getString("title"));
				detail.setContent(rs.getString("content"));
				detail.setSummary(rs.getString("summary"));
				detail.setPicPath(rs.getString("picPath"));
				detail.setCreateDate(rs.getDate("createDate"));
				detail.setModifyDate(rs.getDate("modifyDate"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeConnection();
		}
		
		return detail;
	}
	public int updateById(News_Detail detail) {

		String sql="UPDATE news_detail SET title=?,content=?,author=?,summary=? WHERE id=?";
		Object[] params={detail.getTitle(),detail.getContent(),detail.getAuthor(),detail.getSummary(),detail.getId()};
		
		return this.executeUpdate(sql, params);
	}
	
		//增加新闻信息
			public int addNews(News_Detail detail){
		        	String sql = "INSERT INTO news_detail(categoryId,title,content,author,summary) VALUES(?,?,?,?,?)";
					Object[] params ={detail.getCategoryId(),detail.getTitle(),detail.getContent(),detail.getAuthor(),detail.getSummary()};
					return this.executeUpdate(sql, params);
			}
	

}
