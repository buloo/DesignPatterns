package com.wy.designpatterns.strategy;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * @Author wangyue8
 * @CreatTime 2021/1/23 14:29
 **/
public class CurrentConditionsDisplay implements Observer , IDispaly{
  private float temperature;//温度
  private float humidity;//湿度
  private float pressure;//压力

  public CurrentConditionsDisplay(Observable observable){
    observable.addObserver(this);
  }

  @Override
  public void update(Observable observable, Object arg) {
    if(observable instanceof WeatherImpl){
      WeatherImpl weather = (WeatherImpl) observable;
      temperature = weather.getTemperature();
      humidity = weather.getHumidity();
      pressure = weather.getPressure();
      dispaly();
    }
  }

  @Override
  public void dispaly() {
    System.out.println("CurrentConditionsDisplay: temperature = " + temperature);
  }
}
