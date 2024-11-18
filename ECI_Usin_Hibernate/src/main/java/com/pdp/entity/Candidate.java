package com.pdp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidate {

	@Id
	private int CId;
	private String Name;
	private String Gender;
	private String Party;
	private String State;
	private String Assembly;
	private int Age;

	public Candidate() {
		super();
	}

	public Candidate(int cId, String name, String gender, String party, String state, String assembly, int age) {
		super();
		CId = cId;
		Name = name;
		Gender = gender;
		Party = party;
		State = state;
		Assembly = assembly;
		Age = age;
	}

	public int getCId() {
		return CId;
	}

	public void setCId(int cId) {
		CId = cId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getParty() {
		return Party;
	}

	public void setParty(String party) {
		Party = party;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getAssembly() {
		return Assembly;
	}

	public void setAssembly(String assembly) {
		Assembly = assembly;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Candidate [Name=" + Name + ", Gender=" + Gender + ", Party=" + Party + ", State=" + State
				+ ", Assembly=" + Assembly + ", Age=" + Age + "]";
	}

}
