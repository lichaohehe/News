package cn.bdqn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.bdqn.service.NewsDetailService;
import cn.bdqn.service.impl.NewsDetailServiceImpl;
@WebServlet(name="delServlet",value="/delServlet")
public class DelServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	  	String id =request.getParameter("id");
	    
    	NewsDetailService service=new NewsDetailServiceImpl();
    	int num = Integer.parseInt(id);
		num = service.DelByNewsDetailId(num);
    	
    	if(num>0){//删除成功
    		response.sendRedirect("listServlet");
    	}else{
    		System.out.print("删除失败");
    	}
	}

}
