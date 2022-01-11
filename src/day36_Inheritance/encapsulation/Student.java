package day36_Inheritance.encapsulation;

public class Student {

       private String name;
        private int age;
        private char gender;
        private char grade;
        private String schoolName;
        public static boolean isStudent=true;
        public static boolean isHuman=true;


        public String  getName(){
            return name;
        }

        public int  getAge(){
            return age;
        }

        public char getGender(){
            return gender;
        }

        public char getGrade(){
            return grade;
        }

        public String getSchoolName(){
            return schoolName;
        }



        //setter name
        public void setName(String name){
            this.name=name;
        }
        //setter age
        public void  setAge(int age){
            if(age>90||age<5){
                return; //exits the method
            }
            this.age=age;
        }

        //setter gender
        public void setGender(char gender){
            if(!(gender=='F'||gender=='M')){
                return;
            }
            this.gender=gender;
        }

        //setter grade
        public void setGrade(char grade){
            if(!(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F')){
                return;
            }
            this.grade=grade;
        }
        //setter schoolName
        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }

        //study method
        public void study(){
            System.out.println(name+" is studying at "+schoolName);
        }

        //constructor
        public Student(String name, int age, char gender, char grade, String schoolName) {
            setName(name);
            setAge(age);
            setGender(gender);
            setGrade(grade);
            setSchoolName(schoolName);
        }

        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    ", grade=" + grade +
                    ", schoolName='" + schoolName + '\'' +
                    '}';
        }
    }
/*
1. Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName

            Encapsulate all the fileds (at leat encapsulate two fields manually)
                    requirments:
                        1. age should not be set less than 5 or greater than 90
                        2. gender should not be set to any chanarcter other than: 'M' and 'F'
                        3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all teh fields when the object is created
                        (requirments of fileds in the above must be applied)


            Methods:
                study()
                toString()
 */

