package cn.bdqn.test;

import cn.bdqn.bean.News_Detail;
import cn.bdqn.service.NewsDetailService;
import cn.bdqn.service.impl.NewsDetailServiceImpl;

public class Test {
	public static void main(String[] args) {
		/*UserService service=new UserServiceImpl();
		News_User user=service.login("admin", "admin");
		System.out.println(user);*/
		News_Detail detail=new News_Detail();
		detail.setTitle("测试新增是否成功");
		detail.setAuthor("test");
		detail.setContent("新增");
		NewsDetailService service=new NewsDetailServiceImpl();
		service.addNews(detail);
	}
}
