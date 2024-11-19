import java.util.Scanner;

public class SampleCode {
    public static int getMaxMarks(Student ar[]) {
        int max = 0;
        for (Student k : ar) {
            if (k.getMarks() > max) {
                max = k.getMarks();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Student ar[] = new Student[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            ar[i] = new Student(); // Initialize the Student object

            System.out.print("Enter name for student " + (i + 1) + ": ");
            ar[i].setName(sc.nextLine());

            System.out.print("Enter marks for student " + (i + 1) + ": ");
            ar[i].setMarks(sc.nextInt());
            sc.nextLine(); // consume the newline
        }

        System.out.println("Maximum marks: " + getMaxMarks(ar));
    }
}

class Student {
    private String name;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}
