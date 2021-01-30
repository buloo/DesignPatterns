# 面向对象设计原则

### 开闭原则
开闭原则（Open Closed Principle，OCP）由勃兰特·梅耶（Bertrand Meyer）提出，他在 1988 年的
著作《面向对象软件构造》（Object Oriented Software Construction）中
提出：软件实体应当对扩展开放，对修改关闭（Software entities should be open for extension，but closed for modification），这就是开闭原则的经典定义。<br>

详细介绍：http://c.biancheng.net/view/1322.html

代码目录：principle/ocp

<br>

### 里氏替换原则
里氏替换原则（Liskov Substitution Principle，LSP）由麻省理工学院计算机科学实验室的里斯科夫（Liskov）女士在 1987 年的“面向对象技术的高峰会议”（OOPSLA）上
发表的一篇文章《数据抽象和层次》（Data Abstraction and Hierarchy）里
提出来的，她提出：继承必须确保超类所拥有的性质在子类中仍然成立（Inheritance should ensure that any property proved about supertype objects also holds for subtype objects）。<br>

详细介绍：http://c.biancheng.net/view/1324.html

代码目录 principle/lsp

<br>

### 依赖倒置原则
依赖倒置原则（Dependence Inversion Principle，DIP）是 Object Mentor 公司
总裁罗伯特·马丁（Robert C.Martin）于 1996 年在 C++ Report 上发表的文章。

依赖倒置原则的原始定义为：高层模块不应该依赖低层模块，两者都应该依赖其抽象；
抽象不应该依赖细节，细节应该依赖抽象（High level modules shouldnot depend upon low level modules.Both should depend upon abstractions.Abstractions should not depend upon details. Details should depend upon abstractions）。
其核心思想是：要面向接口编程，不要面向实现编程。

详细介绍：http://c.biancheng.net/view/1326.html

代码目录 principle/dip

<br>

### 单一职责原则
单一职责原则（Single Responsibility Principle，SRP）又称单一功能原则，
由罗伯特·C.马丁（Robert C. Martin）于《敏捷软件开发：原则、模式和实践》一书中
提出的。这里的职责是指类变化的原因，单一职责原则规定一个类应该有且仅有一个引起它
变化的原因，否则类应该被拆分（There should never be more than one reason for a class to change）。

单一职责同样也适用于方法。一个方法应该尽可能做好一件事情。如果一个方法处理的事情太多，其颗粒度会变得很粗，不利于重用。

详细介绍：http://c.biancheng.net/view/1327.html

代码目录 principle/srp

<br>

### 接口隔离原则
2002 年罗伯特·C.马丁给“接口隔离原则”的定义是：客户端不应该被迫依赖于它不使用的方法（Clients should not be forced to depend on methods they do not use）。
该原则还有另外一个定义：一个类对另一个类的依赖应该建立在最小的接口上（The dependency of one class to another one should depend on the smallest possible interface）。

接口隔离原则和单一职责都是为了提高类的内聚性、降低它们之间的耦合性，体现了封装的思想，但两者是不同的：
单一职责原则注重的是职责，而接口隔离原则注重的是对接口依赖的隔离。
单一职责原则主要是约束类，它针对的是程序中的实现和细节；接口隔离原则主要约束接口，主要针对抽象和程序整体框架的构建。

详细介绍：http://c.biancheng.net/view/1330.html

代码目录 principle/isp

<br>

