package com.wy.designpatterns.pattern.decorator;

/**
 * 饮料-深度烘培
 * @Author wangyue8
 * @CreatTime 2021/1/27 00:21
 **/
public class DarkRoastBeverage extends Beverage {

  @Override
  public String getDescription() {
    return "DarkRoastBeverage";
  }

  @Override
  public double cost() {
    return 0.99;
  }
}
