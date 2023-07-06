package ar.com.patterns.behavioral.iterator;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class WorkTaskPlanner  {

    private List<Task> tasks;
    WorkTaskPlanner(List<Task> cache){
        if(cache != null) {
            this.tasks = cache;
        }else {
            this.tasks = new ArrayList<>();
        }
    }

}
