package com.wy.designpatterns.principle.crp;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/30 18:29
 **/
public abstract class AbsCar {

  protected IColor color;

  public AbsCar(IColor color){
    this.color = color;
  }

  public abstract void move();
}
