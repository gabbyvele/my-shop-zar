package com.myitzar.presentation.rest;

import com.myitzar.presentation.service.MszUIService;
import com.myitzar.service.MSZShopService;
import com.myitzar.service.MSZViewProductsRequest;
import com.myitzar.service.MSZViewProductsResponse;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Date;

/**
 * Created by Gabby on 2018/07/08.
 */
@Path("/MszUIServiceRestImpl")
public class MszUIServiceRestImpl implements MszUIService {

    @Inject
    private MSZShopService shopService;

    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/ping")
    public String ping(@QueryParam("name") String name) {
        return "We're alive! " + new Date() + " ! Hello " +name;
    }

    @Override
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/view-all-products")
    public MSZViewProductsResponse viewAllProducts(MSZViewProductsRequest request) {
        return shopService.viewAllShopProducts(request);
    }
}
