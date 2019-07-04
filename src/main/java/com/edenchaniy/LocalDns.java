package com.edenchaniy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/4 20:25
 * 用来存放dns解析结果
 */
public class LocalDns {
    private static List<String> dnsList; //使用单例模式保证dns库唯一

    private LocalDns(){}

    public static synchronized List getDnsList(){
        if(dnsList==null){
            dnsList = new ArrayList<>();
        }
        return dnsList;
    }

    public void add(String dns){
        dnsList.add(dns);
    }

    public void remove(int index){
        dnsList.remove(index);
    }
}
