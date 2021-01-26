package com.wy.designpatterns.decorator;

/**
 * 调料-豆浆
 * @Author wangyue8
 * @CreatTime 2021/1/27 00:30
 **/
public class Milk extends CondimentDecorator {
  private Beverage beverage;

  public Milk(Beverage beverage){
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ",Milk";
  }

  @Override
  public double cost() {
    return 0.10 + beverage.cost();
  }
}
