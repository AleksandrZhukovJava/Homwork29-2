public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 18;
        if (age < 18) {
            System.out.printf("Если возраст человека равен %s, он не достиг совершеннолетия, нужно немного подождать%n", age);
        } else {
            System.out.printf("Если возраст человека равен %s, то он совершеннолетний\n", age);
        }

        System.out.println("Task 2");
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        System.out.println("Task 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }

        System.out.println("Task 4");
        int currentAge = 18;
        if (currentAge > 2 && currentAge <= 6 ){
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в сад%n", currentAge);
        }
        if (currentAge > 6 && currentAge <= 17){
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в школу%n", currentAge);
        }
        if (currentAge > 17 && currentAge <= 24){
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в университет%n", currentAge);
        }
        if (currentAge > 24){
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить на работу %n", currentAge);
        }

        System.out.println("Task 5");
        int childAge = 2;
        if (childAge < 5){
            System.out.printf("Если возраст ребенка равен %s, то ему нельзя кататься на аттракционе%n", childAge);
        }
        if (childAge >= 5 && childAge < 14){
            System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе в сопровождении взрослого%n", childAge);
        }
        if (childAge >= 14){
            System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе без сопровождения взрослого%n", childAge);
        }

        System.out.println("Task 6");
        int wagonCapacity = 102;
        int seatCapacity = 60;
        int position = 200;

        if (position <= seatCapacity){
            System.out.println("Можно посидеть");
        }
        if (position > seatCapacity && position <= wagonCapacity){
            System.out.println("Можно только стоять");
        }
        if (position > wagonCapacity){
            System.out.println("Поехать не получится");
        }

        System.out.println("Task 7");
        int first = 1;
        int second = 2;
        int third = 2;

        if (first > second && first > third){
            System.out.println("first больше всех");
        }
        if (second > first && second > third){
            System.out.println("second больше всех");
        }
        if (third > second && third > first) {
            System.out.println("third больше всех");
        }
    }
}