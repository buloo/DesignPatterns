package com.wy.designpatterns.strategy;

/**
 * 角色接口
 * @Author wangyue8
 * @CreatTime 2021/1/23 22:31
 **/
public abstract class Character {
  protected IWeaponBehavior behavior;
  public Character(){}

  public void setBehavior(IWeaponBehavior behavior){
    this.behavior = behavior;
  }

  public void performFight(){
    behavior.useWeapon();
  }
}
