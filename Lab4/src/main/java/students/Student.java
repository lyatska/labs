package students;

public class Student {

    public Specialty specialty;
    public int physicsMark;
    public int mathMark;
    public int compScienceMark;
    public int course;
    public int number;
    public String surname;

    public Student(int number, String surname, int course, Specialty specialty, int physicsMark, int mathMark, int compScienceMark) {
        this.number = number;
        this.surname = surname;
        this.course = course;
        this.specialty = specialty;
        this.physicsMark = physicsMark;
        this.mathMark = mathMark;
        this.compScienceMark = compScienceMark;
    }
}
