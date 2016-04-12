package com.yryj.dao;

import com.yryj.model.Utu;

public interface UtuDao {
	public void save(Utu utu);

	public void delete(Utu utu);

	public void update(Utu utu);

	public Utu find(Utu utu);
}
