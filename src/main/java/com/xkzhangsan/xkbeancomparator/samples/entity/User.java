package com.xkzhangsan.xkbeancomparator.samples.entity;

import java.math.BigDecimal;

public class User {
	Integer id;
	String name;
	private BigDecimal point;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPoint() {
		return point;
	}
	public void setPoint(BigDecimal point) {
		this.point = point;
	}
	

}
