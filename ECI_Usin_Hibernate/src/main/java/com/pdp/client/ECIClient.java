package com.pdp.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.pdp.controller.ECIController;
import com.pdp.entity.Candidate;

public class ECIClient {

	static ECIController controller;
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {

		int choice = 0;
		do {

			System.out.println("+======================+");
			System.out.println("|         MENU         |");
			System.out.println("|======================|");
			System.out.println("| 1. Insert Candidate  |");
			System.out.println("|----------------------|");
			System.out.println("| 2. View Candidates   |");
			System.out.println("|----------------------|");
			System.out.println("| 3. Update Candidate  |");
			System.out.println("|----------------------|");
			System.out.println("| 4. Delete Candidate  |");
			System.out.println("|----------------------|");
			System.out.println("| 5. Exit...           |");
			System.out.println("+======================+");

			System.out.println("Enter your choice : ");
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("enter only numeric value : ");
				break;
			}

			switch (choice) {
			case 1: {

				controller = new ECIController();
				int cid = 0, age = 0;
				String name = null, gen = null, pa = null, state = null, ass = null;
				try {
					System.out.println("enter candidate id ");
					cid = sc.nextInt();
					System.out.println("enter candidate name ");
					name = br.readLine();
					System.out.println("enter candidate gender");
					gen = br.readLine();
					System.out.println("enter candidatte party");
					pa = br.readLine();
					System.out.println("enter candidate state");
					state = br.readLine();
					System.out.println("enter candidate assembly");
					ass = br.readLine();
					System.out.println("entery candidate age ");
					age = sc.nextInt();

				} catch (Exception e) {
					System.out.println("Please enter valid input ");
				}

				Candidate obj = new Candidate(cid, name, gen, pa, state, ass, age);
				String res = controller.insertCandidate(obj);
				System.out.println(res);

				break;
			}
			case 2: {
				controller = new ECIController();
				int ch = 0;

				do {
					System.out.println("+=================================+");
					System.out.println("|           View Menu             |");
					System.out.println("|=================================|");
					System.out.println("| 1. View All Candidates          |");
					System.out.println("|---------------------------------|");
					System.out.println("| 2. View All Party's             |");
					System.out.println("|---------------------------------|");
					System.out.println("| 3. View All Assembly            |");
					System.out.println("|---------------------------------|");
					System.out.println("| 4. View Candidate Party Wise    |");
					System.out.println("|---------------------------------|");
					System.out.println("| 5. View Candidate State Wise    |");
					System.out.println("|---------------------------------|");
					System.out.println("| 6. View Candidate info by id    |");
					System.out.println("|---------------------------------|");
					System.out.println("| 7. Exit...                      |");
					System.out.println("+=================================+");

					try {
						ch = sc.nextInt();
					} catch (Exception e) {
						System.out.println("Please enter only numeric numbers  ");
						break;
					}

					switch (ch) {
					case 1: {
						List<Candidate> loc = controller.getCandidate();
						for (Candidate candidate : loc) {
							System.out.println(candidate);
						}
						break;
					}
					case 2: {

						Set<String> ap = controller.getAllParty();
						for (String party : ap) {
							System.out.println("|--------------------|");
							System.out.printf("|    %-15s |\n",party);
						}
						System.out.println("----------------------");
						break;
					}
					case 3: {

						Set<String> AllAssembly = controller.getAllAssembly();
						for (String assembly : AllAssembly) {
							System.out.println("|-------------------------|");
							System.out.printf("|   %-20s  |\n",assembly);
						}
						System.out.println("---------------------------");
						break;
					}
					case 4: {
						System.out.println("Enter Party Name : ");
						String pname = null;
						try {
							pname = br.readLine();
						} catch (Exception e) {
							System.out.println("please enter valid input");
						}
						List<Candidate> CUPN = controller.getCandidateByParty(pname);
						for (Candidate candidate : CUPN) {
							System.out.println(candidate);
						}

						break;
					}
					case 5: {
						System.out.println("Enter State Name : ");
						String sname = null;
						try {
							sname = br.readLine();
						} catch (Exception e) {
							System.out.println("please enter valid input...");
						}
						List<Candidate> CBUS = controller.getCandidateByState(sname);
						for (Candidate candidate : CBUS) {
							System.out.println(candidate);
						}

						break;
					}
					case 6: {
						System.out.println("Enter Candidate id : ");
						int cid = 0;
						try {
							cid = sc.nextInt();
						} catch (Exception e) {
							System.out.println("please enter valid candidate id..");
						}
						List<Candidate> loc = controller.getCandidateById(cid);
						for (Candidate candidate : loc) {
							System.out.println(candidate);
						}

						break;
					}
					case 7: {

						break;
					}
					default: {
						System.out.println("Invalid Input...");
						break;
					}
					}

				} while (ch != 7);

				break;
			}
			case 3: {
				controller = new ECIController();
				int cid = 0, age = 0;
				String name = null, gen = null, pa = null, state = null, ass = null;
				try {
					System.out.println("enter candidate id ");
					cid = sc.nextInt();
					System.out.println("enter Updated candidate name ");
					name = br.readLine();
					System.out.println("enter Updated candidate gender");
					gen = br.readLine();
					System.out.println("enter Updated candidatte party");
					pa = br.readLine();
					System.out.println("enter Updated candidate state");
					state = br.readLine();
					System.out.println("enter Updated candidate assembly");
					ass = br.readLine();
					System.out.println("entery Updated candidate age ");
					age = sc.nextInt();
				} catch (Exception e) {
					System.out.println("please enter valid input ");
				}
				Candidate obj = new Candidate(cid, name, gen, pa, state, ass, age);
				String res = controller.updateCandidate(obj);
				System.out.println(res);
				break;
			}
			case 4: {
				controller = new ECIController();
				System.out.println("enter Candidate id");
				int id = 0;
				try {
					id = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Please enter only numuric numbers ");
				}
				String res = controller.deleteCandidate(id);
				System.out.println(res);

				break;
			}
			case 5: {
				System.out.println("Thank you for use our Application....");
				break;
			}
			default: {
				System.out.println("Invalid input...");
			}
			}

		} while (choice != 5);

	}

}
