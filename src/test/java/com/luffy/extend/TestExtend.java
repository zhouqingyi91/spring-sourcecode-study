package com.luffy.extend;

/**
 * @author: zqy
 * @date: 2020-07-21 04:39
 **/
public class TestExtend {
    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1.a()); //调用子类方法
        System.out.println(b1.b()); //调用子类方法
        System.out.println(b1.c()); //调用父类方法

        System.out.println("================");

        A b2 = new B(); // 能干什么看的是父类, 实际干活的是子类
        System.out.println(b2.a()); //调用子类方法
//        System.out.println(b2.b()); //报错
        System.out.println(b2.c()); //调用父类方法
    }
}

class A {
    public String a() {
        return "父类的a方法";
    }
    public String c() {
        return "父类的c方法";
    }
    public A() {
        System.out.println("A constructed");
    }
}

class B extends A {
    public String a() {
        return "子类的a方法";
    }
    public String b() {
        return "子类的b方法";
    }
    public B() {
        System.out.println("B constructed");
    }
}