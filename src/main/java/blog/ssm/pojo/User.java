package blog.ssm.pojo;

import org.springframework.stereotype.Component;

/** 
 * @author  阮航  
 * @date 创建时间：2018年3月1日 下午2:29:19 
 * @version 1.0 
*/
@Component
public class User {
	
	//主键
    private String id;
    //用户名
    private String userName;
	
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + "]";
	}  

}
