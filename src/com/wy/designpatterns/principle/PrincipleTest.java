package com.wy.designpatterns.principle;

import com.wy.designpatterns.principle.Lod.Agent;
import com.wy.designpatterns.principle.Lod.Company;
import com.wy.designpatterns.principle.Lod.Fan;
import com.wy.designpatterns.principle.Lod.Star;
import com.wy.designpatterns.principle.crp.AbsCar;
import com.wy.designpatterns.principle.crp.Black;
import com.wy.designpatterns.principle.crp.ElectricCar;
import com.wy.designpatterns.principle.crp.GasolineCar;
import com.wy.designpatterns.principle.crp.White;
import com.wy.designpatterns.principle.dip.BookShop;
import com.wy.designpatterns.principle.dip.Customer;
import com.wy.designpatterns.principle.dip.FoodShop;
import com.wy.designpatterns.principle.isp.StuScoreManager;
import com.wy.designpatterns.principle.lsp.Animal;
import com.wy.designpatterns.principle.lsp.FlyBird;
import com.wy.designpatterns.principle.lsp.Ostrich;
import com.wy.designpatterns.principle.lsp.Swallow;
import com.wy.designpatterns.principle.ocp.AbsTheme;
import com.wy.designpatterns.principle.ocp.SeaTheme;
import com.wy.designpatterns.principle.ocp.SkyTheme;
import com.wy.designpatterns.principle.srp.Counselor;
import com.wy.designpatterns.principle.srp.StudentWork;
import com.wy.designpatterns.principle.srp.StudyTutor;

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
//    System.out.println("燕子：");
//    FlyBird swallow = new Swallow();
//    swallow.fly(10);
//    swallow.run(3);
//
//    System.out.println("鸵鸟：");
//    Animal ostrich = new Ostrich();
//    ostrich.run(20);

    //依赖倒置
//    Customer customer = new Customer();
//    customer.shopping(new BookShop());
//    customer.shopping(new FoodShop());

    //单一职责原则
//    StudentWork studentWork = new StudentWork();
//    studentWork.lifeCoaching(new Counselor());
//    studentWork.studyCoaching(new StudyTutor());

    //接口隔离原则
//    StuScoreManager.getInputModule().insert();
//    StuScoreManager.getInputModule().delete();
//    StuScoreManager.getCalculateModule().calculateTotalScore();
//    StuScoreManager.getPrintModule().printStuInfo();

    //迪米特法则
//    Agent agent = new Agent();
//    agent.setMyStar(new Star("周杰伦"));
//    agent.setMyFans(new Fan("王月"));
//    agent.setMyCompany(new Company("华谊兄弟电影公司"));
//    agent.meeting();
//    agent.business();

    //合成复用原则
//    AbsCar gasolineCar = new GasolineCar(new Black());
//    AbsCar electricCar = new ElectricCar(new White());
//    gasolineCar.move();
//    electricCar.move();

  }

}
