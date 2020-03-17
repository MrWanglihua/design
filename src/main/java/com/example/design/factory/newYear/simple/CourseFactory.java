package com.example.design.factory.newYear.simple;

public interface CourseFactory {

    Course create();

    /*public Course create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else if("python".equals(name)){
            return new PythonCourse();
        }else {
            return null;
        }
    };*/
   /* public Course create(String className){
        try{
            if(className !=null && !"".equals(className)){
                return (Course)Class.forName(className).newInstance();
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
       return null;
    };*/
   /* public Course create(Class<? extends Course> clazz){
        try{
            if(clazz !=null ){
                return  clazz.newInstance();
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
       return null;
    };*/
}
