package edu.pitt.finalProject;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.pitt.finalProject.entity.UserEntity;

@Stateless
public class UserFacade {

	@PersistenceContext(unitName="finalProject")
	private EntityManager em;

	public UserFacade(){
		super();
	}

	//
	public UserEntity checkCredentials(String username, String password){
		Query query = em.createQuery("SELECT b FROM UserEntity b WHERE b.username=" + username + " AND b.password=" + password);
		UserEntity user = null;
		try {
			user = (UserEntity) query.getSingleResult();
		} catch(NoResultException e){
			System.out.println("User not found");
		}
		return user;
	}
}