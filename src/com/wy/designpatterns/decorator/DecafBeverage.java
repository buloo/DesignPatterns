package com.wy.designpatterns.decorator;

/**
 * 饮料-低咖啡因
 * @Author wangyue8
 * @CreatTime 2021/1/27 00:21
 **/
public class DecafBeverage extends Beverage {
  @Override
  public String getDescription() {
    return "DecafBeverage";
  }

  @Override
  public double cost() {
    return 1.09;
  }
}
