public class looping {
    public static void main(String[] args) {
        //initialization
        //condition or limitation
        //incrementation
        int marks;
        for(marks=1;marks<=20;marks++){
            if(marks/2==0)
            System.out.println("This are even numbers: "+marks);
            else
            System.out.println("This are odd numbers: "+marks);
            for( int i=1; i<=4; i--)
                for(int j=1; j<=3; j++){
                    System.out.println("the output is: "+j);
                }
        }
    }
}
