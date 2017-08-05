package cn.bdqn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.bdqn.bean.News_Detail;
import cn.bdqn.service.NewsDetailService;
import cn.bdqn.service.impl.NewsDetailServiceImpl;

public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//解决乱码问题
    	request.setCharacterEncoding("utf-8");
    	
    	NewsDetailService service=new NewsDetailServiceImpl();
    				
    	//创建一个新闻对象
    	News_Detail detail=new News_Detail();
    	//获取表单中的新闻信息
    	detail.setAuthor(request.getParameter("author"));
    	detail.setTitle(request.getParameter("title"));
    	detail.setSummary(request.getParameter("summary"));
    	detail.setContent(request.getParameter("content"));
    	detail.setCreateDate(new Date());
    	
    	boolean flag=service.addNews(detail);
    	if(flag){//新增成功
    		response.sendRedirect("listServlet");
    	}else{
    		response.sendRedirect("add.jsp");
    	}
	}
	}


