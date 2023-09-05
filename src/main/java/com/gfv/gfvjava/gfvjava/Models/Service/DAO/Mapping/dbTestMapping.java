package com.gfv.gfvjava.gfvjava.Models.Service.DAO.Mapping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gfv.gfvjava.gfvjava.Models.Service.DAO.*;
import com.gfv.gfvjava.gfvjava.Models.Service.DTO.*;

public class dbTestMapping {
    private final Connection connection;

    public dbTestMapping() {
        this.connection = new ConnectionDB().getConnection();
    }

    public void createTable() {
        String createTableQuery = "CREATE TABLE dbTest (id NUMBER PRIMARY KEY, name VARCHAR2(255), idade VARCHAR(4))";

        try (PreparedStatement statement = connection.prepareStatement(createTableQuery)) {
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}