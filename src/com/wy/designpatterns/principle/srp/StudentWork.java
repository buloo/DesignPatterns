package com.wy.designpatterns.principle.srp;

/**
 * 【例】大学学生工作管理程序。
 *
 * 分析：大学学生工作主要包括学生生活辅导和学生学业指导两个方面的工作，
 * 其中生活辅导主要包括班委建设、出勤统计、心理辅导、费用催缴、班级管理等工作，
 * 学业指导主要包括专业引导、学习辅导、科研指导、学习总结等工作。如果将这些工作交给一位老师负责显然不合理，
 * 正确的做法是生活辅导由辅导员负责，学业指导由学业导师负责
 *
 * @Author wangyue8
 * @CreatTime 2021/1/30 15:33
 **/
public class StudentWork {

  //生活辅导
  public void lifeCoaching(ITeacher teacher){
    if(teacher instanceof Counselor){
      Counselor counselor = (Counselor) teacher;
      counselor.classBuild();
    }
  }

  //学业指导
  public void studyCoaching(ITeacher teacher){
    if(teacher instanceof StudyTutor){
      StudyTutor studyTutor = (StudyTutor) teacher;
      studyTutor.professionalGuidance();
    }
  }

}
