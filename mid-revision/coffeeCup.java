public class coffeeCup {
    String color = "white";
    double temp = 20.0;
    boolean empty = true;

    void spill() {
            System.out.println("the cup is empty!");
        }
    
    void drink() {
            System.out.println("the cup is not empty");
        }
        public static void main(String[] args) {
              coffeeCup cup = new coffeeCup();
              if (cup.empty == true) {
                  cup.spill();
                }
              else {
                cup.drink();
                }
    }
}
