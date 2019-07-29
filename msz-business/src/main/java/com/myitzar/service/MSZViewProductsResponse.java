package com.myitzar.service;

import com.myitzar.persistence.client.dto.ProductDTO;
import com.myitzar.service.shop.MSZProducts;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabby on 2018/07/08.
 */
public class MSZViewProductsResponse {


    private List<ProductDTO> products;

    public List<ProductDTO> getProducts() {
        if (products == null){
            products = new ArrayList<>();
        }
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }
}
