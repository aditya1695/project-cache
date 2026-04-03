package LRUCache;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LRUService {

    private int capacity;
    private static final Logger logger = Logger.getLogger(LRUService.class.getName());
    public LRUService(int capacity){
        this.capacity = capacity;
    }
    LRUCache cache = new LRUCache(capacity);

    public int getValue(int key){
        try {
            return cache.get(key);
        }
        catch (RuntimeException exception){
            logger.log(Level.INFO, exception.getMessage());
        }
        return key;
    }

    public void putValue(int key, int value){
        try{
            this.cache.put(key, value);
        }
        catch (RuntimeException exception){
            logger.log(Level.WARNING, exception.getMessage());
        }
    }
}
