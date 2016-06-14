package com.yryj.model;

// Generated 2016-4-26 12:25:28 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Indexed;
import com.google.code.morphia.utils.IndexDirection;

/**
 * Type generated by hbm2java
 */
public class Activity implements java.io.Serializable {
	@Id
	@Indexed(value=IndexDirection.ASC, name="id", unique=true, dropDups=true) 
	private long id;
	
	
	private String name;
	private String pic;
	private String owner;
	private String url;
	
	//state 为1 的时候表示在进行中，为0的时候为关闭  默认为1
	private int state;
	
	public Activity(){
		state=1;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
	
	
}
