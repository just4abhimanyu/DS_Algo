package com.av.codejava;


class ClassA {
    ClassA() {
        System.out.println("Constructor of class A");
    }
}

// Class B extends A
class ClassB extends ClassA {
    ClassB() {
        System.out.println("Constructor of class B");
    }
}

// Class C extends B
class ClassC extends ClassB {
    ClassC() {
        System.out.println("Constructor of class C");
    }
}


public class TestInheritance {

    public static void main(String[] args) {
        ClassA objA = new ClassA(); /* Constructor of class A **/
System.out.println("--------------------");
        ClassB objB = new ClassB(); /* Constructor of class A
                                        Constructor of class B */
        System.out.println("--------------------");
        ClassC objC = new ClassC(); /* Constructor of class A
                                        Constructor of class B
                                        Constructor of class C */
        System.out.println("--------------------");
    }

}
