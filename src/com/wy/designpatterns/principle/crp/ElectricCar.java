package com.wy.designpatterns.principle.crp;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/30 18:33
 **/
public class ElectricCar extends AbsCar{

  public ElectricCar(IColor color) {
    super(color);
  }

  @Override
  public void move() {
    System.out.println("我的车是"+ color.getColor()+"电动车");
  }
}
