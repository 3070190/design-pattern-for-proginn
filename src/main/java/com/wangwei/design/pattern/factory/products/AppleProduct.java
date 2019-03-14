package com.wangwei.design.pattern.factory.products;

import com.wangwei.design.pattern.factory.FruitsProduct;

public class AppleProduct implements FruitsProduct {

    @Override
    public void showFruitsProduct() {
        System.out.println("This is an apple");
    }
}
