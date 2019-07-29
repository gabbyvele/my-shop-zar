package com.myitzar.presentation.soap;

import com.myitzar.presentation.service.MszUIService;
import com.myitzar.service.MSZViewProductsRequest;
import com.myitzar.service.MSZViewProductsResponse;

import javax.jws.WebService;
import java.util.Date;

/**
 * Created by Gabby on 2018/07/08.
 */
@WebService(name = "MszUIService")
public class MszUIServiceSoapImpl implements MszUIService {

    @Override
    public String ping(String name) {
        return "We're alive! " + new Date();
    }

    @Override
    public MSZViewProductsResponse viewAllProducts(MSZViewProductsRequest request) {
        return null;
    }
}
