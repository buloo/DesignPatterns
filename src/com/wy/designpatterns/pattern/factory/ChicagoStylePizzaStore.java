package com.wy.designpatterns.pattern.factory;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/27 23:38
 **/
public class ChicagoStylePizzaStore extends AbsPizzaStore{

  @Override
  AbsPizza creatPizza(String pizzaType) {
    if(pizzaType.equals("cheese")){
      return new ChicagoStyleCheesePizza();
    }else if(pizzaType.equals("veggie")){
      return new ChicagoStyleVeggiePizza();
    }

    return null;
  }
}
