package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Alice", 20, List.of("Math", "Physics")),
                new Student("Viktor", 25, List.of("Biology", "Math")),
                new Student("Alex", 26, List.of("History")),
                new Student("Bob", 22, List.of("Biology", "Math")),
                new Student("Charlie", 21, List.of("History", "Math", "English")),
                new Student("Diana", 20, List.of("Math", "Biology", "Physics")),
                new Student("Eve", 23, List.of("English", "History"))
        );

        List<String> filteredMath = students.stream()
                .filter(s -> s.getSubjects().contains("Math"))
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(filteredMath);

        long uniqueSubjectContains = students.stream()
                .flatMap(s -> s.getSubjects().stream())
                .distinct()
                .count();

        System.out.println(uniqueSubjectContains);

        Map<String, Long> subjectToCount = students.stream()
                .flatMap(s -> s.getSubjects().stream().distinct())
                .collect(Collectors.groupingBy(
                        subject -> subject,
                        Collectors.counting()
                ));
        System.out.println(subjectToCount);

        List<String> moreThanTwoSubjects = students.stream()
                .filter(s -> s.getSubjects().size() > 2)
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(" > 2 subjects: " + moreThanTwoSubjects);

        Map<String, List<String>> subjectToStudents = students.stream()
                .flatMap(s -> s.getSubjects().stream()
                        .map(subject -> Map.entry(subject, s.getName())))
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())
                ));
        System.out.println(subjectToStudents);

        List<String> top3Subjects = subjectToStudents.entrySet().stream()
                .sorted(Comparator.comparing(e -> e.getValue().size(), Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(top3Subjects);

        double averageSubjectCount = students.stream()
                .mapToInt(s -> s.getSubjects().size())
                .average()
                .orElse(0);
        System.out.printf("%.2f\n", averageSubjectCount);

        List<String> englishStudentsByAge = students.stream()
                .filter(s -> s.getSubjects().contains("English"))
                .sorted(Comparator.comparing(Student::getAge).reversed())
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(englishStudentsByAge);

        List<String> top3Subjects2 = subjectToStudents.entrySet().stream()
                .sorted(Comparator.comparing(e -> e.getValue().size(), Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(top3Subjects2);

        List<String> allMath = students.stream()
                .filter(s -> s.getSubjects().contains("Math"))
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("Math is studied by: " + allMath);

        long biologyStudents = students.stream()
                .filter(s -> s.getSubjects().contains("Biology"))
                .count();
        System.out.println("Biology is taught by " + biologyStudents + " students.");

        Set<String> uniqueSubjects = students.stream()
                .flatMap(s -> s.getSubjects().stream().distinct())
                .collect(Collectors.toSet());
        System.out.println("List of subjects: " + uniqueSubjects);

        Map<Integer, List<Student>> groupedByAge = students.stream()
                .collect(Collectors.groupingBy(Student::getAge));
        System.out.println("Students grouped by age: " + groupedByAge);

        String oldestStudent = students.stream()
                .max(Comparator.comparingInt(Student::getAge))
                .map(Student::getName)
                .orElse("Немає студентів");
        System.out.println("Oldest student: " + oldestStudent);

        List<Student> moreThan2Subjects = students.stream()
                .filter(s -> s.getSubjects().size() > 2)
                .collect(Collectors.toList());
        System.out.println("Students studying more than 2 subjects: " + moreThan2Subjects);

        List<String> alphabetStudentsList = students.stream()
                .map(Student::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("List of students in alphabetical order: " + alphabetStudentsList);

        List<String> lengthNameSort = students.stream()
                .map(Student::getName)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("Sorted by students name length: " + lengthNameSort);
    }


    String name;
    int age;
    List<String> subjects;

    public Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return name;
    }
}
