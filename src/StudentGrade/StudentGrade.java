package StudentGrade;

import java.util.ArrayList;
import java.util.Collections;

public class StudentGrade implements Comparable<StudentGrade>, Contain<StudentGrade> {
    int mathKnowledge;
    int physicsKnowledge;
    int historyKnowledge;
    int average;
    String name;
    ArrayList<StudentGrade> grades;

    public StudentGrade(int mathKnowledge, int physicsKnowledge, int historyKnowledge, String name) {
        this.mathKnowledge = mathKnowledge;
        this.physicsKnowledge = physicsKnowledge;
        this.historyKnowledge = historyKnowledge;
        this.name = name;
        this.average = (this.mathKnowledge + this.physicsKnowledge + this.historyKnowledge) / 3;
    }

    public StudentGrade() {
        this.grades = new ArrayList<>();
    }

    public void listGrades(StudentGrade student) {
        if (this.grades == null) {
            this.grades = new ArrayList<>();
        }
        this.grades.add(student);
        Collections.sort(this.grades);
        System.out.println(this.grades);
    }

    @Override
    public int compareTo(StudentGrade other) {
        return Integer.compare(this.average, other.average);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', average=" + average + "}";
    }

    @Override
    public boolean isContain(ArrayList<StudentGrade> list, StudentGrade e) {
        boolean isContained = list.contains(e);
        if (isContained) {
            System.out.println(e.name + " is on the list.");
        } else {
            System.out.println(e.name + " is not included in the list.");
        }
        return isContained;
    }
}
