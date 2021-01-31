package com.wy.designpatterns.pattern.singleton;

/**
 *
 * 使用枚举作为单例的原因
 *
 * 1.《effective java》中只简单的提了几句话：“享有特权的客户端可以借助AccessibleObject.setAccessible方法，
 * 通过反射机制调用私有构造器。如果需要低于这种攻击，可以修改构造器，让它在被要求创建第二个实例的时候抛出异常。
 *
 * 2. 任何一个readObject方法，不管是显式的还是默认的，它都会返回一个新建的实例，这个新建的实例不同于该类
 * 初始化时创建的实例。”当然，这个问题也是可以解决的，想详细了解的同学可以翻看《effective java》第77条：对于实例控制，枚举类型优于readResolve
 *
 * 3. 线程安全
 *
 * @Author wangyue8
 * @CreatTime 2021/1/31 15:17
 **/
public enum RoomEnum {
  INSTANCE;

  public void doThings(){
  }

}
