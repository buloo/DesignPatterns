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
官方定义：定义了对象之间的一对多依赖关系，当一个对象改变状态时，它所有的依赖者都会收到通
