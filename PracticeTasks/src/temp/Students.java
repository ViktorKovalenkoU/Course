package temp;

import java.util.*;

public class Students {
    public static void main(String[] args) {
        List<Students.Student> students = new ArrayList<>();
        students.add(new Students.Student(Arrays.asList("Math", "Biology", "Physics")));
        students.add(new Students.Student(Arrays.asList("Programming", "Sport", "Math")));
        students.add(new Students.Student(Arrays.asList("Programming", "Biology", "Math")));

        Map<String, Integer> studentCount = new HashMap<>();
        for (Students.Student student : students) {
            for (String subject : student.getSubjects()) {
                if (studentCount.containsKey(subject)) {
                    studentCount.put(subject, studentCount.get(subject) + 1);
                } else {
                    studentCount.put(subject, 1);
                }
            }
        }
        System.out.println(studentCount);
    }

    static class Student {
        private String id;
        private String name;
        private List<String> subjects;

        public Student(List<String> subjects) {
            this.subjects = subjects;
        }

        public List<String> getSubjects() {
            return subjects;
        }
    }
}

