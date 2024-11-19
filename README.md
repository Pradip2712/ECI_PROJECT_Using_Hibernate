# **ECI Client Project**  
**Election Commission of India (ECI) Candidate Management System**

## **Table of Contents**
- Candidate id
- Candidate Name
- Candidate Gender
- Candidate Party
- Candidate State
- Candidate Assembly
- Candidate Age


---

## **Project Overview**
The **ECI Client Project** is a comprehensive application to manage candidate information for the Election Commission of India (ECI). It supports basic CRUD (Create, Read, Update, Delete) operations along with advanced filtering and sorting options, enabling seamless management of candidate data by state, party, and assembly.

---

## **Features**
- **Add Candidate:** Register a new candidate with detailed information such as name, gender, party, state, assembly, and age.
- **View Candidates:**  
  - View all candidates.  
  - Filter candidates by party or state.  
  - View candidate details by ID.  
- **Update Candidate:** Modify existing candidate details.
- **Delete Candidate:** Remove a candidate from the database.
- **Additional Utilities:**  
  - Retrieve a list of all parties or assemblies available.  
  - Validation for ensuring accurate data entry.

---

## **Tech Stack**
- **Programming Language:** Java  
- **Framework:** Hibernate (ORM)  
- **Database:** MySQL  
- **Tools/IDE:** IntelliJ IDEA/Eclipse  
- **Build Tool:** Maven (if applicable)

---

## **Folder Structure**
```plaintext
src/
├── com/pdp/
│   ├── client/           # Main client application
│   ├── controller/       # Handles interaction between client and service
│   ├── dao/              # Data Access Object for database operations
│   ├── entity/           # Hibernate Entity classes
│   ├── service/          # Business logic implementation
│   └── utility/          # Hibernate utility configuration
└── resources/
    ├── hibernate.cfg.xml # Hibernate configuration file
    └── logback.xml       # Logging configuration (if applicable)
