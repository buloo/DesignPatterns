package com.wy.designpatterns.principle.lsp;

/**
 * 飞鸟
 * @Author wangyue8
 * @CreatTime 2021/1/30 14:13
 **/
public class FlyBird extends Animal{

  public void fly(int distance){
    System.out.println("飞了"+distance+"km");
  }

}
