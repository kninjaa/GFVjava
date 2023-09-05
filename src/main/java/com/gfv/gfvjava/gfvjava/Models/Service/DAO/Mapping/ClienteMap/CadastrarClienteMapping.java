package com.gfv.gfvjava.gfvjava.Models.Service.DAO.Mapping.ClienteMap;

import com.gfv.gfvjava.gfvjava.Models.Service.DAO.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import org.mindrot.jbcrypt.BCrypt;


import com.gfv.gfvjava.gfvjava.Models.Service.DAO.Mapping.dbTestMapping;
import com.gfv.gfvjava.gfvjava.Models.Service.DTO.*;


public class CadastrarClienteMapping {
    private final Connection connection;

    public CadastrarClienteMapping() {
        this.connection = new ConnectionDB().getConnection();
    }

    public void createTable() {
        String createTableQuery = "CREATE TABLE IF NOT EXISTS tbCliente (id_int NUMBER PRIMARY KEY, name_str VARCHAR2(255), cpf_str VARCHAR(12), cnh_str VARCHAR(12), email_str VARCHAR(255), senha  )";

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createTableQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertCliente(CadastrarCliente cliente){
        String insertQuery = "INSERT INTO tbCliente (id_int, name_str, cpf_str, cnh_str, email_str, ) VALUES (?, ?, ?, ?, ?, ?)";

         try (PreparedStatement statement = connection.prepareStatement(insertQuery)) {
            statement.setInt(1, cliente.getIdCliente());
            statement.setString(2, cliente.getNome());
            statement.setString(3, cliente.getCpf());
            statement.setString(4, cliente.getCnh());
            statement.setString(5, cliente.getEmail());
            statement.setString(6, cliente.getSenha());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public boolean autenticarCliente(String email, String senha) {
        String selectQuery = "SELECT senha FROM tbCliente WHERE email = ?";
        try (PreparedStatement statement = connection.prepareStatement(selectQuery)) {
            statement.setString(1, email);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String hashedSenha = resultSet.getString("senha");
                    return BCrypt.checkpw(senha, hashedSenha);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; 
    }
}