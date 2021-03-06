package model;

public class Order {

	private Integer id;
	private Integer status;//订单状态（0：待付款 1：待发货 2：待收货）
	private java.util.Date createTime;//订单生成时间
	private java.lang.String address;//送货地址
	private java.lang.String personName;//收货人
	private Integer userId;//用户id
	private Integer phone;//联系电话
	private Double amount;//订单金额
	
	
	public Order() {
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public java.util.Date getCreateTime() {
		return createTime;
	}


	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}


	public java.lang.String getAddress() {
		return address;
	}


	public void setAddress(java.lang.String address) {
		this.address = address;
	}


	public java.lang.String getPersonName() {
		return personName;
	}


	public void setPersonName(java.lang.String personName) {
		this.personName = personName;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public Integer getPhone() {
		return phone;
	}


	public void setPhone(Integer phone) {
		this.phone = phone;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
