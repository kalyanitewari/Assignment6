package Part2;

public class Result extends Student implements Exam {

    public Result(int rollNo, int mark1, int mark2) {
        super(rollNo, mark1, mark2);
    }

    @Override
    public double percent_cal(int mark1, int mark2) {
        return (mark1 + mark2) / 2.0;
    }

    public void displayResult() {
        super.display();
        System.out.println("Percentage: " + percent_cal(mark1, mark2) + "%");
    }

    public static void main(String[] args) {
        Result result = new Result(123, 80, 90);
        result.displayResult();
    }
}