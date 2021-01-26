package com.wy.designpatterns.strategy;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/26 23:19
 **/
public class KnifeBehavior implements IWeaponBehavior{
  @Override
  public void useWeapon() {
    System.out.println("使用匕首");
  }
}
