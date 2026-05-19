package com.beans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

///     private String jdbcURL = "jdbc:postgresql://localhost:5432/ecommerce_db";
///     private String jdbcUsername = "postgres";
///     private String jdbcPassword = "nitin123";
///
///     private Connection getConnection() throws SQLException, ClassNotFoundException {
///         Class.forName("org.postgresql.Driver");
///         return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
///     }
public class ProductCsvReader {

    List<Product> readCSVfile(String filepath){
        List<Product> list=new ArrayList<>();
        try(BufferedReader br=new BufferedReader( new FileReader(filepath))){
            String line;
            while ((line= br.readLine())!=null){
               String data[]=line.split(",");
               int id=Integer.parseInt(data[0].trim());
               String name=data[1].trim();
               int price= Integer.parseInt(data[2].trim());
               list.add(new Product(id,name,price));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return list;
    }
}
