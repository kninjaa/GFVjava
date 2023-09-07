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
                // A tabela não existe, então vamos criá-la
                String createTableSQL = "CREATE TABLE tbCliente (ct_int_id NUMBER PRIMARY KEY, ct_str_name VARCHAR2(255) NOT NULL, ct_str_cpf VARCHAR(12) NOT NULL, ct_str_cnh VARCHAR(12) NOT NULL, ct_str_email VARCHAR2(255) NOT NULL, ct_str_senha VARCHAR2(100) NOT NULL)";
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

    public void inserirCliente(CadastrarCliente cliente) {
        try {
            String insertSQL = "INSERT INTO tbCliente (ct_str_name, ct_str_cpf, ct_str_cnh, ct_str_email, ct_str_senha) VALUES (?, ?, ?, ?, ?)";

            // Preparar a senha usando BCrypt
            String senhaHash = BCrypt.hashpw(cliente.getSenha(), BCrypt.gensalt());

            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, cliente.getCnh());
            preparedStatement.setString(4, cliente.getEmail());
            preparedStatement.setString(5, senhaHash);

            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("coluna recarregada.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public void insertCliente(CadastrarCliente cliente){
//        String insertQuery = "INSERT INTO tbCliente (int_id, str_name, str_cpf, str_cnh, str_email, str_senha) VALUES (?, ?, ?, ?, ?, ?)";
//
//        try (Connection connection = new ConnectionDB().getConnection();
//             PreparedStatement statement = connection.prepareStatement(insertQuery)) {
//            statement.setInt(1, cliente.getIdCliente());
//            statement.setString(2, cliente.getNome());
//            statement.setString(3, cliente.getCpf());
//            statement.setString(4, cliente.getCnh());
//            statement.setString(5, cliente.getEmail());
//            // Hash the password before storing it in the database
//            String hashedSenha = BCrypt.hashpw(cliente.getSenha(), BCrypt.gensalt());
//            statement.setString(6, hashedSenha);
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public boolean autenticarCliente(String email, String senha) {
//        String selectQuery = "SELECT senha FROM tbCliente WHERE str_email = ?";
//        try (Connection connection = new ConnectionDB().getConnection();
//             PreparedStatement statement = connection.prepareStatement(selectQuery)) {
//            statement.setString(1, email);
//            try (ResultSet resultSet = statement.executeQuery()) {
//                if (resultSet.next()) {
//                    String hashedSenha = resultSet.getString("str_senha");
//                    // Check if the password matches the hashed password in the database
//                    return BCrypt.checkpw(senha, hashedSenha);
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
}
