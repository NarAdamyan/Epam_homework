package Teacher;

public class Salary {
    private Teacher teacher;

    public Salary(Teacher teacher){
        this.teacher = teacher;
    }


    public int TeacherSalary() {
        return teacher.calculateSalary();
    }
}
