package com.arun.order.bo;

import com.arun.order.bo.exception.BOException;
import com.arun.order.dto.Order;

public interface OrderBO {

	boolean placeOrder(Order order) throws BOException;

	boolean cancelOrder(int id) throws BOException;

	boolean deleteOrder(int id) throws BOException;

}
