package com.yryj.model;

// Generated 2016-4-21 11:17:52 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Story generated by hbm2java
 */
public class Story implements java.io.Serializable {

	private Integer id;
	private Chapter chapter;
	private Integer type;
	private Date date;
	private Set utses = new HashSet(0);

	public Story() {
	}

	public Story(Chapter chapter, Integer type, Date date) {
		this.chapter = chapter;
		this.type = type;
		this.date = date;
	}

	public Story(Chapter chapter, Integer type, Date date, Set utses) {
		this.chapter = chapter;
		this.type = type;
		this.date = date;
		this.utses = utses;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Chapter getChapter() {
		return this.chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set getUtses() {
		return this.utses;
	}

	public void setUtses(Set utses) {
		this.utses = utses;
	}

}
