package org.example.Workshop;

public class Main {
    public static void main(String[] args) {

        DbManager dbManager = new PostgreSqlManager();
        dbManager.add(1);
    }
}
