package com.hx.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhanghongxin on 2020/6/5.
 * [2,3,7,33,6] target = 9
 * return [0,2]
 */
public class TwoSum {
    public static void main(String[] args) {
        twoSum(new int[]{2,3,7,33,6},9);
    }

    static void twoSum(int[] arr,int target){
        if (arr.length==0){
            return;
        }
        //数组下标
        int index = 0;
        //用于存储已经遍历过的数值
        Map<Integer,Integer> map = new HashMap<>();
        while (index<arr.length){
            //获取 target -当前值 所需要查找的目标值 tar =  9-2 = 7
            int tar = target-arr[index];
            //去map中查找目标 7 如果不存在 将当前值 下标存储到map
            if (map.get(tar)==null){
                map.put(arr[index],index);
            }else {
                //找到直接打印返回
                System.out.println("["+map.get(tar)+","+index+"]");
                return;
            }
            index++;
        }
    }
}
