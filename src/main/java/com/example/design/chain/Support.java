package com.example.design.chain;

public abstract class Support {

    private String name;

    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next){
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble){
        if(resolve(trouble)){
            done(trouble);
        }else if(next!=null){
            next.resolve(trouble);
        }else {
            fail(trouble);
        }
    }

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                ", next=" + next +
                '}';
    }

    protected  abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble){
        System.out.println(trouble+"is resolved by"+this +".");

    }
    protected void fail(Trouble trouble){
        System.out.println(trouble+"cannot be resolve.");
    }



}
