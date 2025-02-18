import java.util.Scanner;

class Student {
    int id;
    String n;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        System.out.println("Enter Name: ");
        s1.n = sc.nextLine();
        System.out.println("Enter ID : ");
        s1.id = sc.nextInt();

        System.out.println("ID: " + s1.id + "\nName: " + s1.n);
        sc.close();
    }
}