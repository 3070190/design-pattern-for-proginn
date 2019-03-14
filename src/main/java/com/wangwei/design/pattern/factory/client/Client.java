package com.wangwei.design.pattern.factory.client;

import com.wangwei.design.pattern.factory.FruitsFactory;
import com.wangwei.design.pattern.factory.FruitsProduct;
import com.wangwei.design.pattern.factory.factorys.AppleFactory;

public class Client {
    public static void main(String[] args){
        FruitsFactory fruitsFactory =new AppleFactory();
        FruitsProduct fruitsProduct = fruitsFactory.getFruitesProduct();
        fruitsProduct.showFruitsProduct();
    }
}
