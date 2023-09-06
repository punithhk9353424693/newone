package com.jspider.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.jspider.dto.User;

@Repository
public class UserRepo {
	@Autowired
	User user;
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void saveUser(@RequestBody User user) {
		et.begin();
		em.persist(user);
		et.commit();
	}
   public User find(User user) {
	   et.begin();
	  User u= em.find(User.class, user.getId());
	   return u;
   }
}
