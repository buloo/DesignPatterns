package com.wy.designpatterns.principle.dip;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/30 15:17
 **/
public class Customer {

  public void shopping(IShop shop){
    System.out.println(shop.sell());
  }

}
