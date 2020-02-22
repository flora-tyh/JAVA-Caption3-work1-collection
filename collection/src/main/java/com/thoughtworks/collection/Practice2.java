package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice2 {

    public static void main(String[] args) {
        //分别用for循环、增强for循环、迭代器遍历并打印getNumbers返回的List
        for (int i = 0; i < getNumbers().size(); i++) {
            System.out.println(getNumbers().get(i));
        }

        for (int i : getNumbers()) {
            System.out.println(i);
        }

        Iterator<Integer> it = getNumbers().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /**
     * 创建一个List 然后在List中添加0到100整数
     */
    public static List<Integer> getNumbers() {
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numberList.add(i);
        }
        return numberList;
    }


}
