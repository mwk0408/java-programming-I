
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class gradeStat {
    private ArrayList<Integer> all;
    private ArrayList<Integer> pass;
    private int sum=0;
    private int passSum=0;
    private int count=0;
    private int passCount=0;
    public gradeStat() {
        this.all=new ArrayList<>();
        this.pass=new ArrayList<>();
    }
    public void add(int num) {
        if (num>=0 && num <=100) {
            this.all.add(num);
            if (num>=50) {
                this.pass.add(num);
            }
        }
    }
    public double average() {
        if (!this.all.isEmpty()) {
            for (Integer integer : this.all) {
                this.sum+=integer;
                this.count+=1;
            }
            return 1.0*this.sum/this.count;
        }
        return -1;
    }
    public double passingAverage() {
        if (!this.pass.isEmpty()) {
            for (Integer integer : this.pass) {
                this.passSum+=integer;
                this.passCount+=1;
            }
            return 1.0*this.passSum/this.passCount;
        }
        return -1;
    }
    public double passingPercent() {
        if (!this.all.isEmpty()) {
            return 100.0*this.passCount/this.count;
        }
        return -1;
    }
    public void printGrade() {
        int[] grade={0,0,0,0,0,0};
        for (Integer integer : this.all) {
            if (integer>=90) {
                grade[0]++;
            } else if (integer>=80) {
                grade[1]++;
            } else if (integer>=70) {
                grade[2]++;
            } else if (integer>=60) {
                grade[3]++;
            } else if (integer>=50) {
                grade[4]++;
            } else {
                grade[5]++;
            }
        }
        String temp="";
        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade[i]; j++) {
                temp+="*";
            }
            System.out.println((5-i)+":"+temp);
            temp="";
        }
    }
}
