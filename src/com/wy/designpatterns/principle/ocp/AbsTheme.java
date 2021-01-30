package com.wy.designpatterns.principle.ocp;

/**
 *
 * 【例】Windows 的桌面主题设计。
 * 分析：Windows 的主题是桌面背景图片、窗口颜色和声音等元素的组合。
 * 用户可以根据自己的喜爱更换自己的桌面主题，也可以从网上下载新的主题。
 * 这些主题有共同的特点，可以为其定义一个抽象类（AbsTheme），而
 * 每个具体的主题（SkyTheme、SeaTheme）是其子类。用户窗体可以根据需要选择或者增加新的主题，
 * 而不需要修改原代码，所以它是满足开闭原则的，其类图如图 1 所示。
 *
 * @Author wangyue8
 * @CreatTime 2021/1/30 12:58
 **/
public abstract class AbsTheme {
  public abstract  void display();
}
