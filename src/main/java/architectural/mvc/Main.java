package architectural.mvc;

public class Main {

    public static void main(String[] args) {

        // fetch student record based on his roll no from the database
        StudentModel model = getStudentFromDatabase();
        StudentView view = null;
        boolean view1 = false; // set view1 or 2
        // Create a view : to write student details on console
        if (view1)
            view = new StudentView();
        else
            view = new StudentView2();

        StudentController controller = new StudentController(model, view);
        controller.updateView();

        // update model data
        controller.setStudentName("John");
        controller.setStudentRollNo("11");

        controller.updateView();

    }

    private static StudentModel getStudentFromDatabase() {
        StudentModel student = new StudentModel();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}

