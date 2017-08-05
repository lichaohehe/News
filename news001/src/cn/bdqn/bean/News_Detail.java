package cn.bdqn.bean;

import java.util.Date;

public class News_Detail {
	private Integer id;
	private Integer categoryId;
	private String title;
	private String summary;
	private String content;
	private String picPath;
	private String author;
	private Date createDate;
	private Date modifyDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public News_Detail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public News_Detail(Integer id, Integer categoryId, String title,
			String summary, String content, String picPath, String author,
			Date createDate, Date modifyDate) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.picPath = picPath;
		this.author = author;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
	}
	@Override
	public String toString() {
		return "News_Detail [id=" + id + ", categoryId=" + categoryId
				+ ", title=" + title + ", summary=" + summary + ", content="
				+ content + ", picPath=" + picPath + ", author=" + author
				+ ", createDate=" + createDate + ", modifyDate=" + modifyDate
				+ "]";
	}
	
	
	
}
