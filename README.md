# Head First设计模式 读书笔记

#### 1. 策略模式
官方定义：定义算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。<br>
个人理解：一个主体，它有不同的类型，每种类型的主体也都有自己的行为。主体和行为已经定好了各自的规则。外部的使用方，也就是客户，只需要根据定义好的规则去使用就可以了，不需要关心具体实现，而且客户还可以随意更改主体的行为。如果需要新增业务，新建一个主体或者行为，然后根据规则实现自己的效果就可以。<br>
设计原则：<br>
1. 封装变化的部分，和固定不变的部门分开。(主体的类型和行为的类型都可变)
2. 针对接口编程，不针对实现编程。（行为使用接口）
3. 多用组合，少用继承。（将所有的行为组合到主体）

伪代码： <br>
```

//主体
abstract class Subject{
  IBehavior behavior;
  void performDo(){// 使用对应的行为
    behavior.doIt();
  }; 
  void setBehavior(); // 更改行为
}

//主体的一种行为
interface IBehavior{
  void doIt();
}


使用：
Subject s1 = new Subject(); //主体1
s1.performDo();//执行默认Behavior
s1.setBehavior(new Behavior2());//给主体更换行为
s1.performDo();执行Behavior2

Subject s2 = new Subject();//主体2
s2.setBehavior(new Behavior3());//给主体更换行为
s2.performDo();执行Behavior3
```
<br>
<br>
学习时间：2021/1/21-1/22 <br>
代码目录：strategy

***
#### 2. 观察者模式：
官方定义：定义了对象之间的一对多依赖关系，当一个对象改变状态时，它所有的依赖者都会收到通知并自动更新。<br>
个人理解：一个主体对应很多个体，这些个体一直在观察者主体的变化。一旦主体发生变化，就会通知所有的个体，然后个体根据实际情况更新自己。<br>
设计原则：<br>
1. 封装变化的部分，和固定不变的部门分开。(主体的状态和个体的数量)
2. 针对接口编程，不针对实现编程。（主体和个体都使用接口）
3. 多用组合，少用继承。（将所有的个体组合到主体）
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

使用：
Observable obs = new Observable();//创建主体，即被观察者
obs.addObservable(new Observer1());//添加个体观察者1
obs.addObservable(new Observer2());//添加个体观察者2
obs.addObservable(new Observer3());//添加个体观察者3

主体数据发生变化，通知所有个体
obs.notifyObservers();

Observer1收到更新
Observer2收到更新
Observer3收到更新
```
<br>
<br>
学习时间：2021/1/23 <br>
代码目录：observer

***
#### 3. 装饰者模式：
官方定义：动态地将责任附加到对象上，若要扩展功能，装饰者提供了比继承更有弹性的替代方案。<br>
个人理解：主体实现了基本的需求，如果需要给主体扩展其他功能，直接在主体外包一层生成一个新主体，不会修改主体的内容，<br>
设计原则：<br>
1. 针对接口编程，不针对实现编程。（主体和扩展都使用抽象类）
2. 多用组合，少用继承。（将所有的扩展组合到主体）
3. 为交互对象之间的松耦合设计而努力（扩展和主体分开，互不影响）
4. 为扩展开放，对修改关闭（只能扩展新功能，不能修改主体内容）
伪代码： <br>
```
//主体-默认
abstract Componet {
  abstract void doIt(); 
  abstract void doThat(); 
}

//扩展-装饰者
abstract Decorator extends Componet{
}

使用：
Componet1 componet1 = new Componet1();//创建，默认主体
componet1 = new Decorator2(componet1);//装饰一个新扩展
componet1 = new Decorator3(componet1);//装饰一个新扩展
componet1 = new Decorator4(componet1);//装饰一个新扩展

这样以来，默认的主体被加上了三个新功能
```
<br>
<br>
学习时间：2021/1/27 <br>
代码目录：decorator

***
#### 4. 工厂模式：
简单工厂：把创建对象的过程封装起来，放到一个对象里，提供给所有用户使用。
工厂方法：定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
抽象工厂模式：提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。
个人理解：主体实现了基本的需求，如果需要给主体扩展其他功能，直接在主体外包一层生成一个新主体，不会修改主体的内容，<br>
设计原则：<br>
1. 要依赖抽象，不要依赖具体类。
2. 多用组合，少用继承。
3. 为交互对象之间的松耦合设计而努力
4. 类应该为扩展开放，对修改关闭
5. 针对接口编程，不针对实现编程
伪代码： <br>
```
//主体-默认
abstract Componet {
  abstract void doIt(); 
  abstract void doThat(); 
}

//扩展-装饰者
abstract Decorator extends Componet{
}

使用：
Componet1 componet1 = new Componet1();//创建，默认主体
componet1 = new Decorator2(componet1);//装饰一个新扩展
componet1 = new Decorator3(componet1);//装饰一个新扩展
componet1 = new Decorator4(componet1);//装饰一个新扩展

这样以来，默认的主体被加上了三个新功能
```
<br>
<br>
学习时间：2021/1/27 <br>
代码目录：decorator

***
实例源码：<https://github.com/buloo/DesignPatterns>
<br>
