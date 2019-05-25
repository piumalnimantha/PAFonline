package com.joseph.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joseph.model.Shipping;
import com.joseph.service.ShippingService;
@Service
public class ShippingServiceImpl implements ShippingService {

	private Shipping shippingDao;
	
	
	@Transactional
	public void add(Shipping shipping) {
		shippingDao.add(shipping);
	}

	@Transactional
	public void edit(Shipping shipping) {
		shippingDao.edit(shipping);
	}

	@Transactional
	public void delete(int shippingId) {
		shippingDao.delete(shippingId);
	}

	@Transactional
	public Shipping getShipping(int shippingId) {
		return shippingDao.getShipping(shippingId);
	}

	@Transactional
	public List getAllShipping() {
		return shippingDao.getAllShipping();
	}

}
