package com.wy.designpatterns.pattern.observer;

import java.util.Observable;

/**
 * 被观察者
 * @Author wangyue8
 * @CreatTime 2021/1/23 14:16
 **/
public class WeatherImpl  extends Observable {

  private float temperature;//温度
  private float humidity;//湿度
  private float pressure;//压力

  public WeatherImpl(){ }

  public void setMeasurements(float tem,float hum, float pres){
    this.temperature = tem;
    this.humidity = hum;
    this.pressure = pres;
    mentsChanged();
  }

  public void mentsChanged(){
    setChanged();
    notifyObservers();
  }

  public float getTemperature(){
    return temperature;
  }

  public float getHumidity(){
    return humidity;
  }
  public float getPressure(){
    return pressure;
  }

}
