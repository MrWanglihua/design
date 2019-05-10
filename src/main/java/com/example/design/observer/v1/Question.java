package com.example.design.observer.v1;

public class Question {
private String userName;
private String content;
private String platformName;
private String teacherName;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getUserName() {
return userName;
}
public void setUserName(String userName) {
this.userName = userName;
}
public String getContent() {
return content;
}
public void setContent(String content) {
this.content = content;
}
}