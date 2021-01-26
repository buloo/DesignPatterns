package com.wy.designpatterns.decorator;

/**
 * 调料-摩卡
 * @Author wangyue8
 * @CreatTime 2021/1/27 00:30
 **/
public class Mocha extends CondimentDecorator {
  private Beverage beverage;

  public Mocha(Beverage beverage){
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ",Mocha";
  }

  @Override
  public double cost() {
    return 0.20 + beverage.cost();
  }
}
