package com.wy.designpatterns.strategy;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/26 22:42
 **/
public class King extends Character {

  public King(){
    behavior = new SwordBehavior();
  }

}
