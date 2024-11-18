package com.pdp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pdp.entity.Candidate;
import com.pdp.utility.Utility;

public class Dao {



//	insert method for inserting a data
	public String insertCandidate(Candidate obj) {
		Session session=Utility.hiber();
		Transaction tx = session.beginTransaction();
		session.save(obj);
		tx.commit();
		session.close();
		String res = "data inserted successfully...";
		return res;
	}

//	get candidate method for 
	public List<Candidate> getCandidate() {
		Session session=Utility.hiber();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(Candidate.class);
		@SuppressWarnings("unchecked")
		List<Candidate> loc=criteria.list();
		return loc;
	}

//	update method for updating a existing candidate information
	public String updateCandidate(Candidate obj) {
		Session session=Utility.hiber();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(obj);
		tx.commit();
		session.close();
		String res = "Candidate Updated successfully...";
		return res;
	}

//	it is delete method for  deleting a existing record
	public String deleteCandidate(int id) {
		Session session=Utility.hiber();
		Transaction tx = session.beginTransaction();
		Candidate candidate = session.get(Candidate.class, id);
		session.delete(candidate);
		tx.commit();
		session.close();
		String res="Candidate Deleted successfully...";
		return res;
	}

}
