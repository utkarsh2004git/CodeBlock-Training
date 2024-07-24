package july_24;

public class StudentClient {

    public static void main(String[] args) {
        Student mystd=new Student();
        mystd.setAge(20);
        mystd.setName("Utkarsh");
        System.out.println(mystd.getName()+" "+mystd.getAge());


        Student mystd2=new Student("Utkarsh1",55);
        System.out.println(mystd2.getName()+" "+mystd2.getAge());
    }

}
