package com.wy.designpatterns.pattern.strategy;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/26 23:19
 **/
public class Queen extends Character {
  public Queen(){
    behavior = new KnifeBehavior();
  }


}
