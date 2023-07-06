package ar.com.patterns.behavioral.iterator;

 interface TaskPlanner {

  TaskIterator planWorkingDaysTasks(String taskName);
  TaskIterator planHolidaysTasks(String taskName);


}
