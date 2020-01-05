package architectural.mvc;

class StudentController {
    private StudentModel model;
    private StudentView view;

    StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    String getStudentName() {
        return model.getName();
    }

    void setStudentName(String name) {
        model.setName(name);
    }

    String getStudentRollNo() {
        return model.getRollNo();
    }

    void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}

