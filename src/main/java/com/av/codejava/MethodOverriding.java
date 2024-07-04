package com.av.codejava;

public class MethodOverriding {

    public static void main(String[] args) {

//     A a = new B(); // will result in a compilation error because B is abstract and cannot be instantiated.
//     a.m1(); // Bm1 // cannot be called due to the instantiation issue.
//     B b = new C();
//       b.m2();// unreachable
      // b.m3(); // b.m3(); will also cause issues. Specifically, b.m3(); will result in a compilation error because B does not define m3(), and b is of type B.
        C c = new C();
       // c.m4(); // m4() method not present in C class
    }
}
/**
 *
 * A a = new B(); will result in a compilation error because B is abstract and cannot be instantiated.
 * a.m1(); cannot be called due to the instantiation issue.
 * b.m2(); and b.m3(); will also cause issues. Specifically, b.m3(); will result in a compilation error because B does not define m3(), and b is of type B.
 *
 *
 */