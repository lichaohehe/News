package cn.bdqn.service.impl;

import java.io.Serializable;
import java.util.List;

import cn.bdqn.bean.News_Detail;
import cn.bdqn.dao.NewsDetailDao;
import cn.bdqn.dao.impl.NewsDetailDaoImpl;
import cn.bdqn.service.NewsDetailService;

public class NewsDetailServiceImpl implements NewsDetailService {

	private NewsDetailDao dao=new NewsDetailDaoImpl();
	
	public List<News_Detail> findAllNewsDetail() {
		return dao.findAllNewsDetail();
	}

	public int DelByNewsDetailId(int id) {
		return dao.DelByNewsDetailId(id);
	}

	public News_Detail findById(Serializable id) {
		return dao.findById(id);
	}

	public boolean updateById(News_Detail detail) {

		if(dao.updateById(detail)>0){
			return true;
		}
		
		return false;
	}

	public boolean addNews(News_Detail detail) {
		if(dao.addNews(detail)>0){
			return true;
		}
		return false;
	}

	
}
