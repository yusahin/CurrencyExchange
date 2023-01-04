package com.curex.que;

public interface Queue {

    public String top();
    public String top(int count);
    public boolean push(int price);
}
