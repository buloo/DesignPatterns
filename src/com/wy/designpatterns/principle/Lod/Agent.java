package com.wy.designpatterns.principle.Lod;

/**
 * 从迪米特法则的定义和特点可知，它强调以下两点：
 * 从依赖者的角度来说，只依赖应该依赖的对象。
 * 从被依赖者的角度说，只暴露应该暴露的方法。
 *
 * 所以，在运用迪米特法则时要注意以下 6 点。
 * 1. 在类的划分上，应该创建弱耦合的类。类与类之间的耦合越弱，就越有利于实现可复用的目标。
 * 2. 在类的结构设计上，尽量降低类成员的访问权限。
 * 3. 在类的设计上，优先考虑将一个类设置成不变类。
 * 4. 在对其他类的引用上，将引用其他对象的次数降到最低。
 * 5. 不暴露类的属性成员，而应该提供相应的访问器（set 和 get 方法）。
 * 6. 谨慎使用序列化（Serializable）功能。
 *
 * 【例】明星与经纪人的关系实例。
 *
 * 分析：明星由于全身心投入艺术，所以许多日常事务由经纪人负责处理，如与粉丝的见面会，与媒体公司的业务洽淡等。
 * 这里的经纪人是明星的朋友，而粉丝和媒体公司是陌生人，所以适合使用迪米特法则，其类图如图 1 所示。
 *
 * @Author wangyue8
 * @CreatTime 2021/1/30 17:47
 **/
public class Agent {
    private Star myStar;
    private Fan myFan;
    private Company myCompany;

  public void setMyStar(Star myStar) {
    this.myStar = myStar;
  }

  public void setMyFans(Fan myFan) {
    this.myFan = myFan;
  }

  public void setMyCompany(Company myCompany) {
    this.myCompany = myCompany;
  }

  public void meeting(){
    System.out.println(myStar.getName()+"和粉丝"+myFan.getName()+"进行了见面会");
  }

  public void business(){
    System.out.println(myStar.getName()+"与"+myCompany.getName()+"进行了电影相关的合作商谈");
  }

}
