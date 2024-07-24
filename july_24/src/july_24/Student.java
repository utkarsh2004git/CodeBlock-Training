package july_24;

public class Student {

    private String name;
    private int age;

    public Student(){

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>0){
            this.age = age;
        }
        else System.out.println("Age Cant be negative");
    }
}
