package ar.com.patterns.behavioral.iterator;

public class HomeTaskIterator  implements TaskIterator {

    private String day;
    private Task[] cache;
    private HomeTaskPlanner homeTaskPlanner;
    @Override
    public Task getNext() {
        return null;
    }

    @Override
    public boolean hasMore() {
        return false;
    }
}
