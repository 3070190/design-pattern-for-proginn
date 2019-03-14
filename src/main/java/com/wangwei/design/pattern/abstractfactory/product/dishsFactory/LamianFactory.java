package com.wangwei.design.pattern.abstractfactory.product.dishsFactory;

import com.wangwei.design.pattern.abstractfactory.DishesAbstractFactory;
import com.wangwei.design.pattern.abstractfactory.product.MeatAbstractProduct;
import com.wangwei.design.pattern.abstractfactory.product.NoodlesAbstractProduct;
import com.wangwei.design.pattern.abstractfactory.product.SoupAbstractProduct;
import com.wangwei.design.pattern.abstractfactory.product.products.together.lamian.Broth;
import com.wangwei.design.pattern.abstractfactory.product.products.together.lamian.DriedBeefSlices;
import com.wangwei.design.pattern.abstractfactory.product.products.together.lamian.Lamian;

/**
 * 拉面工厂
 */
public class LamianFactory implements DishesAbstractFactory {
    @Override
    public NoodlesAbstractProduct createNoodlesProduct() {
        return new Lamian();
    }

    @Override
    public MeatAbstractProduct createMeatProduct() {
        return new DriedBeefSlices();
    }

    @Override
    public SoupAbstractProduct createSoupProduct() {
        return new Broth();
    }
}
