package com.myitzar.service;

import javax.inject.Inject;
import com.myitzar.persistence.client.data.MSZDataManager;

/**
 * Created by Gabby on 2018/07/08.
 */
public class MSZShopServiceImpl implements MSZShopService {

    @Inject
    private MSZDataManager mszDataManager;

    @Override
    public MSZViewProductsResponse viewAllShopProducts(MSZViewProductsRequest request) {
        MSZViewProductsResponse response = new MSZViewProductsResponse();
        response.setProducts(mszDataManager.getAllProductDTOList());
        return response;
    }
}
