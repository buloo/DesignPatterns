package com.wy.designpatterns.principle.isp;

/**
 * 【例】学生成绩管理程序。
 * <p>
 * 分析：学生成绩管理程序一般包含插入成绩、删除成绩、修改成绩、计算总分、计算均分、打印成绩信息、査询成绩信息等功能，
 * 如果将这些功能全部放到一个接口中显然不太合理，正确的做法是将它们分别放在输入模块、统计模块和打印模块等3个模块中。
 *
 * @Author wangyue8
 * @CreatTime 2021/1/30 16:40
 **/
public class StuScoreManager implements InputModule, CalculateModule, PrintModule {

  private StuScoreManager() {
  }

  //只返回所需的模块功能。还能这样啊，哇，好强大。
  public static InputModule getInputModule() {
    return (InputModule) new StuScoreManager();
  }

  public static CalculateModule getCalculateModule() {
    return (CalculateModule) new StuScoreManager();
  }

  public static PrintModule getPrintModule() {
    return (PrintModule) new StuScoreManager();
  }

  @Override
  public void insert() {
    System.out.println("输入模块 insert");
  }

  @Override
  public void delete() {
    System.out.println("输入模块 delete");
  }

  @Override
  public void modify() {
    System.out.println("输入模块 modify");
  }

  @Override
  public void calculateTotalScore() {
    System.out.println("统计模块 calculateTotalScore");
  }

  @Override
  public void calculateAverage() {
    System.out.println("统计模块 calculateAverage");
  }

  @Override
  public void printStuInfo() {
    System.out.println("打印模块 printStuInfo");
  }

  @Override
  public void queryStuInfo() {
    System.out.println("打印模块 queryStuInfo");
  }
}
