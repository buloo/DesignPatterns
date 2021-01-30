package com.wy.designpatterns.principle.lsp;

/**
 *
 * 例，企鹅、鸵鸟和几维鸟从生物学的角度来划分，它们属于鸟类；
 * 但从类的继承关系来看，由于它们不能继承“飞鸟”会飞的功能，所以它们不能定义成“飞鸟”的子类。需要重新它们定义和飞鸟的共同父类，因为它们都会跑，
 * 可以定义成"动物"。
 * @Author wangyue8
 * @CreatTime 2021/1/30 14:11
 **/
public class Animal {
  public void run(int distance){
    System.out.println("跑了"+distance+"km");
  }
}
