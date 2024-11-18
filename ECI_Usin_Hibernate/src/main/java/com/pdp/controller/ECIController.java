package com.pdp.controller;

import java.util.List;
import java.util.Set;

import com.pdp.entity.Candidate;
import com.pdp.service.Service;

public class ECIController {

	Service s;

	public String insertCandidate(Candidate obj) {
		s = new Service();
		String res = s.insertCandidate(obj);
		return res;
	}

	public  List<Candidate> getCandidate() {
		s = new Service();
		 List<Candidate>loc = s.getCandidate();
		return loc;
	}

	public String updateCandidate(Candidate obj) {
		s = new Service();
		String res = s.updateCandidate(obj);
		return res;
	}

	public String deleteCandidate(int id) {
		s=new Service();
		String res=s.deleteCandidate(id);
		return res;
	}

	public Set<String> getAllParty() {
		s=new Service();
		Set<String> ap=s.getAllParty();
		return ap;
	}

	public Set<String> getAllAssembly() {
		s=new Service();
		Set<String> AllAssembly=s.getAllAssembly();
		return AllAssembly;
	}

	public List<Candidate> getCandidateByParty(String pname) {
		s=new Service();
		List<Candidate> CBUP=s.getAllCandidateByParty(pname);
		return CBUP;
	}

	public List<Candidate> getCandidateByState(String sname) {
		s=new Service();
		List<Candidate> CBUS=s.getCandidateByState(sname);
		return CBUS;
	}

	public List<Candidate> getCandidateById(int cid) {
		s=new Service();
		List<Candidate> loc=s.getCandidateById(cid);
		return loc;
	}

}
