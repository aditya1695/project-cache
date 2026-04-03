package LRUCache;

import exception.CapacityExceeded;
import exception.KeyNotPresent;

import java.util.HashMap;

public class LRUCache implements LRUCacheInterface{

    private int capacity;
    private final HashMap<Integer, Integer> cache = new HashMap<>(capacity);

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public int get(int key) {
        if(this.cache.containsKey(key)){
            return cache.get(key);
        }
        else throw new KeyNotPresent("Given Key is not Present, Returning Key!");
    }

    @Override
    public void put(int key, int value) {
        if(this.cache.size() == this.capacity){
            throw new CapacityExceeded("Capacity Exceeded!");
        }
        else
            this.cache.put(key, value);
    }
}
