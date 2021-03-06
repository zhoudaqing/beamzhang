package com.cm.manage.model.account;

import java.io.Serializable;
import java.util.Date;

/**
 * 作者: 邓玉明 时间：14-1-8 下午5:33 邮箱：cndym@163.com
 */
public class BindFillBank implements Serializable {
	private static final long serialVersionUID = 4088456722475332826L;
	private Long id;
	private String userCode;
	private String province;// 省
	private String city;// 市
	private String subBank;// 支行
	private String bankName;// 绑定银行
	private String bankCode;// 绑定账号
	private Integer easyFlag;// 0 否 1 是
	private Date createTime;
	private Date updateTime;
	
	private String userName;

	public BindFillBank() {
	}

	public BindFillBank(Long id, String userCode, String province, String city, String subBank, String bankName, String bankCode, Integer easyFlag, Date createTime, Date updateTime) {
		this.id = id;
		this.userCode = userCode;
		this.province = province;
		this.city = city;
		this.subBank = subBank;
		this.bankName = bankName;
		this.bankCode = bankCode;
		this.easyFlag = easyFlag;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSubBank() {
		return subBank;
	}

	public void setSubBank(String subBank) {
		this.subBank = subBank;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public Integer getEasyFlag() {
		return easyFlag;
	}

	public void setEasyFlag(Integer easyFlag) {
		this.easyFlag = easyFlag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
