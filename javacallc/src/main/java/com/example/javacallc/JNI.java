package com.example.javacallc;

/**
 * Created by francis on 2016/6/14.
 */
public class JNI {
    static{
        System.loadLibrary("");
    }
    private native int sum(int x,int y);
    private native int sub(int x,int y);
    private native int mult(int x,int y);
}
