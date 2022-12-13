package co.school.student;

public class Student {
    private String  mStudentFirstName;
    private String mStudentLastName;
    private Student mStudentGender;
    private int mStudentAge;
    private String studentID; // auto generated , get refrence from database
    private int mStudentStandard;

    Student(){}

    public String getmStudentFirstName() {
        return mStudentFirstName;
    }

    public void setmStudentFirstName(String mStudentFirstName) {
        this.mStudentFirstName = mStudentFirstName;
    }

    public String getmStudentLastName() {
        return mStudentLastName;
    }

    public void setmStudentLastName(String mStudentLastName) {
        this.mStudentLastName = mStudentLastName;
    }

    public Student getmStudentGender() {
        return mStudentGender;
    }

    public void setmStudentGender(Student mStudentGender) {
        this.mStudentGender = mStudentGender;
    }

    public int getmStudentAge() {
        return mStudentAge;
    }

    public void setmStudentAge(int mStudentAge) {
        this.mStudentAge = mStudentAge;
    }

    public int getmStudentStandard() {
        return mStudentStandard;
    }

    public void setmStudentStandard(int mStudentStandard) {
        this.mStudentStandard = mStudentStandard;
    }
}
