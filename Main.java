public class Main {
    public static void main(String[] args) {
        int temperature = 15;
        int personAge = 35;
        boolean isCold = true;

        if (temperature < 20 && isCold) { // && - логический оператор И (AND)
            System.out.println("You can go for a walk");
        }

        if (temperature < 30 && personAge == 50) {
            System.out.println("Stay home");

        }
    }
}
