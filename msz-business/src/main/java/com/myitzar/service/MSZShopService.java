package com.myitzar.service;

import javax.ejb.Local;

/**
 * Created by Gabby on 2018/07/08.
 */
@Local
public interface MSZShopService {

    MSZViewProductsResponse viewAllShopProducts(MSZViewProductsRequest request);

}
