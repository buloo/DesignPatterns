package com.wy.designpatterns;

import com.wy.designpatterns.principle.lsp.Animal;
import com.wy.designpatterns.principle.lsp.FlyBird;
import com.wy.designpatterns.principle.lsp.Ostrich;
import com.wy.designpatterns.principle.lsp.Swallow;
import com.wy.designpatterns.principle.ocp.AbsTheme;
import com.wy.designpatterns.principle.ocp.SeaTheme;
import com.wy.designpatterns.principle.ocp.SkyTheme;

/**
 *
 * 测试用例-设计原则
 *
 * @Author wangyue8
 * @CreatTime 2021/1/30 13:02
 **/
public class PrincipleTest {

  public static void main(String[] args){

    //开闭
//    AbsTheme sky = new SkyTheme();
//    AbsTheme sea = new SeaTheme();
//    sky.display();
//    sea.display();


    //里氏替换
    System.out.println("燕子：");
    FlyBird swallow = new Swallow();
    swallow.fly(10);
    swallow.run(3);

    System.out.println("鸵鸟：");
    Animal ostrich = new Ostrich();
    ostrich.run(20);

  }

}
