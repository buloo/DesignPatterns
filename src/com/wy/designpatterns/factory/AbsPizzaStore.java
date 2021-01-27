package com.wy.designpatterns.factory;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/27 23:32
 **/
public abstract class AbsPizzaStore {

  public AbsPizza orderPizza(String pizzaType){
    AbsPizza pizza;
    pizza = creatPizza(pizzaType);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

  abstract AbsPizza creatPizza(String pizzaType);

}
