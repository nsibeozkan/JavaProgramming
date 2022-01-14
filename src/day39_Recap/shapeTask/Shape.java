package day39_Recap.shapeTask;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name==null){
            System.err.println("name can not be null");
            System.exit(1);//1:
        }

        if(name.isEmpty()||name.isBlank()){
            System.err.println("Invalid");
            System.exit(1);//something went wrong
        }
        this.name=name;
    }

    public Shape(String name) {
        setName(name);
    }

    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }








}
