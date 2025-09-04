package lpa.collections.challenge1;

import lpa.lambdas.Person;

import java.util.*;
import java.util.stream.Collectors;

public class ScheduleManager {
    private EnumMap<DayOfWeek, LinkedHashSet<Lesson>> schedule;

    public ScheduleManager() {
        schedule = new EnumMap<>(DayOfWeek.class);
        for (DayOfWeek day : DayOfWeek.values()) {
            schedule.put(day, new LinkedHashSet<>());
        }
    }

    public void addLesson(DayOfWeek day, Lesson lesson) {
        if (schedule.get(day).add(lesson)) {
            System.out.println("Lesson added.");
        } else {
            System.out.println("Lesson already exist.");
        }
    }

    public void removeLesson(DayOfWeek day, Lesson lesson) {
        if (schedule.get(day).remove(lesson)) {
            System.out.println("Lesson removed.");
        } else {
            System.out.println("Lesson not found.");
        }
    }

    public Set<Lesson> getLessons(DayOfWeek day) {
        return Collections.unmodifiableSet(schedule.get(day));
    }

    public void printSchedule() {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day + " ");
            Set<Lesson> lessons = schedule.get(day);
            if (lessons.isEmpty()) {
                System.out.println("  (no lessons)");
            } else {
                for (Lesson lesson : lessons) {
                    System.out.println("  - " + lesson);
                }
            }
        }
    }

    public List<DayOfWeek> findDaysByTeacher(String teacher) {
        List<DayOfWeek> result = new ArrayList<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            for (Lesson lesson : schedule.get(day))
                if (lesson.getTeacher().equalsIgnoreCase(teacher)) {
                    result.add(day);
                    break;
                }
        }
        return result;
    }

}
