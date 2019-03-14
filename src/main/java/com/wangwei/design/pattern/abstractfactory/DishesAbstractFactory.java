package com.wangwei.design.pattern.abstractfactory;

import com.wangwei.design.pattern.abstractfactory.product.MeatAbstractProduct;
import com.wangwei.design.pattern.abstractfactory.product.NoodlesAbstractProduct;
import com.wangwei.design.pattern.abstractfactory.product.SoupAbstractProduct;

/**
 *  菜肴抽象类
 *  可以创建 中国拉面 （拉面 条，牛肉，高汤）
 *  也可以创建 刀削面（刀削面条，猪肉酱，清汤）
 */
public interface DishesAbstractFactory {

    NoodlesAbstractProduct createNoodlesProduct();

    MeatAbstractProduct createMeatProduct();

    SoupAbstractProduct createSoupProduct();

}
