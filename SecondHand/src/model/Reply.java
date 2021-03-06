package model;

import java.util.Date;

public class Reply {

	private Integer id;
	private Integer commentId;//评论id
	private Integer userId;//回复者id
	private Date createTime;//回复时间
	private java.lang.String reply;//回复内容
	private User user;
	private Comment comment;
	public Reply() {

	}
	
	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getCommentId() {
		return commentId;
	}
	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public java.lang.String getReply() {
		return reply;
	}
	public void setReply(java.lang.String reply) {
		this.reply = reply;
	}
	
	
}
