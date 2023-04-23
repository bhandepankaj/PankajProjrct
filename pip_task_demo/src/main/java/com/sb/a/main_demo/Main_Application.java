package com.sb.a.main_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* 
	PROJECT TASK TO PANKAJ BAHNDE
 
Create a REST API having user management features: 
1) These APIs should be secured by spring security with auth token, this token can be obtained by proper valid username password authentication. 
2) The application should have 2 types of users admin and user, as per user type they should have authorization rights. 
3) create separate API that will achieve all CRUD operations with MySQL database. Use any dummy data for the same. 
4) Admin can create, delete and update user details. 
5) Normal user can only see the user details. 
6) Create design document and API 

*/


@SpringBootApplication
public class Main_Application {

	public static void main(String[] args) {
		SpringApplication.run(Main_Application.class, args);
		
		System.out.println("This is SpringBoot Project");
	}
}