class Student {
    int id;
    String name;

    // Constructor using 'this' keyword to refer to instance variables
    Student(int id, String name) {
        this.id = id; // 'this' refers to the instance variable 'id'
        this.name = name; // 'this' refers to the instance variable 'name'
    }

    // Method to display student details
    void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }

    // Using 'this' to call another method
    void show() {
        this.display(); // Calls the display() method
    }
}

public class rectangle {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(1, "John");
        
        // Call the show() method
        student.show();
    }
}