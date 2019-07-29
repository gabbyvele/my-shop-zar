package com.myitzar.persistence.client.dto.translators;

import com.myitzar.persistence.client.dto.ProductDTO;
import com.myitzar.persistence.entity.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabby on 2018/07/08.
 */
public class ProductTranslator {

    public ProductDTO toProductDTO(Product product){
        ProductDTO productDTO = new ProductDTO();

        productDTO.setId(product.getId());
        productDTO.setName(product.getName());

        return productDTO;
    }

    public List<ProductDTO> toProductDTOList(List<Product> productList){
        List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();

        for(Product product : productList){
            productDTOList.add(toProductDTO(product));
        }

        return productDTOList;
    }
}
