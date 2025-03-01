package exercise;
/*/
create a class called production having method
 that add existing stock and 
new stock and calculate the total value as the prince is 150 per unit

create a class called Student, having a method called total and avg, 
that calculate marks for 5 courses and its average and then 
print out its average.

create a class called bank having method called loan where by
we need to know amount to be paid at the end of year if the interest is
1.2 per month. */

public class Student {
    public static void main(String[] args) {
        int sum = total(80, 90, 70, 60, 76);
        System.out.println("average is: " + avg(sum));
    }

    static int total(int a, int b, int c, int d, int e) {
        int total = a + b + c + d + e;
        return total;

    }

    static double avg(int total) {
        double avg = total / 5;
        return avg;
    }
}
