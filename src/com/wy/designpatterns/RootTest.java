package com.wy.designpatterns;

import com.wy.designpatterns.decorator.Beverage;
import com.wy.designpatterns.decorator.DarkRoastBeverage;
import com.wy.designpatterns.decorator.EspressoBeverage;
import com.wy.designpatterns.decorator.HouseBlendBeverage;
import com.wy.designpatterns.decorator.Milk;
import com.wy.designpatterns.decorator.Mocha;
import com.wy.designpatterns.decorator.Soy;
import com.wy.designpatterns.decorator.Whip;
import com.wy.designpatterns.observer.CurrentConditionsDisplay;
import com.wy.designpatterns.observer.StatisisDisplay;
import com.wy.designpatterns.observer.ThirdpartyDisplay;
import com.wy.designpatterns.observer.WeatherImpl;
import com.wy.designpatterns.strategy.Queen;
import com.wy.designpatterns.strategy.SwordBehavior;

/**
 * 测试用例
 * @Author wangyue8
 * @CreatTime 2021/1/23 13:10
 **/
public class RootTest {

  public static void main(String[] args){

    //策略模式
    //不同的角色，使用不同的武器，可以随意更换
//    Queen queen = new Queen();
//    queen.performFight();
//    queen.setBehavior(new SwordBehavior());//可以安全的改变行为
//    queen.performFight();


    //观察者模式
    //气象站对应多个显示终端
//    WeatherImpl weather = new WeatherImpl();
//    CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weather);
//    ThirdpartyDisplay thirdpartyDisplay = new ThirdpartyDisplay(weather);
//    StatisisDisplay statisisDisplay = new StatisisDisplay(weather);
//    weather.setMeasurements(36,45,67.4f);

    //装饰者模式
    //咖啡厅
    Beverage beverage = new EspressoBeverage();
    System.out.println(beverage.getDescription() + " $"+beverage.cost());

    Beverage darkRoast = new DarkRoastBeverage();
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Whip(darkRoast);
    System.out.println(darkRoast.getDescription() + " $"+darkRoast.cost());

    Beverage houseBlend = new HouseBlendBeverage();
    houseBlend = new Soy(houseBlend);
    houseBlend = new Mocha(houseBlend);
    houseBlend = new Whip(houseBlend);
    System.out.println(houseBlend.getDescription() + " $"+houseBlend.cost());


  }

}
