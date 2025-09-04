package lpa.collections.challenge1;

import java.util.Objects;

public class Lesson {
    private String subject;
    private String teacher;

    public Lesson(String subject, String teacher) {
        this.subject = subject;
        this.teacher = teacher;
    }

    public String getSubject() {
        return subject;
    }

    public String getTeacher() {
        return teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return Objects.equals(subject, lesson.subject) &&
                Objects.equals(teacher, lesson.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, teacher);
    }

    @Override
    public String toString() {
        return "Lesson: " + subject + ", teacher is - " + teacher;
    }
}
