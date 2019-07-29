package com.myitzar.service.shop;

import com.myitzar.persistence.client.dto.ProductDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabby on 2018/07/08.
 */
public class MSZProducts {

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
