package com.agree.fcbank.listutil;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/***
 * @author  沙建斌
 * @date 2021-11-05
 * @version  1.0
 * @description  ArrayListUtil
 *      ArrayList具有以下特征:
 *              1:ArrayList是大小可变的数组实现.即按照添加的顺序存储。
 *              2:允许包含一条或多条Null值存在.
 *              3:ArrayList是不同步，即当至少两条线程访问时至少一条线程从结构上修改列表,那么他必须保持对外一致(结构上的修改
 *              指的是任何添加或者删除一个或多个列表元素的操作,或者显式调整底层数组的大小也就是调用trimToSize()方法.)如果想要
 *              避免不同步导致的问题一般是通过对自然封装该列表的对象进行同步操作来完成,如果不存在这样的对象,则应该在创建该ArrayList
 *              时使用Collection.synchronizedList方法将该列表包装起来，以防止意外对列表的不同步访问
 *                  List list = Collection.synchronizedList(new ArrayList());
 *              4:ArrayList具有指定的迭代器--->listIterator
 *
 * ***/
@Component("ArrayListUtil")
public class ArrayListUtil {

    /***构造初始容量为10且不同步的空列表***/
    public ArrayList creatArrayList(){
        List list = new ArrayList();
        return (ArrayList) list;
    }

    /***构造初始容量为10且同步的空列表***/
    public ArrayList creatSyncArrayList(){
        List list = Collections.synchronizedList(new ArrayList());
        return (ArrayList) list;
    }


    /***构造一个具有指定初始容量且不同步的空列表***/
    public ArrayList creatArrayList(int initialCapacity){
        List  list  = new ArrayList(initialCapacity);
        return (ArrayList) list;
    }

    /***构造初始容量为10且同步的空列表***/
    public ArrayList creatSyncArrayList(int initialCapacity){
        List list = Collections.synchronizedList(new ArrayList(initialCapacity));
        return (ArrayList) list;
    }

//    /***构造具有指定枚举初始容量为10且不同步的空列表***/
//    public ArrayList<T> creatArrayList(){
//        List <T> list = new ArrayList<T>();
//        return (ArrayList<T>) list;
//    }
//
//    /***构造具有指定枚举初始容量且同步的空列表***/
//    public ArrayList<T> crateArrayList(int initialCapacity){
//        List <T> list = Collections.synchronizedList(new ArrayList<T>(initialCapacity));
//        return (ArrayList<T>) list;
//    }


    /***根据List指定的自然顺序对指定List对象进行升序排序
     * @return***/
    public Object[] sortList(List list){
        Object [] objects = list.toArray();
        Arrays.sort(objects);
        return objects;
    }

}
