package com.droid;

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Droid> priorityQueue = new PriorityQueue<>(5, new Droid.DroidComparator());
        Droid d1 = new Droid("Gdroid", "hrt-98");
        Droid d2 = new Droid("Sdroid", "irt-45");
        Droid d3 = new Droid("Rudroid", "gh-11");
        Droid d4 = new Droid("Tdroid", "hj-64");
        Droid d5 = new Droid("Fdroid", "det-976");
        priorityQueue.add(d1);
        priorityQueue.add(d2);
        priorityQueue.add(d3);
        priorityQueue.add(d4);
        priorityQueue.add(d5);
        priorityQueue.offer(d2);
        System.out.println(priorityQueue);

        priorityQueue.offer(d4);
        System.out.println(priorityQueue);
    }
}
