package day30_CustomClass;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public int id;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;

     //control A-->generate--> en usteki ve hepsini sec sonra da basina void setInfo ekle.
    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }


    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }







}
/*

        Attributes:
            name, id, gender, jobTitle, salary, isFullTime(boolean)

        Actions:
            toString(): to be bale to print each employee object
            setInfo(): to be able to set all the attributes
            work()...

CapitalOne Class:

    1. create 5 Employee objects
    2. store those 5 employee objects into an array
    3. how many employees are full time employees?
    4. What's the minimum salary
    5. what's the maximum salary
 */