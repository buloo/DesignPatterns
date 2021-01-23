package com.wy.designpatterns;

import com.wy.designpatterns.observer.CurrentConditionsDisplay;
import com.wy.designpatterns.observer.StatisisDisplay;
import com.wy.designpatterns.observer.ThirdpartyDisplay;
import com.wy.designpatterns.observer.WeatherImpl;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/23 13:10
 **/
public class RootTest {

  public static void main(String[] args){

    WeatherImpl weather = new WeatherImpl();
    CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weather);
    ThirdpartyDisplay thirdpartyDisplay = new ThirdpartyDisplay(weather);
    StatisisDisplay statisisDisplay = new StatisisDisplay(weather);

    weather.setMeasurements(36,45,67.4f);
  }

}
