package com.acme.eshop.service;

import com.acme.eshop.model.Discount;
import org.slf4j.LoggerFactory;


public class DiscountServiceImpl implements DiscountService{

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(DiscountServiceImpl.class);

    @Override
    public void printDiscountDetail(Discount discount) {
        logger.info("Discount is: {}",discount.getDiscountPercent() *100 +" %");
    }
}
