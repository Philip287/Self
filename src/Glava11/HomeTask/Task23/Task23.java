package Glava11.HomeTask.Task23;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Task23 {
    public static void main(String[] args) {
        Map<Integer, Integer> rezMap = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            Map<Integer, Integer> map1 = CreatedMap();
            for (Integer int1 : map1.keySet()) {
                Integer count = rezMap.get(int1);
                if (count == null) {
                    rezMap.put(int1, map1.get(int1));
                    //System.out.println("done");
                   // System.out.println(rezMap + " 1");

                } else {
                    int int2rez = rezMap.get(int1);
                    rezMap.remove(int1, int2rez);
                    int int3rez = (int2rez + map1.get(int1))/2;
                    rezMap.put(int1, int3rez);
                }
            }
        }
        System.out.println(" Rez = " + rezMap);
        System.out.println();
    }

        private static Map CreatedMap() {
            Random rand = new Random();
            Map<Integer, Integer> m = new HashMap<Integer, Integer>();
            for (int i = 0; i < 10000; i++) {
                //produce a number between 0 and 20:
                int r = rand.nextInt(20);
                Integer freq = m.get(r);
                m.put(r, freq == null ? 1 : freq + 1);
            }
            System.out.println(m);
            return m;
        }
    }

