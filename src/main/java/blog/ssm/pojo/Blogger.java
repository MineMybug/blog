package blog.ssm.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by rh on 2017/8/8.
 * @author rh
 * @Description ������Ϣʵ����
 */
@Component  //ע��bean Ϊspring��������
public class Blogger implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8215992911553328342L;
	private Integer id;
    private String userName;    //�û���
    private String password;    //����
    private String profile;     //������Ϣ
    private String nickName;    //�ǳ�
    private String sign;        //����ǩ��
    private String imageName;   //ͼƬ·��

    public Blogger(String userName, String password, String profile, String nickName, String sign, String imageName) {
        this.userName = userName;
        this.password = password;
        this.profile = profile;
        this.nickName = nickName;
        this.sign = sign;
        this.imageName = imageName;
    }

    public Blogger() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "Blogger{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", profile='" + profile + '\'' +
                ", nickName='" + nickName + '\'' +
                ", sign='" + sign + '\'' +
                ", imageName='" + imageName + '\'' +
                '}';
    }
}