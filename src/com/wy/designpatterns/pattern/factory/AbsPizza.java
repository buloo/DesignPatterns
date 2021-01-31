package com.wy.designpatterns.pattern.factory;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/27 23:30
 **/
public abstract class AbsPizza {
  String name;

  void prepare() {
    System.out.println("prepare");
  }

  void bake() {
    System.out.println("bake");
  }

  void cut() {
    System.out.println("cut");
  }

  void box() {
    System.out.println("box");
  }

  public String getName(){
    return name;
  }
}
