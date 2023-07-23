package com.study.mybatis.model;

public class Authority {
	private Long id;
	private String authorityName;

	public Authority() {
		super();
	}

	public Authority(Long id, String authorityName) {
		super();
		this.id = id;
		this.authorityName = authorityName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthorityName() {
		return authorityName;
	}

	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}

}
