package ar.com.patterns.structural.adapter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumberAdapter implements Sorter{
    NumberSorter numberSorter;

    public SortNumberAdapter(){
        numberSorter = new NumberSorter();
    }

    @Override
    public int[] sort(int[] arrayToSort) {
        List<Integer> integers = Arrays.stream(arrayToSort).boxed().collect(Collectors.toList());
        numberSorter.sortNumbers(integers);
        return integers.stream().mapToInt(i -> i).toArray();
    }
}
