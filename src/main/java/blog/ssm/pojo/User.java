package blog.ssm.pojo;

import org.springframework.stereotype.Component;

/** 
 * @author  �  
 * @date ����ʱ�䣺2018��3��1�� ����2:29:19 
 * @version 1.0 
*/
@Component
public class User {
	
	//����
    private String id;
    //�û���
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
