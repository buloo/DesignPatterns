package com.wy.designpatterns.decorator;

/**
 * 调料-奶泡
 * @Author wangyue8
 * @CreatTime 2021/1/27 00:30
 **/
public class Whip extends CondimentDecorator {
  private Beverage beverage;

  public Whip(Beverage beverage){
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ",Whip";
  }

  @Override
  public double cost() {
    return 0.10 + beverage.cost();
  }
}
