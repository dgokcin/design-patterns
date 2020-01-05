package architectural.mvc;

public class StudentView2 extends StudentView {

    @Override
    public void printStudentDetails(String studentName, String studentRollNo) {
        //super.printStudentDetails(studentName, studentRollNo);
        System.out.println("[Student Name " + studentName + "]" + " ---- " + "[" + "Roll Number " + studentRollNo + "]");
    }
}

