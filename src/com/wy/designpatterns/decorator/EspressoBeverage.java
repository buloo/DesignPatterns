package com.wy.designpatterns.decorator;

/**
 * 饮料-浓缩
 * @Author wangyue8
 * @CreatTime 2021/1/27 00:21
 **/
public class EspressoBeverage extends Beverage {
  @Override
  public String getDescription() {
    return "EspressoBeverage";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
