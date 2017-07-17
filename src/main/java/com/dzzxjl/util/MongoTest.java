package com.dzzxjl.util;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dzzxjl on 2017/7/13.
 */
public class MongoTest {
    public static void main(String[] args) {
        try{
            // To connect to mongodb server
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            // Now connect to your databases
            MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
//            mongoClient.getDatabase("test").getCollection()
            System.out.println("Connect to database successfully");
//            MongoCollection<Document> coll = mongoDatabase.getCollection("mycol");
//            mongoDatabase.createCollection("newcol");
            MongoCollection<Document> newcoll = mongoDatabase.getCollection("newcoll");
            Document document = new Document("name","yanghaoyu")
                    .append("sex","male")
                    .append("age",22);
            List<Document> documents = new ArrayList<Document>();
            documents.add(document);
            newcoll.insertMany(documents);
            System.out.println("success!");

        }catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }
}
