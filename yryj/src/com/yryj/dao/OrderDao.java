package com.yryj.dao;

import com.yryj.model.Order;

public interface OrderDao {
	public void save(Order order);

	public void delete(int id);

	public void update(Order order);

	public Order find(int id);
}
