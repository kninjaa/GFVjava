package com.gfv.gfvjava.gfvjava.Models.Service.ServiceLayer;

import com.gfv.gfvjava.gfvjava.Models.Service.DAO.*;
import com.gfv.gfvjava.gfvjava.Models.Service.DAO.Mapping.*;

public class dbTestSL {
    private final dbTestMapping dbTestMapping;

    public dbTestSL() {
        this.dbTestMapping = new dbTestMapping();
    }

    public void createTable() {
        dbTestMapping.createTable();
    }
}
