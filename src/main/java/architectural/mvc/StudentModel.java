package architectural.mvc;

public class StudentModel {
    private String rollNo;
    private String name;

    String getRollNo() {
        return rollNo;
    }

    void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
