package com.training;

import java.util.HashMap;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class GetQueryData {
	 public static void main(String[] args) {
		  MongoClient mongoClient = new  MongoClient("localhost",27017);
		  

			DB db = mongoClient.getDB("exdb");
			
			DBCollection dbc = db.getCollection("emps");
			
			DBObject queryCondition = new BasicDBObject("empid",4);
			DBObject sortCondition = new BasicDBObject("empnm",-1);
			HashMap<String,Integer> map = new  HashMap<>();
			map.put("empnm", 1);
			map.put("_id",0);
			DBObject proCondition = new BasicDBObject(map);
			DBCursor cursor = dbc.find(queryCondition,proCondition).sort(sortCondition).limit(4);
			
			
			while(cursor.hasNext()) {
				DBObject object = cursor.next();
				System.out.println(JSON.serialize(object));

				
		//	System.out.println("Employee ID"+object.get("empid"));
		//	System.out.println("Employee Name"+object.get("empnm"));
		//	System.out.println("--------------");
			}
		  
		  
	}
	}

