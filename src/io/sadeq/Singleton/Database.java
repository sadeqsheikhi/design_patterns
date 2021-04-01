package io.sadeq.Singleton;

import javax.xml.crypto.Data;
import java.awt.dnd.DropTarget;

public class Database {
    public String dbname;
    private Database(String dbname) {
        this.dbname = dbname;
    }

    public boolean makeConnection() {
        System.out.println("connection created");
        return true;
    }

    public void addUser() {
        System.out.println("user added");
    }

    private static Database instance;


    public static Database getInstance() {
        if (Database.instance == null) {
            Database.instance = new Database("db");
            return Database.instance;
        }
        return Database.instance;
    }

}
