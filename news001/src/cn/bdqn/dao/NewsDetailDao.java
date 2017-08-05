package cn.bdqn.dao;

import java.io.Serializable;
import java.util.List;

import cn.bdqn.bean.News_Detail;


public interface NewsDetailDao  {

	/**
	 * 
	 * @return所有新闻信息
	 */
	List<News_Detail> findAllNewsDetail();
	
	/**
	 * 
	 * @param id 需要删除的新闻信息编号
	 * @return 是否成功
	 */
	int DelByNewsDetailId(int id);

	/**
	 * 
	 * @param id 查询指定id的新闻
	 * @return
	 */
	News_Detail findById(Serializable id);

	/**
	 * 
	 * @param id 根据id修改指定新闻信息
	 * @return 是否修改成功
	 */
	int updateById(News_Detail detail);
	/**
	 * 
	 * @param id 根据id增加指定新闻信息
	 * @return 是否新增成功
	 */
	int addNews(News_Detail detail);
	
}
