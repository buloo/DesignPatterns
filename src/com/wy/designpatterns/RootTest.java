package com.wy.designpatterns;

import com.wy.designpatterns.observer.CurrentConditionsDisplay;
import com.wy.designpatterns.observer.StatisisDisplay;
import com.wy.designpatterns.observer.ThirdpartyDisplay;
import com.wy.designpatterns.observer.WeatherImpl;
import com.wy.designpatterns.strategy.Queen;
import com.wy.designpatterns.strategy.SwordBehavior;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/23 13:10
 **/
public class RootTest {

  public static void main(String[] args){

    //策略模式-测试用例
    //不同的角色，使用不同的武器，可以随意更换
    Queen queen = new Queen();
    queen.performFight();
    queen.setBehavior(new SwordBehavior());//可以安全的改变行为
    queen.performFight();


    //观察者模式-测试用例
    //气象站对应多个显示终端
//    WeatherImpl weather = new WeatherImpl();
//    CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weather);
//    ThirdpartyDisplay thirdpartyDisplay = new ThirdpartyDisplay(weather);
//    StatisisDisplay statisisDisplay = new StatisisDisplay(weather);
//    weather.setMeasurements(36,45,67.4f);

  }

}
