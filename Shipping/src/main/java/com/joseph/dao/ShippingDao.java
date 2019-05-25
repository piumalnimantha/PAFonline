package com.joseph.dao;

import java.util.List;

import com.joseph.model.Shipping;

public interface ShippingDao {
	public void add(Shipping shipping);
	public void edit(Shipping shipping);
	public void delete(int shippingId);
	public Shipping getShipping (int shippingId);
	public List getAllShipping();
}
