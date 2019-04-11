package com.example.design.factory.model.simple;

/**
 * 简单工厂模式
 */
public class CourseFactory {
    /*
    method 1:根据传入的参数，switch/case传出不同结果
    */
    /*
    public Course getCourse(String courseName){
        if(courseName.equals("java")){
            return new JavaCourse();
        }else if(courseName.equals("python")){
            return new PythonCourse();
        }
        return null;
    }*/

    /*
    model 2 ：通过反射机制，将传入的路径初始化成对象
    */
    /*
    public Course getCourse(String coursePath){
        try {
            if (!(null == coursePath || "".equals(coursePath))) {
                return (Course) Class.forName(coursePath).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }*/

/**
 * model 3:（方法参数是字符串，可控性有待提升，而且还需要强制转型。）通过clazz.newinstance方法初始化
 */
    public Course getCourse(Class<?extends Course> clazz){

        try {
            if(null !=clazz){
                return clazz.newInstance();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }


}
