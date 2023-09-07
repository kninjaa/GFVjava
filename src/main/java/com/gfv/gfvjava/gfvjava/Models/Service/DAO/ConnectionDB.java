package com.gfv.gfvjava.gfvjava.Models.Service.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//pedir conexao
public class ConnectionDB {
    private static final String DB_URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static final String USER = "RM99173";
    private static final String PASSWORD = "240102";
    private static final int MAX_RETRIES = 3;

    private Connection connection;

    public ConnectionDB() {
        connect();
    }

    private void connect() {
        int attempt = 1;
        while (attempt <= MAX_RETRIES) {
            try {
                connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                break;
            } catch (SQLException e) {
                if (attempt == MAX_RETRIES) {
                    e.printStackTrace();
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }
            }
            attempt++;
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}