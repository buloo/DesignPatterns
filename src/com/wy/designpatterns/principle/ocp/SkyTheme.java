package com.wy.designpatterns.principle.ocp;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/30 13:04
 **/
public class SkyTheme  extends AbsTheme{

  @Override
  public void display() {
    System.out.println("更换主题为：SkyTheme");
  }
}
