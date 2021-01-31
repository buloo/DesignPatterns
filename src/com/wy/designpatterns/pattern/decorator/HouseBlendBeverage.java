package com.wy.designpatterns.pattern.decorator;

/**
 * 饮料-综合
 * @Author wangyue8
 * @CreatTime 2021/1/27 00:21
 **/
public class HouseBlendBeverage extends Beverage {
  @Override
  public String getDescription() {
    return "HouseBlendBeverage";
  }

  @Override
  public double cost() {
    return 0.89;
  }
}
