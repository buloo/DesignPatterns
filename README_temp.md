# 设计模式

### 单例模式
单例（Singleton）模式指一个类只有一个实例，且该类能自行创建这个实例的一种模式。

例如，Windows 中只能打开一个任务管理器，这样可以避免因打开多个任务管理器窗口而造成内存资源的浪费，或出现各个窗口显示内容的不一致等错误。

单例模式有 3 个特点：<br>
1. 单例类只有一个实例对象；
2. 该单例对象必须由单例类自行创建；
3. 单例类对外提供一个访问该单例的全局访问点。

详细介绍：http://c.biancheng.net/view/1338.html

实现方式：<br>
**1. 懒汉式**
```
//方式一：懒汉式，用的时候才想行动，比较懒
public class Room {

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
```
**2. 饿汉式**
```
//方式二：饿汉式：马上就想得到
public class Room {

  private static final Room instance = new Room();//final 保证 instance 在所有线程中同步

  private Room(){}//private 避免类在外部被实例化

  public void doThings(){
  }

}
```
**3. 静态内部类**
```
//方式三：静态内部类
public class Room {

  //借助了静态内部类的特性，其要被引用后才会装载到内存
  //通常的理解是，只要是当前jar中的静态属性或方法都会被加载到内存，但静态内部类却不是，
  //它只有在第一次调用getInstance方法，产生了LazyHolder的引用，才会被真正加载。
  //实际上也是懒加载。
  private static class RoomHolder {
    private static final Room instance = new Room();
  }

  public static Room getInstance() {
    return RoomHolder.instance;
  }

  public void doThings() {
  }

}
```
**4. 枚举**
```
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
 **/
public enum RoomEnum {
  INSTANCE;

  public void doThings(){
  }

}

```

代码目录：pattern/singleton

### 简单工厂模式
把创建对象的过程封装起来，放到一个对象里，提供给所有用户使用。

简单工厂模式不在 GoF 23 种设计模式之列。

简单工厂模式每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度，违背了“开闭原则”，。

详细介绍：http://c.biancheng.net/view/8385.html

### 工厂方法模式
定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个，工厂方法让类把实例化推迟到子类。

而“工厂方法模式”是对简单工厂模式的进一步抽象化，其好处是可以使系统在不修改原来代码的情况下引进新的产品，即满足开闭原则。

详细介绍：http://c.biancheng.net/view/1348.html

### 抽象工厂模式
抽象工厂（AbstractFactory）模式是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。

抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。

详细介绍：http://c.biancheng.net/view/1351.html

