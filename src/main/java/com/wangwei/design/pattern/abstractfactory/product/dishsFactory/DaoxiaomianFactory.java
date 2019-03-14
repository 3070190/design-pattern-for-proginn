package com.wangwei.design.pattern.abstractfactory.product.dishsFactory;

import com.wangwei.design.pattern.abstractfactory.DishesAbstractFactory;
import com.wangwei.design.pattern.abstractfactory.product.MeatAbstractProduct;
import com.wangwei.design.pattern.abstractfactory.product.NoodlesAbstractProduct;
import com.wangwei.design.pattern.abstractfactory.product.SoupAbstractProduct;
import com.wangwei.design.pattern.abstractfactory.product.products.together.daoxiaomain.DaoxiaoNoodles;
import com.wangwei.design.pattern.abstractfactory.product.products.together.daoxiaomain.LightSoup;
import com.wangwei.design.pattern.abstractfactory.product.products.together.daoxiaomain.PigMeat;
/**
 * 刀削面工厂
 */
public class DaoxiaomianFactory implements DishesAbstractFactory {
    @Override
    public NoodlesAbstractProduct createNoodlesProduct() {
        return new DaoxiaoNoodles();
    }

    @Override
    public MeatAbstractProduct createMeatProduct() {
        return new PigMeat();
    }

    @Override
    public SoupAbstractProduct createSoupProduct() {
        return new LightSoup();
    }
}
