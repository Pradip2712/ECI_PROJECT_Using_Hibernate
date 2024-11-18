package com.pdp.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pdp.entity.Candidate;

public class Utility {

	public static Session hiber() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		return session;

	}

}
