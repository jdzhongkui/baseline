package com.yryj.model;

// Generated 2016-4-21 11:17:52 by Hibernate Tools 4.0.0

/**
 * Type generated by hbm2java
 */
public class Type implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String type;
	private String style;
	private String length;

	public Type() {
	}

	public Type(String type) {
		this.type = type;
	}

	public Type(String type, String style, String length) {
		this.type = type;
		this.style = style;
		this.length = length;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getLength() {
		return this.length;
	}

	public void setLength(String length) {
		this.length = length;
	}

}
