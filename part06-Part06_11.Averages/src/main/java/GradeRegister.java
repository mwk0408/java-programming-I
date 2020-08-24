
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private int total=0;
    private int count=0;

    public GradeRegister() {
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.total+=points;
        this.count+=1;
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
    public double averageOfGrades() {
        if (grades.isEmpty()) {
            return -1;
        }
        int grade=5;
        int sum=0;
        while (grade>=0) {
            sum+=grade*numberOfGrades(grade);
            grade--;
        }
        return 1.0*sum/this.count;
    }
    public double averageOfPoints() {
        if (grades.isEmpty()) {
            return -1;
        }
        return 1.0*this.total/this.count;
    }
    public static int pointsToGrade(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
