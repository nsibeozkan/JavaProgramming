package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("Tahir",'M',30,110000);
        System.out.println(employee1);
        employee1.setAge(32);
        employee1.setSalary(employee1.getSalary()+30000);
        System.out.println(employee1);
       // System.out.println(employee1.getName());
      //  System.out.println(employee1.getGender());

        Employee employee2=new Employee("Aygun",'F',31,115000);
        employee2.setName("Elvira");
        employee2.setSalary(employee2.getSalary()+15000);
        System.out.println(employee2);




    }
}
