package com.dzzxjl.service;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/**
 * Created by dzzxjl on 2017/7/13.
 */
public class MongoTest {
    public static void main(String[] args) {
        try{
            // To connect to mongodb server
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            // Now connect to your databases
            DB db = mongoClient.getDB( "test" );
            System.out.println("Connect to database successfully");
//            boolean auth = db.authenticate(myUserName, myPassword);
//            System.out.println("Authentication: "+auth);
//            DBCollection coll = db.createCollection("newcol",);
            DBCollection coll = db.getCollection("mycol");
            DBCursor cursor = coll.find();
            int i = 0;
            while (cursor.hasNext()) {
                System.out.println("Updated Document: "+i);
                System.out.println(cursor.next());
                i++;
            }

        }catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }
}
