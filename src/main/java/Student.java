public class Student {
    String name;
    public Student(){
        name = "Unknown" ;
    }
    public Student(String Student1){
        name = Student1;
    }
    public String getName(){
        return name;
    }
    public String setname(){
        name = "Poornima";
        return name ;
    }
    public static void main(String[] args){
        Student Student = new Student();
        System.out.println("Name of Student is" +Student.getName() );
        Student Student1 = new Student();
        System.out.println("Name of Student is" +Student1.setname());

    }
}
