package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main3 {

    /*
     *
     * 任务执行，相同任务需要在冷却结束之后才能执行
     * 输入2,2,2,3（任务队列）
     * 输入2（冷却时间）
     * 2,2,2,3
     * 2
     * index: 1 task2执行
     * index: 2 task3执行
     * index: 3 task2等待
     * index: 4 task2执行
     * index: 5 task2等待
     * index: 6 task2等待
     * index: 7 task2执行
7
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tasks = scanner.nextLine().split(",");
        int time = scanner.nextInt();
        Map<String,Integer> map = new HashMap<>();
        Map<String, Integer> taskTime = new HashMap<>();
        for (int i = 0; i < tasks.length; i++){
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
            taskTime.put(tasks[i], 0);
        }

        int index = 0;
        while (!map.isEmpty()){

            Set<String> keys = map.keySet();
            for (String key : keys){

                index++;
                Integer value = map.get(key);
                Integer integer = taskTime.get(key);
                if (integer == 0 || index > integer){
                    map.put(key, value - 1);
                    taskTime.put(key, index + time);

                    if (value - 1 <= 0) {
                        map.remove(key);
                    }
                }

            }
        }
        System.out.println(index);
    }
}
