package cn.bdqn.service;

import java.io.Serializable;
import java.util.List;

import cn.bdqn.bean.News_Detail;

public interface NewsDetailService {

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
	 * @param id   查询详情的id
	 * @return		一条新闻详情
	 */
	News_Detail findById(Serializable id);
	
	/**
	 * 
	 * @param id 根据id修改指定新闻信息
	 * @return 是否修改成功
	 */
	boolean updateById(News_Detail detail);
	/**
	 * 
	 * @param detail新增新闻信息
	 * @return是否新增成功
	 */
	boolean addNews(News_Detail detail);
}
