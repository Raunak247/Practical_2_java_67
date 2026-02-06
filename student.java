public class student {

    String collegeName = "YCCE";
    String department = "Computer Engineering";
    String studentName;
    int year;

    void showDetails() {
        System.out.println("College Name :" + collegeName);
        System.out.println("Department :" + department);
        System.out.println("Student Name : " + studentName);
        System.out.println("Year : " + year);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {

        // Student 1
        student s1 = new student();
        s1.studentName = "rk";
        s1.year = 1;

        // Student 2
        student s2 = new student();
        s2.studentName = "Rahul";
        s2.year = 2;

        // Student 3
        student s3 = new student();
        s3.studentName = "Anjali";
        s3.year = 3;

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
    }
}
