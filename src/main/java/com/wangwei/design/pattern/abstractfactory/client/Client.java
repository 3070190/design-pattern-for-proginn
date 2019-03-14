package com.wangwei.design.pattern.abstractfactory.client;

import com.wangwei.design.pattern.abstractfactory.DishesAbstractFactory;
import com.wangwei.design.pattern.abstractfactory.product.MeatAbstractProduct;
import com.wangwei.design.pattern.abstractfactory.product.NoodlesAbstractProduct;
import com.wangwei.design.pattern.abstractfactory.product.SoupAbstractProduct;
import com.wangwei.design.pattern.abstractfactory.product.dishsFactory.DaoxiaomianFactory;


public class Client {
    public static void  main(String[] args){

        /**
         * 抽象工厂的精髓在于快速替换产品簇，
         */
        DishesAbstractFactory dishesAbstractFactory =new DaoxiaomianFactory();//替换此处实现可以方便的替换产品簇
        NoodlesAbstractProduct noodlesAbstractProduct = dishesAbstractFactory.createNoodlesProduct();
        MeatAbstractProduct meatAbstractProduct =dishesAbstractFactory.createMeatProduct();
        SoupAbstractProduct soupAbstractProduct =dishesAbstractFactory.createSoupProduct();

    }
}
