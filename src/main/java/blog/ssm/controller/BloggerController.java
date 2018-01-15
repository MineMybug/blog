package blog.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import blog.ssm.service.BloggerService;

/**
* @author rh
* @version ����ʱ�䣺2017��8��9�� ����10:31:54
*/
@Controller  //ע��Ϊbean����
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
