package com.wy.designpatterns.factory;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/27 23:38
 **/
public class NYStylePizzaStore extends AbsPizzaStore{

  @Override
  AbsPizza creatPizza(String pizzaType) {
    if(pizzaType.equals("cheese")){
      return new NYStyleCheesePizza();
    }else if(pizzaType.equals("veggie")){
      return new NYStyleVeggiePizza();
    }

    return null;
  }
}
