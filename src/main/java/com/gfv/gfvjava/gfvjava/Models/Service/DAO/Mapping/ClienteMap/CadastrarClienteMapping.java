package com.gfv.gfvjava.gfvjava.Models.Service.DAO.Mapping.ClienteMap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.mindrot.jbcrypt.BCrypt;

import com.gfv.gfvjava.gfvjava.Models.Service.DAO.ConnectionDB;
import com.gfv.gfvjava.gfvjava.Models.Service.DTO.CadastrarCliente;


public class CadastrarClienteMapping {
    private final Connection connection;

    public CadastrarClienteMapping() {
        this.connection = new ConnectionDB().getConnection();
        createTable();
    }
    
    public void createTable() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT table_name FROM all_tables WHERE table_name = 'TBCLIENTE'");

            if (!resultSet.next()) {
                String createTableSQL = "CREATE TABLE tbCliente (ct_int_id NUMBER PRIMARY KEY, ct_str_name VARCHAR2(255) NOT NULL, ct_str_cpf VARCHAR(12) NOT NULL, ct_str_cnh VARCHAR(12) NOT NULL, ct_str_email VARCHAR2(255) NOT NULL, ct_str_senha VARCHAR2(255) NOT NULL)";
                statement.executeUpdate(createTableSQL);
                String createSequenceSQL = "CREATE SEQUENCE Clientesqc START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE";
                statement.executeUpdate(createSequenceSQL);
                String alterTableSQL = "ALTER TABLE tbCliente MODIFY ct_int_id NUMBER DEFAULT Clientesqc.nextval";
                statement.executeUpdate(alterTableSQL);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void inserirCliente(String nome, String cpf, String cnh, String email, String senha) {
        try {
            String insertSQL = "INSERT INTO tbCliente (ct_str_name, ct_str_cpf, ct_str_cnh, ct_str_email, ct_str_senha) VALUES (?, ?, ?, ?, ?)";

            // Preparar a senha usando BCrypt
            String senhaHash = BCrypt.hashpw(senha, BCrypt.gensalt());

            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, cpf);
            preparedStatement.setString(3, cnh);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, senhaHash);

            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("coluna recarregada.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
