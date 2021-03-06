package com.shop.portal.service;

import com.shop.portal.service.hystrix.PortalServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created By Lizhengyuan on 18-11-8
 */
@FeignClient(value = "shop-service-portal")
public interface PortalService {

    @RequestMapping(value = "/getSortMenuList",method = RequestMethod.GET)
    //RequestLine("GET /getSortMenuList")
    Object getSortMenuList();

}
