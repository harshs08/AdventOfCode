package dev.harshsingh.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
  private static final int TARGET = 2020;

  public static void main(String[] args) {
    ArrayList<Integer> data = readInput();

    get2Sum2020(data);
  }

  public static void get2Sum2020(List<Integer> list) {
    HashSet<Integer> set = new HashSet<>();

    for (int num : list) {
      int diff = TARGET - num;

      if (set.contains(diff)) {
        System.out.println("Found pair that sums to " + TARGET + " num 1: " + diff + " num 2: " + num);
        System.out.println("Their product: " + diff*num);
      } else {
        set.add(num);
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
