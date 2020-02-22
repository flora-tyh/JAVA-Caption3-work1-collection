package com.thoughtworks.collection;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(randomNumber());
    }

    /**
     *  生成10个0到20的随机整数，要求不能重复
     */
    public static Collection<Integer> randomNumber() {
        Random r = new Random();
        HashSet<Integer> randomNumberList = new HashSet<>();
        while (randomNumberList.size() < 10) {
            randomNumberList.add(r.nextInt(20) + 1);
        }
        return randomNumberList;
    }
}
