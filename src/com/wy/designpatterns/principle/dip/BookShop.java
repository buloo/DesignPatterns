package com.wy.designpatterns.principle.dip;

/**
 * 商店的实现类：书店
 * @Author wangyue8
 * @CreatTime 2021/1/30 15:18
 **/
public class BookShop implements IShop{
  @Override
  public String sell() {
    return "本书店有：《重构》、《设计模式》、《深入理解操作系统》";
  }
}
