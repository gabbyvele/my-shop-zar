package com.myitzar.persistence.client.data;

import com.myitzar.persistence.client.dto.ProductDTO;
import com.myitzar.persistence.client.dto.translators.ProductTranslator;
import com.myitzar.persistence.dao.DataRepository;
import com.myitzar.persistence.entity.Product;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Gabby on 2018/07/08.
 */
public class MSZDataManager {

    @Inject
    private DataRepository<Product> productDataRepository;

    @Inject
    private ProductTranslator productTranslator;

    public List<ProductDTO> getAllProductDTOList(){
        List<ProductDTO>  productDTOList =
                productTranslator.toProductDTOList(productDataRepository.retrieveAllEntities(Product.class));
        return productDTOList;
    }

}
