package com.curex.price.impl;

import com.curex.price.Price;
import com.curex.que.Impl.QuoteQueue;
import com.curex.que.Queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public final class PriceObj implements Price {
    private final String name;
    private final QuoteQueue priceQueue = new QuoteQueue();

    public PriceObj(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }


    @Override
    public String top() {
        return priceQueue.top();
    }

    @Override
    public String top(int count) {
        return priceQueue.top(count);
    }

    @Override
    public boolean push(int price) {
        return priceQueue.push(price);
    }
}
