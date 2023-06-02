package ru.job4j.queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class ScheduleTaskTest {
    @Test
    void whenTwoDirectorTaskThenReadMethodTest() {
        Comparator<Task> comparator = new TaskByPositionAsc().thenComparing(new TaskByUrgencyDesc());
        ScheduleTask scheduleTask = new ScheduleTask(comparator);
        scheduleTask.addTask(new Task(Position.DEPARTMENT_HEAD, "description_1", 10));
        scheduleTask.addTask(new Task(Position.DIRECTOR, "description_2", 4));
        scheduleTask.addTask(new Task(Position.DIRECTOR, "description_3", 8));
        String expected = "description_3";
        String result = scheduleTask.readTask().description();
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwoDepartmentHeadTaskAndEqualUrgencyThenGetMethodTest() {
        Comparator<Task> comparator = new TaskByPositionAsc().thenComparing(new TaskByUrgencyDesc());
        ScheduleTask scheduleTask = new ScheduleTask(comparator);
        scheduleTask.addTask(new Task(Position.DEPARTMENT_HEAD, "description_1", 7));
        scheduleTask.addTask(new Task(Position.MANAGER, "description_2", 10));
        scheduleTask.addTask(new Task(Position.DEPARTMENT_HEAD, "description_3", 7));
        String expected = "description_1";
        String result = scheduleTask.getTask().description();
        Assertions.assertThat(result).isEqualTo(expected);
        scheduleTask.getTask();
        expected = "description_2";
        result = scheduleTask.getTask().description();
        Assertions.assertThat(result).isEqualTo(expected);
    }

}