package LRUCache;

public class LRUMain {
    public static void main(String[] args) {
        LRUService lruService = new LRUService(5);
        lruService.putValue(2,12);
        lruService.putValue(4,16);
        lruService.putValue(6,20);
        lruService.putValue(8,24);
        lruService.putValue(10,28);
        System.out.println(lruService.getValue(6));
        System.out.println(lruService.getValue(12));
    }
}
