# DesignPatterns
设计模式学习


#### 1. 策略模式


#### 2. 观察者模式：
官方定义：定义了对象之间的一对多依赖关系，当一个对象改变状态时，它所有的依赖者都会收到通知并自动更新。<br>
个人理解：一个主体对应很多个体，这些个体一直在观察者主体的变化。一旦主体发生变化，就会通知所有的个体，然后个体根据实际情况更新自己。<br>
伪代码： <br>
```
//主体-被观察者
interface Observable {
  void addObserver(); // 添加一个观察者
  void deleteObserver(); // 删除一个观察者
  void notifyObservers(); // 数据发生变化后，通知所有观察者
}

//个体-观察者
interface Observer {
  void update(); // 接收到主体数据变化
}

```
