package com.test.mongo.java.mongoJavaTest;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 * @author KARAN KRISHAN
 *
 */
public class MongoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MongoClient mongoClient = null;
		try {
			mongoClient = new MongoClient("localhost",27017);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		DB db = mongoClient.getDB("test");
		DBCollection collection = db.getCollection("test_collection");

		BasicDBObject basicDBObject = new BasicDBObject();
		basicDBObject.append("company", "society generale").
		append("address", "whitefield");
		collection.insert(basicDBObject);
		
		DBCursor find = collection.find();
		
		for (DBObject dbObject : find) {
			System.out.println(dbObject);
		}
	}
	
}
