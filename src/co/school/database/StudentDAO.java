package co.school.database;

import co.school.student.Student;

import java.util.ArrayList;

public interface StudentDAO {
    public int insertStudentToDataBase(ArrayList<Student> studentList);
    public Student getStudentInfromation(int studentID);
}
