package com.geekster.urlHitCounter.model;

public class Visit {

    private  int count;

    public Visit(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "count=" + count +
                '}';
    }
}
