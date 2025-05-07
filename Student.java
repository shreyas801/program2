public class Student {
    String name;
    int Age;
    String Dob;

    Student(String name, int Age, String Dob) {
        this.name = name;
        this.Age = Age;
        this.Dob = Dob;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + Age);
        System.out.println("Date of Birth: " + Dob);
    }
    public static void main(String[] args) {
        Student student1 = new Student("John", 20, "01/01/2003");
        student1.display();
    }
}

