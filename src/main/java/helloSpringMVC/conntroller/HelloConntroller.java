package helloSpringMVC.conntroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloConntroller extends AbstractController{

	//重写AbstractController类中的handleRequestInternal方法 并返回一个 ModelAndView 类型的对象
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		//获取post请求中的hello值
		String hello = request.getParameter("hello");
		//new一个ModelAndView对象并说明响应view的名字
		ModelAndView mav = new ModelAndView("requestView");
		//传递一个键为hw 值为变量hello的值的对象
		mav.addObject("hw", hello);
		
		return mav;
	}

}
