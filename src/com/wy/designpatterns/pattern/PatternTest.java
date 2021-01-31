package com.wy.designpatterns.pattern;

/**
 * 测试用例-设计模式
 * @Author wangyue8
 * @CreatTime 2021/1/23 13:10
 **/
public class PatternTest {

  public static void main(String[] args){


    //策略模式
    //不同的角色，使用不同的武器，可以随意更换。例如国王默认使用宝剑，但是也可以更换成匕首。
//    Queen queen = new Queen();
//    queen.performFight();
//    queen.setBehavior(new SwordBehavior());//可以安全的改变行为
//    queen.performFight();


    //观察者模式
    //气象站对应多个显示终端
    //例如终端1显示气象站的温度、湿度。终端2显示温度、气压。气象站数据发生变化，所有的终端数据也要更新。
//    WeatherImpl weather = new WeatherImpl();
//    CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weather);
//    ThirdpartyDisplay thirdpartyDisplay = new ThirdpartyDisplay(weather);
//    StatisisDisplay statisisDisplay = new StatisisDisplay(weather);
//    weather.setMeasurements(36,45,67.4f);

    //装饰者模式
    //starbuzz咖啡厅
    //购买咖啡时，可以直接购买基本款，也可以计入各种调料，比如多加一份奶、摩卡等等，
    //调料也要收费
//    Beverage beverage = new EspressoBeverage();
//    System.out.println(beverage.getDescription() + " $"+beverage.cost());
//
//    Beverage darkRoast = new DarkRoastBeverage();
//    darkRoast = new Mocha(darkRoast);
//    darkRoast = new Mocha(darkRoast);
//    darkRoast = new Whip(darkRoast);
//    System.out.println(darkRoast.getDescription() + " $"+darkRoast.cost());
//
//    Beverage houseBlend = new HouseBlendBeverage();
//    houseBlend = new Soy(houseBlend);
//    houseBlend = new Mocha(houseBlend);
//    houseBlend = new Whip(houseBlend);
//    System.out.println(houseBlend.getDescription() + " $"+houseBlend.cost());


    //工厂模式-工厂方法
//    NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
//    ChicagoStylePizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
//
//    AbsPizza nyPizza = nyStylePizzaStore.orderPizza("cheese");
//    System.out.println(nyPizza.getName()+"\n");
//    AbsPizza chicagoPizza = chicagoStylePizzaStore.orderPizza("cheese");
//    System.out.println(chicagoPizza.getName());


  }

}
