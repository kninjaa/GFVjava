package com.gfv.gfvjava.gfvjava.Models.Service.DAO;

import java.sql.*;

public class TipoVeiculo {
    private final Connection connection;

    public TipoVeiculo() {
        this.connection = new ConnectionDB().getConnection();
        createTable();
    }
    
    public void createTable() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT table_name FROM all_tables WHERE table_name = 'TBTIPOVEICULO'");

            if (!resultSet.next()) {
                String createTableSQL = "CREATE TABLE tbTipoVeiculogfvCG (tv_int_id_gfvCG NUMBER PRIMARY KEY, tv_str_Tipo_gfvCG VARCHAR2(255) NOT NULL)";
                statement.executeUpdate(createTableSQL);
                String insertSQL = "INSERT INTO tbCliente (tv_int_id_gfvCG, tv_str_Tipo_gfvCG) VALUES (1, carro), (2, moto), (3, Caminhão), (4, Van), (5, SUV), (8, Caminhonete),";
                statement.executeUpdate(insertSQL);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
