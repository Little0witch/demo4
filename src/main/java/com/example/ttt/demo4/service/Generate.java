package com.example.ttt.demo4.service;

import com.example.ttt.demo4.obj.Obj;
import org.springframework.stereotype.Service;

import java.lang.Math;
import java.util.Random;
@Service
public class Generate {
    public Obj generateNum(int inputNum){
        int num1 = (int) Math.random()*inputNum;
        int num2 = (int) Math.random()*inputNum;
        int num3 = (int) Math.random()*inputNum;
        int num4 = (int) Math.random()*inputNum;
        int num5 = (int) Math.random()*inputNum;
        return new Obj(num1,num2,num3,num4,num5);
    }
}
