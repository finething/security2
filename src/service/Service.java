package service;


import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dao.Dao;
import data.User;

public class Service {
	
	private Dao dao;

	
	
	public Service() {
		
	}

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	@Transactional(propagation=Propagation.REQUIRES_NEW)      //Every opertation with a data base need to be with in
	public void saveUser(User user){                          // a transaction
		dao.saveUser(user);									//@Transactional needs to be from springframework
	}

}
