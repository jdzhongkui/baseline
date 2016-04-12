package com.yryj.sercvice;

import java.util.List;

import com.yryj.model.Utc;

public interface UtcManager {
	public void save(Utc utc);

	public void delete(Utc utc);

	public void update(Utc utc);

	public List<?> find(int id);
}