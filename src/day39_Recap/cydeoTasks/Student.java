package day39_Recap.cydeoTasks;

public class Student extends Person {

    private int studentId;
    private String fieldOfStudy;



    public int getStudentId() {
        return studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }


    public void setStudentID(int studentId) {
        if(studentId<=0){
            System.out.println("invalid ID");
            System.exit(1);
        }
        this.studentId = studentId;
    }


    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy.isEmpty()||fieldOfStudy.isBlank()){
            System.out.println("invalid study field");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public void study(){
        System.out.println(getName()+ " is studying");

    }

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy) {
        super(name, age, gender);
        setStudentID(studentId);
        setFieldOfStudy(fieldOfStudy);

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
