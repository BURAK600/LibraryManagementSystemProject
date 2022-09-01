package com.bilgeadam.repository;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.bilgeadam.entity.User;
import com.bilgeadam.utility.MyFactoryRepository;

public class UserRepository extends MyFactoryRepository<User, Long> {

	public UserRepository() {
		super(new User());

	}

	public User findByUserNameAndPassword(String userName, String password) {

		CriteriaQuery<User> criteria = getCriteriaBuilder().createQuery(User.class);

		Root<User> root = criteria.from(User.class);

		Predicate predicateUsername = (Predicate) getCriteriaBuilder().equal(root.get("username"), userName);
		Predicate predicatePasword = (Predicate) getCriteriaBuilder().equal(root.get("password"), password);

		criteria.select(root).where(getCriteriaBuilder().and(predicateUsername, predicatePasword));

		User user = getEntityManager().createQuery(criteria).getSingleResult();
		return user;

	}

}
