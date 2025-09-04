package lpa.collections.challenge1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        ScheduleManager scheduleManager = new ScheduleManager();

        Lesson math = new Lesson("Math", "Mr.Smith");
        Lesson literature = new Lesson("Literature", "Ms.Brown");
        Lesson history = new Lesson("History", "Mr.Black");
        Lesson physicalEducation = new Lesson("Physical Education", "Mr.Hill");
        Lesson biology = new Lesson("Biology", "Ms.Green");

        scheduleManager.addLesson(DayOfWeek.MONDAY, math);
        scheduleManager.addLesson(DayOfWeek.MONDAY, literature);
        scheduleManager.addLesson(DayOfWeek.MONDAY, history);
        scheduleManager.addLesson(DayOfWeek.TUESDAY, literature);
        scheduleManager.addLesson(DayOfWeek.WEDNESDAY, history);
        scheduleManager.addLesson(DayOfWeek.THURSDAY, physicalEducation);
        scheduleManager.addLesson(DayOfWeek.FRIDAY, biology);

        //duplicate test
        scheduleManager.addLesson(DayOfWeek.FRIDAY, biology);
        scheduleManager.addLesson(DayOfWeek.WEDNESDAY, history);
        //remove test
        scheduleManager.removeLesson(DayOfWeek.WEDNESDAY, history);
        //schedule
        System.out.println("=====FULL SCHEDULE=====");
        scheduleManager.printSchedule();
        //schedule on Monday
        System.out.println("\n=====MONDAY SCHEDULE=====");
        for (Lesson lesson : scheduleManager.getLessons(DayOfWeek.MONDAY)) {
            System.out.println("  - " + lesson);
        }
        //Search by teacher
        System.out.println("\n=====DAYS Mr. Smith Teaches=====");
        List<DayOfWeek> days = scheduleManager.findDaysByTeacher("Mr.Smith");
        System.out.println(days);


        /*ScheduleManager manager = new ScheduleManager();

        Lesson math = new Lesson("Math", "Mr.Smith");
        Lesson literature = new Lesson("Literature", "Ms.Brown");
        Lesson history = new Lesson("History", "Mr.Black");
        Lesson physicalEducation = new Lesson("Physical Education", "Mr.Hill");

        manager.addLesson(DayOfWeek.TUESDAY, literature);
        manager.addLesson(DayOfWeek.TUESDAY, history);
        manager.addLesson(DayOfWeek.TUESDAY, physicalEducation);
        manager.addLesson(DayOfWeek.THURSDAY, math);
        manager.addLesson(DayOfWeek.MONDAY, math);
        manager.addLesson(DayOfWeek.MONDAY, math);

        manager.removeLesson(DayOfWeek.MONDAY, math);
        manager.removeLesson(DayOfWeek.THURSDAY, math);

        Set<Lesson> tuesdayLessons = manager.getLessons(DayOfWeek.TUESDAY);
        System.out.println("Tuesday lessons list:");
        for (Lesson lesson : tuesdayLessons) {
            System.out.println(lesson);
        }

        manager.printSchedule();

        List<DayOfWeek> days = manager.findDaysByTeacher("Mr.Black");
        System.out.println("Mr.Black teaches on: " + days);*/
        /*Lesson l1 = new Lesson("Math", "Mr. Smith");
        Lesson l2 = new Lesson("Math", "Mr. Smith");

        System.out.println(l1.equals(l2));
        System.out.println(l1.hashCode() == l2.hashCode());

        Set<Lesson> lessons = new HashSet<>();
        lessons.add(l1);
        lessons.add(l2);
        System.out.println(lessons.size());*/
    }
}
