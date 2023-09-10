package com.gfv.gfvjava.gfvjava.Models.Service.DAO;


import com.gfv.gfvjava.gfvjava.Models.Service.DAO.Mapping.ClienteMap.VeiculoClienteMapping;
import com.gfv.gfvjava.gfvjava.Models.Service.DTO.Enum.*;

import java.sql.*;

public class InsertDados {
    private final Connection connection;

    public InsertDados() {
        this.connection = new ConnectionDB().getConnection();
    }

    public void Validacao(){
        try{
            String insereSQL = "INSERT INTO TBVALIDACAO_GFVCG (val_str_tipo_gfvCG) VALUES (?)";
            try (PreparedStatement insereStmt = connection.prepareStatement(insereSQL)) {
                VeiculoClienteMapping veiculoClienteMapping = new VeiculoClienteMapping();
                for (Evalidacao validacao : Evalidacao.values()) {
                    if (!valorExistenteValidacao(validacao)) {
                        String validacaoString = veiculoClienteMapping.mapearValidacaoEnumParaString(validacao);
                        insereStmt.setString(1, validacao.getValidacao());
                        insereStmt.executeUpdate();
                    }
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private boolean valorExistenteValidacao(Evalidacao validacao) throws SQLException {
        String sql = "SELECT COUNT(*) FROM TBVALIDACAO_GFVCG WHERE val_str_tipo_gfvCG = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, validacao.getValidacao());
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                resultSet.next();
                int count = resultSet.getInt(1);
                return count > 0;
            }
        }
    }

    public void TipoVeiculo() {
        try {
            String insereSQL = "INSERT INTO TBTIPOVEICULO_GFVCG (tv_str_Tipo_gfvCG) VALUES (?)";
            try (PreparedStatement insereStmt = connection.prepareStatement(insereSQL)) {
                for (ETipoVeiculo tipoVeiculo : ETipoVeiculo.values()) {
                    if (!valorExistenteTipoVeiculo(tipoVeiculo)){
                        insereStmt.setString(1, tipoVeiculo.getTipoVeiculo());
                        insereStmt.executeUpdate();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean valorExistenteTipoVeiculo(ETipoVeiculo tipoVeiculo) throws SQLException {
        String sql = "SELECT COUNT(*) FROM TBTIPOVEICULO_GFVCG WHERE tv_str_Tipo_gfvCG = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, tipoVeiculo.getTipoVeiculo());
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                resultSet.next();
                int count = resultSet.getInt(1);
                return count > 0;
            }
        }
    }

}