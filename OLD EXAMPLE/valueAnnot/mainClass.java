package com.chace.valueAnnot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

/* main class where we are creating annotation-based spring context */
public class mainClass {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.journaldev.spring");
        context.refresh();
        System.out.println("Refreshing the spring context");
        DBConn dbConnection = context.getBean(DBConn.class);

        dbConnection.printDBConfigs();

        // close the spring context
        context.close();
    }
}
