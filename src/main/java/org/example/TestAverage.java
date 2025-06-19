package org.example;

import java.util.HashMap;
import java.util.Map;

public class TestAverage {

  public static void main(String[] args){
    Map<String, Integer> studentMap = new HashMap<>();
    studentMap.put("A", 100);
    studentMap.put("B", 90);
    studentMap.put("C", 80);
    studentMap.put("D", 70);
    studentMap.put("E", 30);

    int sum = 0;
    for(Integer value : studentMap.values()) {
      sum += value;
    }
    System.out.println("テストの合計点 :" + sum + "点");
    int average  = sum / studentMap.size();
    System.out.println("テストの平均点 :" + average + "点");
  }
}
