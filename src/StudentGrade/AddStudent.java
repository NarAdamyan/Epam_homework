package StudentGrade;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStudent {
    public static void main(String[] args) {
        StudentGrade student1 = new StudentGrade(0, 0, 3, "Narine");
        StudentGrade student2 = new StudentGrade(8, 10, 7, "Anna");
        StudentGrade student3 = new StudentGrade(8, 10, 10, "Emily");
        StudentGrade gradeManager = new StudentGrade();
        gradeManager.listGrades(student1);
        gradeManager.listGrades(student2);
        gradeManager.isContain(gradeManager.grades, student3);
        ArrayList<Number> list = new ArrayList<>(Arrays.asList(1, 2, 3.3, 5, 6.6, 109));
    }


}
