package com.joseph.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.joseph.dao.ShippingDao;
import com.joseph.model.Shipping;

@Repository
public class ShippingDaoImpl implements ShippingDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Shipping shipping) {
		session.getCurrentSession().save(shipping);
	}

	@Override
	public void edit(Shipping shipping) {
		session.getCurrentSession().update(shipping);
	}

	@Override
	public void delete(int shippingId) {
		session.getCurrentSession().delete(getShipping(shippingId));
	}

	@Override
	public Shipping getShipping(int shippingId) {
		return (Shipping)session.getCurrentSession().get(Shipping.class, shippingId);
	}

	@Override
	public List getAllShipping() {
		return session.getCurrentSession().createQuery("from Shipping").list();
	}

}
