package com.wangwei.design.pattern.factory.factorys;

import com.wangwei.design.pattern.factory.FruitsFactory;
import com.wangwei.design.pattern.factory.FruitsProduct;
import com.wangwei.design.pattern.factory.products.AppleProduct;

public class AppleFactory implements FruitsFactory {
    @Override
    public FruitsProduct getFruitesProduct() {
        return new AppleProduct();
    }
}
