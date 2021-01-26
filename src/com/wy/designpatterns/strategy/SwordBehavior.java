package com.wy.designpatterns.strategy;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/26 23:17
 **/
public class SwordBehavior implements IWeaponBehavior{

  @Override
  public void useWeapon() {
    System.out.println("使用宝剑");
  }
}
