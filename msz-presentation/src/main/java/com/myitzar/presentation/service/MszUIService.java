package com.myitzar.presentation.service;

import com.myitzar.service.MSZViewProductsRequest;
import com.myitzar.service.MSZViewProductsResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Gabby on 2018/07/08.
 */
public interface MszUIService {

    String ping(String name);

    MSZViewProductsResponse viewAllProducts(MSZViewProductsRequest request);
}
