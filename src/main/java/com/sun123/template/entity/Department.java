package com.sun123.template.entity;

public class Department {
	private Integer deptId;

	private String deptName;

	// 一旦生成有参的构造器，那么就一定要生成有参的构造器
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Integer deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName == null ? null : deptName.trim();
	}
}