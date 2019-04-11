package com.example.design.prototype;

import java.io.*;
import java.util.Date;

public class Qitiandasheng extends Mokey implements Cloneable, Serializable {

    public JinGuBang jinGuBang;

    public Qitiandasheng() {
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return this.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Qitiandasheng copy = (Qitiandasheng) ois.readObject();
        copy.birthday = new Date();
        return copy;
    }

    public Qitiandasheng shallowClone(Qitiandasheng clone){
        clone.height = this.height;
        clone.weight = this.weight;
        clone.birthday = new Date();
        return clone;
    }




}
