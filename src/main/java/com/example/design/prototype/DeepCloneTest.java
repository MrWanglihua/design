package com.example.design.prototype;

public class DeepCloneTest {

    public static void main(String[] args) {
        Qitiandasheng qitiandasheng = new Qitiandasheng();

        try {
            Qitiandasheng clone = (Qitiandasheng)qitiandasheng.clone();

            System.out.println("深度克隆："+(qitiandasheng.jinGuBang == clone.jinGuBang));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Qitiandasheng qitiandasheng1 = qitiandasheng.shallowClone(qitiandasheng);
        System.out.println("浅度克隆："+(qitiandasheng.jinGuBang == qitiandasheng1.jinGuBang));

    }
}
