package com.ty.onetomany.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.AmazonOrder;
import com.ty.onetomany.dto.Item;

public class OrderDao {
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	private EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("onetomany");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		return entityManager;
	}

	public AmazonOrder getOrder(int id) {
		entityManager=getEntityManager();
		entityTransaction.begin();
		AmazonOrder amazonOrder=entityManager.find(AmazonOrder.class,id);
		return amazonOrder;
	}

	public void save(AmazonOrder amazonOrder) {
		entityManager=getEntityManager();
		entityTransaction.begin();
		entityManager.persist(amazonOrder);
		entityTransaction.commit();	
	}

	public void addItemsToOrder(int id,List<Item> item) {
		entityManager=getEntityManager();
		entityTransaction.begin();
		AmazonOrder amazonOrder=entityManager.find(AmazonOrder.class,id);
		List<Item> items=amazonOrder.getItems();
		items.addAll(item);

		entityManager.merge(amazonOrder);
		entityTransaction.commit();
	}

	public void deleteOrder(int id) {
		entityManager=getEntityManager();
		entityTransaction.begin();
		AmazonOrder amazonOrder=entityManager.find(AmazonOrder.class,id);
		if(amazonOrder!=null) {	
			entityManager.remove(amazonOrder);
		}
		entityTransaction.commit();
	}

}
