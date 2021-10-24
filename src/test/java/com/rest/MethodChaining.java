package com.rest;

public class MethodChaining {
    public static void main(String[] args) {

        MethodChaining methodChaining = new MethodChaining();

        methodChaining.a1().a2().a3();


    }

    public MethodChaining a1(){
        System.out.println("This is a1 Method");

        return this;
    }
    public MethodChaining a2(){
        System.out.println("This is a1 Method");
        return this;
    }

    public MethodChaining a3(){
        System.out.println("This is a1 Method");
        return this;
    }



}
