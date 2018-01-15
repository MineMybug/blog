package blog.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import blog.ssm.service.BloggerService;

/**
* @author rh
* @version 创建时间：2017年8月9日 下午10:31:54
*/
@Controller  //注册为bean容器
public class BloggerController {
	
	@Autowired
	private BloggerService bloggerService;
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
	
	@ResponseBody
	@RequestMapping("/testTransactional")
	public String testTransactional(){
		
		bloggerService.insertBloggerParent();
//		bloggerService.insertBloggerChild();
		return "testTransactional";
	}

}
