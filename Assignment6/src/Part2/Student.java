package Part2;

public class Student {
    int rollNo;
    int mark1;
    int mark2;

    public Student(int rollNo, int mark1, int mark2) {
        this.rollNo = rollNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}
