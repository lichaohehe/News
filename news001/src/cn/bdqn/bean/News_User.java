package cn.bdqn.bean;

public class News_User {
	
	private Integer id;				
	private String userName;	
	private String password;	
	private String email;		
	private Integer userType;		
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	public News_User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public News_User(Integer id, String userName, String password,
			String email, Integer userType) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "News_User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", email=" + email + ", userType=" + userType
				+ "]";
	}
	
	
	
	
}
