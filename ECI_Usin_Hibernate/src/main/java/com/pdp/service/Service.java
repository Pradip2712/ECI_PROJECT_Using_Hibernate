package com.pdp.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.pdp.dao.Dao;
import com.pdp.entity.Candidate;

public class Service {

	Dao d;

//	it is use for pass the data calling method to call method
	public String insertCandidate(Candidate obj) {
		d = new Dao();
		String res = d.insertCandidate(obj);
		return res;
	}

//	in this method we get all candidate from dao class and pass to calling method.
	public List<Candidate> getCandidate() {
		d = new Dao();
		List<Candidate> loc = d.getCandidate();
		return loc;
	}

//	in this method we sort all party name and pass that party name to user
	public Set<String> getAllParty() {
		d = new Dao();
		List<Candidate> loc = d.getCandidate();
		Set<String> allparty = new HashSet<String>();
		for (Candidate candidate : loc) {
			allparty.add(candidate.getParty().toUpperCase());
		}
		return allparty;
	}

//	in this method we sort all assembly name and pass that assembly name to user.
	public Set<String> getAllAssembly() {
		d = new Dao();
		List<Candidate> loc = d.getCandidate();
		Set<String> AllAss = new HashSet<String>();
		for (Candidate candidate : loc) {
			AllAss.add(candidate.getAssembly().toUpperCase());
		}
		return AllAss;
	}

	/*
	 * in this method we get candidate party name and check candidate of that party
	 * is present or not in our database, if present then we return the information
	 * about that's candidate's to user, else return nothing.
	 */
	public List<Candidate> getAllCandidateByParty(String pname) {
		d = new Dao();
		List<Candidate> loc = d.getCandidate();
		List<Candidate> CBUP = new ArrayList<Candidate>();
		for (Candidate candidate : loc) {
			if (candidate.getParty().equalsIgnoreCase(pname)) {
				CBUP.add(candidate);
			}

		}
		return CBUP;
	}

	/*
	 * in this method we get candidate states from user and check candidate of that
	 * state is present or not in our database, if it is present then we return the
	 * information about that candidate to user, else return nothing.
	 */

	public List<Candidate> getCandidateByState(String sname) {
		d = new Dao();
		List<Candidate> loc = d.getCandidate();
		List<Candidate> CBUS = new ArrayList<Candidate>();
		for (Candidate candidate : loc) {
			if (candidate.getState().equalsIgnoreCase(sname)) {
				CBUS.add(candidate);
			}
		}
		return CBUS;
	}

	/*
	 * in this method we get candidate id from user and check that candidate is
	 * present or not in our database, if it is present then we return the
	 * information about that candidate to user, else return nothing.
	 */
	public List<Candidate> getCandidateById(int cid) {
		d = new Dao();
		List<Candidate> loc = d.getCandidate();
		List<Candidate> locandi = new ArrayList<Candidate>();
		for (Candidate candidate : loc) {
			if (candidate.getCId() == cid) {
				locandi.add(candidate);
			}

		}
		return locandi;
	}

	/*
	 * in this method we get all information of candidate from user and check the
	 * candidate id is present or not if present, then it go to updateCandidate
	 * method of dao class and update the candidate information, if not present it
	 * will return to calling method of with msg of id is not found
	 */
	public String updateCandidate(Candidate obj) {
		d = new Dao();
		int count = 0;
		String res = null;
		List<Candidate> loc = d.getCandidate();
		for (Candidate candidate : loc) {
			if (candidate.getCId() == obj.getCId()) {
				res = d.updateCandidate(obj);
				count++;
			}
		}
		if (count == 0) {
			res = "Candidate Id is not found in table...";
		}
		return res;
	}

	/*
	 * in this method we get candidate id from user and check the candidate id is
	 * present or not, if present then it will go to deleteCandidate method and
	 * delete this candidate information from the database, but id is not present in
	 * database it will go return to calling method with msg id is not found.
	 */
	public String deleteCandidate(int id) {
		d = new Dao();
		int ch = 0;
		String res = null;
		List<Candidate> loc = d.getCandidate();
		for (Candidate candidate : loc) {
			if (candidate.getCId() == id) {
				res = d.deleteCandidate(id);
				ch++;
			}
		}
		if (ch == 0) {
			res = "Candidate Id is not found in table..";
		}
		return res;
	}

}
