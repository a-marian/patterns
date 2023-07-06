package ar.com.patterns.behavioral.iterator;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WorkTaskIterator implements TaskIterator {

    private DayType type;
    private WorkTaskPlanner workTaskPlanner;
    private Task[] tasks;
    WorkTaskIterator(WorkTaskPlanner planner, DayOfWeek day, String taskName){
        this.type = DayType.WORKDAYS;
        this.workTaskPlanner = planner;

    }
    @Override
    public Task getNext() {
        return null;
    }

    @Override
    public boolean hasMore() {
        return false;
    }
}
