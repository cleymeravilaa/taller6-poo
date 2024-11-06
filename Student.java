public class Student {
    private String name;
    private int age;

    public Student(){
        this("Sin nombre", 0); 
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showStudent(){
        System.out.println("Student name: " + this.name);
        System.out.println("Student age: " + this.age);
    }

    // Nos arroja un error ya que no se puede usar this dentro del contexto estatico 
    /* 
    public static void setName(String name){
       // Error: Cannot use this in static context
        this.name = name;
    }
    */    

    // Manera Correcta
    public void setName(String name){
        this.name = name;
    }
}
