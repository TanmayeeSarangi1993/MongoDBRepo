package com.training;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class StoreEmployeeRecord {
	public static void main(String[] args) {
		  MongoClient mongoClient = new  MongoClient("localhost",27017);
		  

			DB db = mongoClient.getDB("exdb");
			
			DBCollection dbc = db.getCollection("emps");
			
			
			DBObject object = new BasicDBObject();
			object.put("empid", 301);
			object.put("empnm", "kavitha");
			
		//	dbc.save(object);
			System.out.println("Object saved");
			
			
		//	dbc.find().forEach(System.out::println);
			
			//2nd way
			Map<String, Object> map = new HashMap<>();
			map.put("empid",302);
			map.put("empnm", "rupa");
			//dbc.save(new BasicDBObject(map));
			//dbc.find().forEach(System.out::println);
			
			
			//3rd way
			
			String jsonString = "{empid:302,empnm:'sid'}";
		//	dbc.save((DBObject)JSON.parse(jsonString));
			System.out.println("object saved");
			//dbc.find().forEach(System.out::println);
			
			
			//4th way
			Employee employee = new Employee();
			employee.setEmpid(102);
			employee.setEmpnm("anuj");
			dbc.save(employee);
			
			System.out.println("Object saved......");
			dbc.find().forEach(System.out::println);
			
			
			
			
			
			
}
}
