package blog.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @author rh
* @version 创建时间：2017年8月9日 下午10:31:54
*/
@Controller  //注册为bean容器
public class BloggerController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}

}
