package com.wy.designpatterns.pattern.singleton;

/**
 * 单例模式
 *
 * @Author wangyue8
 * @CreatTime 2021/1/31 15:09
 **/
public class Room {
  //方式一：懒汉式，用的时候才想行动，比较懒
  private static volatile Room instance = null;//volatile 保证 instance 在所有线程中同步
  private Room() {//private 避免类在外部被实例化
  }
  public static synchronized Room getInstance() {
    if (instance == null) {
      instance = new Room();
    }
    return instance;
  }
  public void doThings(){
  }
}

//方式二：饿汉式：马上就想得到
//public class Room {
//  private static final Room instance = new Room();//final 保证 instance 在所有线程中同步
//  private Room(){}//private 避免类在外部被实例化
//  public void doThings(){
//  }
//}

//方式三：静态内部类
//public class Room {
//
//  //借助了静态内部类的特性，其要被引用后才会装载到内存
//  //通常的理解是，只要是当前jar中的静态属性或方法都会被加载到内存，但静态内部类却不是，
//  //它只有在第一次调用getInstance方法，产生了LazyHolder的引用，才会被真正加载。
//  //实际上也是懒加载。
//  private static class RoomHolder {
//    private static final Room instance = new Room();
//  }
//
//  public static Room getInstance() {
//    return RoomHolder.instance;
//  }
//
//  public void doThings() {
//  }
//
//}

//方式四：将Room类型改为枚举类型，也是最完美的方式。见RoomEnum。
