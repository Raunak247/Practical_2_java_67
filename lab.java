import java.util.Scanner;



public class lab {

    Scanner sc = new Scanner(System.in);
    int totalPCs = 0;   
    int count = 0;      

    void studentDetails() {
        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Student Age:");
        int age = sc.nextInt();
        sc.nextLine(); 

        count++;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void PCDetails() {
        System.out.println("Enter the no. of PC's in the lab:");
        totalPCs = sc.nextInt();
        sc.nextLine(); 

        System.out.println("No of PC's in the lab: " + totalPCs);
    }

    int noOfOccupiedPCs() {
        if (count > totalPCs) {
            System.out.println("All PCs are occupied.");
            return totalPCs;
        } else {
            System.out.println("Number of occupied PCs: " + count);
            return count;
        }
    }
    
    

    public static void main(String[] args) {

        lab labObj = new lab();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Student Details");
            System.out.println("2. PC Details");
            System.out.println("3. No. of PCs Occupied");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = labObj.sc.nextInt();
             labObj.sc.nextLine(); 

            switch (choice) {
                case 1:
                    labObj.studentDetails();
                    break;

                case 2:
                    labObj.PCDetails();
                    break;

                case 3:
                    labObj.noOfOccupiedPCs();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

