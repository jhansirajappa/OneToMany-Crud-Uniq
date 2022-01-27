package com.ty.onetomany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.dao.OrderDao;
import com.ty.onetomany.dto.AmazonOrder;
import com.ty.onetomany.dto.Item;

public class AmazonController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("onetomany");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
//
//		AmazonOrder amazonOrder=new AmazonOrder();
//		amazonOrder.setId(1);
//		amazonOrder.setAddress("CTA");
//
//		Item item1=new Item();
//		item1.setId(1);
//		item1.setName("Crackers");
//		item1.setPrice(500);
//
//		Item item2=new Item();
//		item2.setId(2);
//		item2.setName("Teddy");
//		item2.setPrice(750);
//		
//		List<Item> items=new ArrayList();
//		/items.add(item1);
//		items.add(item2);
//		
//		amazonOrder.setItems(items);
		
		OrderDao dao=new OrderDao();
		dao.getOrder(1);
		
		entityTransaction.commit();
	}

}
