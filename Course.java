public class Course {
    int sem,marks;
    String sub;
    Course(int sem, int marks, String sub) {
        this.sem = sem;
        this.marks = marks;
        this.sub = sub;
    }

    void display() {
        System.out.println("Semester: " + sem);
        System.out.println("Marks: " + marks);
        System.out.println("Subject: " + sub);
    }
    public static void main(String[] args) {
        Course course1 = new Course(2, 85, "Java Programming");
        Course course2 = new Course(3, 90, "Data Structures");
        course1.display();
        course2.display();
    }
}   

