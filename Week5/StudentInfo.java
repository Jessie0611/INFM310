public class StudentInfo {
    public static void main(String[] args) {
        // Create two Student objects using different constructors
        Student student1 = new Student();
        Student student2 = new Student();

        // Set data for student1
        student1.setLastName("Battles");
        student1.setSocialSecurityNumber("123-45-6789");
        student1.setStudentID("1234");

        // Set data for student2
        student2.setLastName("Smith");
        student2.setSocialSecurityNumber("987-65-4321");
        student2.setStudentID("5678");

        // Display the data for student1
        System.out.println("Student 1 Information:");
        System.out.println("Last Name: " + student1.getLastName());
        System.out.println("Social Security Number: " + student1.getSocialSecurity());
        System.out.println("Student ID: " + student1.getStudentID());
        System.out.println();

        // Display the data for student2
        System.out.println("Student 2 Information:");
        System.out.println("Last Name: " + student2.getLastName());
        System.out.println("Social Security Number: " + student2.getSocialSecurity());
        System.out.println("Student ID: " + student2.getStudentID());
    }
}
