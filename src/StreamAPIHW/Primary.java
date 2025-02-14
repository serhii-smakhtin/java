package StreamAPIHW;

import java.util.List;
import java.util.stream.Collectors;

public class Primary {
    public static void init() {
        List<Student> students = List.of(new Student("Alice", 16, List.of(new Grade("Math", 85), new Grade("Science", 92)), "High School A", new Address("New York", "1st Avenue")), new Student("Bob", 14, List.of(new Grade("Math", 75), new Grade("Science", 80)), "High School B", new Address("New York", "5th Avenue")), new Student("Charlie", 17, List.of(new Grade("Math", 95), new Grade("Science", 87)), "High School A", new Address("New York", "2nd Avenue")), new Student("Eve", 18, List.of(new Grade("Math", 65), new Grade("Science", 70)), "High School A", new Address("Chicago", "4th Avenue")), new Student("David", 16, List.of(new Grade("Math", 88), new Grade("Science", 88)), "High School C", new Address("New York", "3rd Avenue")));

        List<StudentGrade> topGrades = students.stream().filter(student -> student.getAge() > 15 && "New York".equals(student.getAddress().getCity())).flatMap(student -> student.getGrades().stream().map(grade -> new StudentGrade(student.getName(), student.getSchool(), grade.getSubject(), grade.getScore()))).sorted((sg1, sg2) -> Double.compare(sg2.score(), sg1.score())).limit(3).collect(Collectors.toList());

        System.out.println("");
        System.out.println("Stream API HW");
        topGrades.forEach(grade -> System.out.printf("%s, %s, %s, %.1f%n", grade.studentName(), grade.school(), grade.subject(), grade.score()));
    }
}
