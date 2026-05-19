package com.beans;

import java.util.List;

public class ProductService {
    private ProductCsvReader productCsvReader;
    private ProductDao productDao;

    public void setProductCsvReader(ProductCsvReader productCsvReader) {
        this.productCsvReader = productCsvReader;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void service(String filepath){
        List<Product> products = productCsvReader.readCSVfile(filepath);
        for(Product p:products){
            productDao.saveProducts(p);
        }
    }
}
