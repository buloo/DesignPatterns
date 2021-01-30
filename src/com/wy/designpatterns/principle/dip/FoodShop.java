package com.wy.designpatterns.principle.dip;

/**
 * 商店的实现类：食品店
 * @Author wangyue8
 * @CreatTime 2021/1/30 15:18
 **/
public class FoodShop implements IShop{
  @Override
  public String sell() {
    return "本食品店有：柠檬水、酸奶、羊肉串";
  }
}
