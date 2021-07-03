package application;

import java.sql.Connection;
import java.sql.SQLException;

import dbconnUtil.DbConnection;

public class InventoryManagementModel {
  
  Connection connection;
  
  public InventoryManagementModel() {
    try {
      this.connection = DbConnection.getConnection();
    }
    catch(SQLException ex) {
      ex.getStackTrace();
      }
     if(this.connection == null) {
       System.exit(1);
     }
  }
  
  public boolean isDatabaseConnected() {
    return this.connection!=null;
  }
  
}
