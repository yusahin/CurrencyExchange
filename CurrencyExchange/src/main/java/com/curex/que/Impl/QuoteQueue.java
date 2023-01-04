package com.curex.que.Impl;

import com.curex.que.Queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class QuoteQueue implements Queue {
    private final int MAX_COUNT = 5;
    private final static TreeSet<Integer> quoteQue = new TreeSet<Integer>(Collections.reverseOrder());

    @Override
    public String top() {
        int ind = 0;
        String prices = "";
        Iterator iterator = quoteQue.iterator();
        while (ind < MAX_COUNT) {
            prices = prices + " | " + String.valueOf(iterator.next());
            ind++;
        }
        return prices + " | ";
    }

    @Override
    public String top(int count) {
        if (MAX_COUNT < count) {
            count = MAX_COUNT;
            System.out.println("Warning you can list only " + MAX_COUNT + " prices");
        }
        int ind = 0;
        String prices = " | ";
        Iterator iterator = quoteQue.iterator();
        while (ind < count) {
            prices = prices + " | " + String.valueOf(iterator.next());
            ind++;
        }
        return prices + " | ";
    }

    @Override
    public boolean push(int price) {
        return quoteQue.add(price);
    }
}
