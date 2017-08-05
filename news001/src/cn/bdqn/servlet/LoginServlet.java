package cn.bdqn.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.bdqn.bean.News_Detail;
import cn.bdqn.bean.News_User;
import cn.bdqn.service.NewsDetailService;
import cn.bdqn.service.UserService;
import cn.bdqn.service.impl.NewsDetailServiceImpl;
import cn.bdqn.service.impl.UserServiceImpl;
/**
 * 处理登录的  servlet
 * 
 * 01.获取login.jsp页面用户的输入
 * 02.调用对应service层的代码
 * 03.进行比对,给用户响应
 *    001.比对成功，进入main.jsp
 *    002.失败，返回login.jsp
 */
@WebServlet(name="LoginServlet",value="/loginServlet")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置编码格式
    	request.setCharacterEncoding("utf-8");
    	//获取前台用户输入
    	String username=request.getParameter("username");
    	String password=request.getParameter("password");
    	//调用service层
    	UserService service=new UserServiceImpl();
    	News_User user=service.login(username, password);//返回一个用户对象
    	//判断用户是否输入
    	if(user==null){
    		response.sendRedirect("login.jsp");//跳转到login.jsp
    	}else{
    		//把对象存储到session作用域
    		request.getSession().setAttribute("user", user);
    		response.sendRedirect("listServlet");
    	}
    	
	}

}
