package com.wy.designpatterns.pattern.decorator;

/**
 * 调料-豆浆
 * @Author wangyue8
 * @CreatTime 2021/1/27 00:30
 **/
public class Soy extends CondimentDecorator {
  private Beverage beverage;

  public Soy(Beverage beverage){
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ",Soy";
  }

  @Override
  public double cost() {
    return 0.15 + beverage.cost();
  }
}
