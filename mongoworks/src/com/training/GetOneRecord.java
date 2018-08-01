package com.training;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class GetOneRecord {
public static void main(String[] args) {
	MongoClient mongoClient = new  MongoClient("localhost",27017);
	
	DB db = mongoClient.getDB("exdb");
	
	DBCollection dbc = db.getCollection("emps");
	
	DBObject myObj = dbc.findOne();
	
	System.out.println("Employee ID"+myObj.get("empid"));
	System.out.println("Employee Name"+myObj.get("empnm"));
}
}
