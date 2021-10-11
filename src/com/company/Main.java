package com.company;
class student_marks
{
    int p,c,m;

    student_marks()
    {
        p = 50;
        c = 60;
        m = 70;
    }
    void cal_sum_average()
    {
        int sum = 0, average = 0;
        sum = p + c + m;
        average = sum / 3;
        System.out.println("Sum is " + sum + "\n" + "avearge is " + average);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        student_marks obj = new student_marks();
        obj.cal_sum_average();
    }
}

