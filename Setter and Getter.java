import java.time.Year;

class Student {
    // Data members
    private int id;
    private String name;
    private String className;
    private char section;
    private int birthYear;

    // Default constructor
    public Student() {
        this.id = 0;
        this.name = "Rayn";
        this.className = "Not Assigned";
        this.section = 'A';
        this.birthYear = 2000;
    }

    // Parameterized constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.className = "Not Assigned";
        this.section = 'A';
        this.birthYear = 2000; // Default birth year
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Method to calculate age
    public int calculateAge() {
        return Year.now().getValue() - birthYear;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using the default constructor
        Student student1 = new Student();
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 ID: " + student1.getId());
        System.out.println("Student 1 Age: " + student1.calculateAge());

        // Using the parameterized constructor
        Student student2 = new Student(101, "Alice");
        student2.setId(102);
        student2.setName("Bob");
        System.out.println("\nStudent 2 Name: " + student2.getName());
        System.out.println("Student 2 ID: " + student2.getId());
        System.out.println("Student 2 Age: " + student2.calculateAge());
    }
}
