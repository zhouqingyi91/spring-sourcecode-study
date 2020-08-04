package com.luffy.extend;

/**
 * @author: zqy
 * @date: 2020-07-21 04:39
 **/
public class TestExtend {
    public static void main(String[] args) {
//        B b1 = new B();
//        System.out.println(b1.a()); //调用子类方法
//        System.out.println(b1.b()); //调用子类方法
//        System.out.println(b1.c()); //调用父类方法

//        System.out.println("================");
//
//        A b2 = new B(); // 能干什么看的是父类, 实际干活的是子类
//        System.out.println(b2.a()); //调用子类方法
//        System.out.println(b2.b()); //报错
//        System.out.println(b2.c()); //调用父类方法

//        A c = new C();
//        System.out.println(c.a());
//        System.out.println(c.c());
//
//        B c2 = new C();
//        System.out.println(c2.d());

        A c = new C();
        System.out.println(((B) c).d());
        System.out.println(((B) c).a());
        System.out.println(((C) c).b());
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
        System.out.println(a());
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
    public String d() {
        return "B类的d方法";
    }
}

class C extends B {
    public String a() {
        return "C类的a方法";
    }
    public String b() {
        return "C类的b方法";
    }

    public C() {
        super();
        System.out.println("C constructed");
    }
}