package com.authbank.listutil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.ListIterator;

/***
 * @author 沙建斌
 * @date  2021-11-08
 * @version  1.0
 * @description ListIterator
 *      1:ListIterator 系序列迭代器,允许程序员按任一方向遍历列表，迭代期间修改列表，并获得迭代器在列表中的位置。
 *
 * ***/
@Component("ListIteratorUtil")
public class ListIteratorUtil {

    @Autowired
    ArrayListUtil arrayListUtil;

    private static final int DEFAULT_PARAM =10;

    public   void  iteratorInfo(){
        //构造具有指定容器值同步的ArrayList
        ArrayList list =arrayListUtil.creatArrayList(DEFAULT_PARAM);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("af");

        ListIterator iterator = list.listIterator();
        /***正向遍历列表***/

        System.out.print("正向遍历列表");
        while (iterator.hasNext()){
                System.out.print(iterator.next());
            }

        /***反向遍历列表***/

        System.out.print("反向遍历列表");
        while (iterator.hasPrevious()){
                System.out.print(iterator.previous());
                }

    }

}
