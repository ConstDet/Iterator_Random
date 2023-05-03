package ru.netology;

import java.util.*;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        MyArrayList myArrayList = new MyArrayList();
        return myArrayList.iterator();
    }

    private class MyArrayList extends ArrayList {
        @Override
        public Iterator iterator() {
            return new MyIterator();
        }
    }

    private class MyIterator implements Iterator {
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Object next() {
            int diff = max - min;
            random = new Random();
            int res = random.nextInt(diff + 1);
            res += min;
            return res;
        }
    }


}
