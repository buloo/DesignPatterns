# 面向对象设计原则

### 开闭原则
开闭原则（Open Closed Principle，OCP）由勃兰特·梅耶（Bertrand Meyer）提出，他在 1988 年的
著作《面向对象软件构造》（Object Oriented Software Construction）中
提出：软件实体应当对扩展开放，对修改关闭（Software entities should be open for extension，but closed for modification），这就是开闭原则的经典定义。<br>

详细介绍：http://c.biancheng.net/view/1322.html

代码目录：principle/ocp


### 里氏替换原则
里氏替换原则（Liskov Substitution Principle，LSP）由麻省理工学院计算机科学实验室的里斯科夫（Liskov）女士在 1987 年的“面向对象技术的高峰会议”（OOPSLA）上
发表的一篇文章《数据抽象和层次》（Data Abstraction and Hierarchy）里
提出来的，她提出：继承必须确保超类所拥有的性质在子类中仍然成立（Inheritance should ensure that any property proved about supertype objects also holds for subtype objects）。<br>

详细介绍：http://c.biancheng.net/view/1324.html

代码目录 principle/lsp

### 依赖倒置原则
依赖倒置原则（Dependence Inversion Principle，DIP）是 Object Mentor 公司
总裁罗伯特·马丁（Robert C.Martin）于 1996 年在 C++ Report 上发表的文章。

依赖倒置原则的原始定义为：高层模块不应该依赖低层模块，两者都应该依赖其抽象；
抽象不应该依赖细节，细节应该依赖抽象（High level modules shouldnot depend upon low level modules.Both should depend upon abstractions.Abstractions should not depend upon details. Details should depend upon abstractions）。
其核心思想是：要面向接口编程，不要面向实现编程。

详细介绍：http://c.biancheng.net/view/1326.html

代码目录 principle/dip
