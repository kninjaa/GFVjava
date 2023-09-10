package com.gfv.gfvjava.gfvjava.Models.Service.DAO.Mapping.ClienteMap;

import java.sql.*;
import com.gfv.gfvjava.gfvjava.Models.Service.DAO.ConnectionDB;
import com.gfv.gfvjava.gfvjava.Models.Service.DTO.SolicitarCarroCliente;
import com.gfv.gfvjava.gfvjava.Models.Service.DTO.Enum.Evalidacao;

public class VeiculoClienteMapping {
    private final Connection connection;

    public VeiculoClienteMapping() {
        this.connection = new ConnectionDB().getConnection();
    }

    public void inserirDadosVeiculo(String marca, String modelo, String placaVeiculo, String customizado, String blindado, String carga, String tamanhoVeiculo, double pesoVeiculo, int qtdeEixos) {
        try {
            String insertSQL = "INSERT INTO TBVEICULO_GFVCG " +
                    "(vc_str_mrc_gfvCG, vc_str_mdl_gfvCG, vc_str_pcv_gfvCG, vc_bool_ctz_gfvCG, " +
                    "vc_bool_blg_gfvCG, vc_bool_cg_gfvCG, vc_str_tmnv_gfvCG, vc_int_ps_gfvCG, vc_int_qtdeix_gfvCG) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            SolicitarCarroCliente solicitarCarroCliente = new SolicitarCarroCliente(marca, modelo, placaVeiculo, customizado, blindado, carga, tamanhoVeiculo, pesoVeiculo, qtdeEixos);

            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, solicitarCarroCliente.getMarca());
            preparedStatement.setString(2, solicitarCarroCliente.getModelo());
            preparedStatement.setString(3, solicitarCarroCliente.getPlacaVeiculo());
            preparedStatement.setString(4, solicitarCarroCliente.getCustomizado());
            preparedStatement.setString(5, solicitarCarroCliente.getBlindado());
            preparedStatement.setString(6, solicitarCarroCliente.getCarga());
            preparedStatement.setString(7, solicitarCarroCliente.getTamanhoVeiculo());
            preparedStatement.setDouble(8, solicitarCarroCliente.getPesoVeiculo());
            preparedStatement.setInt(9, solicitarCarroCliente.getQtdeEixos());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public String mapearValidacaoEnumParaString(Evalidacao validacao) {
        return validacao.getValidacao();
    }
}
