package cn.bdqn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.bdqn.bean.News_Detail;
import cn.bdqn.service.NewsDetailService;
import cn.bdqn.service.impl.NewsDetailServiceImpl;
@WebServlet(name="findServlet",value="/findServlet")
public class FindServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		NewsDetailService service=new NewsDetailServiceImpl();
		
		//获取a标签传过来的id
		String id=request.getParameter("id");
		News_Detail detail=service.findById(id);
		/**
		 * 已经拿到detail对象
		 * 为了数据的回显！ 必须把对象放进作用域
		 */
		request.setAttribute("detail", detail);
		//转发到真正的修改页面
		request.getRequestDispatcher("update.jsp").forward(request, response);
		
	}

}
