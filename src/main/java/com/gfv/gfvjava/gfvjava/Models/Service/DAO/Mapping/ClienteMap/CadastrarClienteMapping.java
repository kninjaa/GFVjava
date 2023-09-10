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

    }

    public void inserirDadosCliente(String nome, String cpf, String cnh, String email, String senha) {
        try {
            String insertSQL = "INSERT INTO TBCLIENTE_GFVCG (ct_str_name_gfvCG, ct_str_cpf_gfvCG, ct_str_cnh_gfvCG, ct_str_email_gfvCG, ct_str_senha_gfvCG) VALUES (?, ?, ?, ?, ?)";

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
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
