package com.agree.fcbank;

import com.agree.fcbank.listutil.ListIteratorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.ListIterator;

@RestController
@RequestMapping("/demo")
public class ControllerTest {


    @Autowired
    com.agree.fcbank.listutil.ArrayListUtil arrayListUtil;

    @Autowired
    ListIteratorUtil listIteratorUtil;

    @RequestMapping("/getWord")
    public Object[] getWord()
    {
       ArrayList arrayList =  arrayListUtil.creatArrayList(10);
        arrayList.add("2021-11-07");
        arrayList.add("2021-11-06");
        arrayList.add("2021-11-05");
        arrayList.add("2021-10-07");
        arrayList.add("2021-10-06");
        arrayList.add("2021-10-05");
        arrayList.add("2021-09-07");
        arrayList.add("2021-09-06");
        arrayList.add("2021-09-05");

        ListIterator iterator = arrayList.listIterator();

        listIteratorUtil.iteratorInfo();
        return arrayListUtil.sortList(arrayList);
    }

}
