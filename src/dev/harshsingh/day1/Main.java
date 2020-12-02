package dev.harshsingh.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
  private static final int TARGET = 2020;

  public static void main(String[] args) {
    ArrayList<Integer> data = readInput();

    get2Sum2020(data);
  }

  public static void get2Sum2020(ArrayList<Integer> list) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : list) {
      int diff = TARGET - num;

      if (map.containsKey(diff)) {
        System.out.println("Found pair that sums to " + TARGET + "num 1: " + map.get(diff) + " num 2: " + num);
        System.out.println("Their product: " + map.get(diff)*num);
      } else {
        map.put(num, num);
      }
    }
  }

  private static ArrayList<Integer> readInput() {
    ArrayList<Integer> list = new ArrayList<>();

    try (BufferedReader inputFile = new BufferedReader(new FileReader("input.txt"))) {
      String input;
      while((input = inputFile.readLine()) != null) {
        list.add(Integer.parseInt(input));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return list;
  }
}
