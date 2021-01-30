package com.wy.designpatterns.principle.dip;

/**
 * 【例】依赖倒置原则在“顾客购物程序”中的应用。
 *
 * 分析：本程序反映了 “顾客类”与“商店类”的关系。商店类中有 sell() 方法，
 * 顾客类通过该方法购物以下代码定义了顾客类通过网店 BookShop 购物：
 * class Customer {
 *     public void shopping(BookShop shop) {
 *         //购物
 *         System.out.println(shop.sell());
 *     }
 * }
 * 但是，这种设计存在缺点，如果该顾客想从另外一家商店（如FoodShop）购物，就要将该顾客的代码修改如下：
 * class Customer {
 *     public void shopping(FoodShop shop) {
 *         //购物
 *         System.out.println(shop.sell());
 *     }
 * }
 * 顾客每更换一家商店，都要修改一次代码，这明显违背了开闭原则。
 * 存在以上缺点的原因是：顾客类设计时同具体的商店类绑定了，这违背了依赖倒置原则。
 * 解决方法是：定义“BookShop”和“FoodShop”的共同接口 Shop，顾客类面向该接口编程。
 *
 * @Author wangyue8
 * @CreatTime 2021/1/30 15:03
 **/
public interface IShop {
  String sell();
}
