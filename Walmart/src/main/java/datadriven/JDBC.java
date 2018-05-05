package datadriven;


import base.CommonAPI;
import database.ConnectDB;

import java.util.List;

public class JDBC extends CommonAPI {
    ConnectDB connectDB = new ConnectDB();

    public void readingMysqlTable() throws Exception {
        List<String> topics = connectDB.readDataBase("Search", "items");
        for (String st : topics) {
            System.out.println(st);
        }
    }
}


