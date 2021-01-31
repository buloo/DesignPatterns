package com.wy.designpatterns.pattern.decorator;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/27 00:16
 **/
public abstract class Beverage {
//  String description = "UNKOWN BEVERAGE";

  public abstract String getDescription();

  public abstract double cost();
}
