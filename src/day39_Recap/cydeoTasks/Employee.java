package day39_Recap.cydeoTasks;

public class Employee extends Person {
    private int employeeID;
    private  String jobTitle;
    private double salary;


    public int getEmployeeID() {
        return employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }


    public void setEmployeeID(int employeeID) {
        if(employeeID<=0){
            System.out.println("Invalid EmployeeID");
            System.exit(1);
        }
        this.employeeID = employeeID;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isEmpty()||jobTitle.isBlank()){
            System.out.println("Invalid job title");
                System.exit(1);
            }
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            System.out.println("Invalid salary");
            System.exit(1);
        }
        this.salary = salary;
    }


    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public void work(){
        System.out.println(getName()+ " is working" );
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void sleep() {
        super.sleep();
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}


/*
Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
 */
