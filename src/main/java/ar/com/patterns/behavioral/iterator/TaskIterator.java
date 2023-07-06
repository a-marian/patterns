package ar.com.patterns.behavioral.iterator;

public interface TaskIterator {

    Task getNext();
    boolean hasMore();
}
