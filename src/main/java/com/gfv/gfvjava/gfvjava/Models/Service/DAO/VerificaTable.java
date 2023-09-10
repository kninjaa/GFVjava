package com.gfv.gfvjava.gfvjava.Models.Service.DAO;

import java.sql.*;

public class VerificaTable {
    private final Connection connection;
    public VerificaTable() {
        this.connection = new ConnectionDB().getConnection();
        CreateTable();
    }

    public void CreateTable() {
        verificarTabelaExistente("TBVALIDACAO_GFVCG");
        verificarTabelaExistente("TBTIPOVEICULO_GFVCG");
        verificarTabelaExistente("TBCLIENTE_GFVCG");
        verificarTabelaExistente("TBVEICULO_GFVCG");
    }

    private void verificarTabelaExistente(String tableName) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT table_name FROM all_tables WHERE table_name = '" + tableName + "'");

            if (!resultSet.next()) {
                String TableSeqName = "";
                String createSequenceSQL = "";
                String createTableSQL = "";
                String alterTable = "";

                if (tableName.equals("TBVALIDACAO_GFVCG")){
                    TableSeqName = "ValSeq";
                    createSequenceSQL = "CREATE SEQUENCE " + TableSeqName + " START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE";

                    createTableSQL = "CREATE TABLE " + tableName + " (val_int_id_gfvCG NUMBER PRIMARY KEY, val_str_tipo_gfvCG VARCHAR2(6) UNIQUE NOT NULL)";

                    alterTable = "ALTER TABLE " + tableName  + " MODIFY val_int_id_gfvCG NUMBER DEFAULT " + TableSeqName + ".nextval";
                }

                else if (tableName.equals("TBTIPOVEICULO_GFVCG")) {
                    TableSeqName = "TipoVeiSeq";
                    createSequenceSQL = "CREATE SEQUENCE " + TableSeqName + " START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE";

                    createTableSQL = "CREATE TABLE " + tableName + " (tv_int_id_gfvCG NUMBER PRIMARY KEY, tv_str_Tipo_gfvCG VARCHAR2(255) NOT NULL)";

                    alterTable = "ALTER TABLE " + tableName  + " MODIFY tv_int_id_gfvCG NUMBER DEFAULT " + TableSeqName + ".nextval";
                }

                else if (tableName.equals("TBCLIENTE_GFVCG")) {
                    TableSeqName = "ClienteSeq";
                    createSequenceSQL = "CREATE SEQUENCE " + TableSeqName + " START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE";

                    createTableSQL = "CREATE TABLE " + tableName + " (ct_int_id_gfvCG NUMBER PRIMARY KEY, ct_str_name_gfvCG VARCHAR2(255) NOT NULL, ct_str_cpf_gfvCG VARCHAR(11) NOT NULL, ct_str_cnh_gfvCG VARCHAR(12) NOT NULL, " +
                            "ct_str_email_gfvCG VARCHAR2(255) NOT NULL, ct_str_senha_gfvCG VARCHAR2(255) NOT NULL)";

                    alterTable = "ALTER TABLE " + tableName  + " MODIFY ct_int_id_gfvCG NUMBER DEFAULT " + TableSeqName + ".nextval";
                }

                else if (tableName.equals("TBVEICULO_GFVCG")) {
                    TableSeqName = "VeiSeq";
                    createSequenceSQL = "CREATE SEQUENCE " + TableSeqName + " START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE";

                    createTableSQL = "CREATE TABLE " + tableName + " (vc_int_id_gfvCG NUMBER PRIMARY KEY, vc_str_mrc_gfvCG VARCHAR2(255) NOT NULL, vc_str_mdl_gfvCG VARCHAR2(255) NOT NULL, " +
                            "tv_int_id_gfvCG NUMBER NOT NULL, vc_str_pcv_gfvCG VARCHAR2(255) NOT NULL, " +

                            "vc_bool_ctz_gfvCG VARCHAR2(6) NOT NULL, vc_bool_blg_gfvCG VARCHAR2(6) NOT NULL, vc_bool_cg_gfvCG VARCHAR2(6) NOT NULL, " +

                            "vc_str_tmnv_gfvCG VARCHAR2(255) NOT NULL, vc_int_ps_gfvCG NUMBER NOT NULL, vc_int_qtdeix_gfvCG NUMBER NOT NULL, ct_int_id_gfvCG NUMBER NOT NULL, " +
                            "FOREIGN KEY (ct_int_id_gfvCG) REFERENCES TBCLIENTE_GFVCG(ct_int_id_gfvCG), " +

                            "FOREIGN KEY (vc_bool_ctz_gfvCG) REFERENCES TBVALIDACAO_GFVCG(val_str_tipo_gfvCG),"+
                            "FOREIGN KEY (vc_bool_blg_gfvCG) REFERENCES TBVALIDACAO_GFVCG(val_str_tipo_gfvCG), " +
                            "FOREIGN KEY (vc_bool_cg_gfvCG) REFERENCES TBVALIDACAO_GFVCG(val_str_tipo_gfvCG),"+

                            "FOREIGN KEY (tv_int_id_gfvCG) REFERENCES TBTIPOVEICULO_GFVCG(tv_int_id_gfvCG))";

                    alterTable = "ALTER TABLE " + tableName  + " MODIFY vc_int_id_gfvCG NUMBER DEFAULT " + TableSeqName + ".nextval";
                }

                statement.executeUpdate(createSequenceSQL);
                statement.executeUpdate(createTableSQL);
                statement.executeUpdate(alterTable);
            }

            InsertDados insertDados = new InsertDados();
            insertDados.Validacao();
            insertDados.TipoVeiculo();
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}