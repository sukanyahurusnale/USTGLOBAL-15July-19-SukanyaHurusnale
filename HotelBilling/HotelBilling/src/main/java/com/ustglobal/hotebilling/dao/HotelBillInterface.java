package com.ustglobal.hotebilling.dao;

import com.ustglobal.hotelbilling.beans.Hotel_Bill;

public interface HotelBillInterface {
	public void showAllItems();

	public void takeOrder();

	public void operateOnFood();

	public void addFoodItem();

	public void removeFoodItem();

	public void modifyFoodItem();

	public void totalBill();

}
