package blog.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @author rh
* @version ����ʱ�䣺2017��8��9�� ����10:31:54
*/
@Controller  //ע��Ϊbean����
public class BloggerController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}

}
