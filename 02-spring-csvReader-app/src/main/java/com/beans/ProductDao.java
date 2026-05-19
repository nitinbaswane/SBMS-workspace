package com.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductDao {
    private String url;
    private String username;
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void saveProducts(Product product){
      String query="INSERT INTO products (id, name, price) VALUES (?, ?, ?)";
      try (Connection con= DriverManager.getConnection(url,username,password);
           PreparedStatement ps= con.prepareStatement(query);
      ){
          ps.setInt(1,product.getId());
          ps.setString(2,product.getName());
          ps.setInt(3,product.getPrice());

          ps.executeUpdate();

      } catch (Exception e) {
        e.printStackTrace();
      }
    }

}
