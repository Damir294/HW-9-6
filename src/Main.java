public class Main {
    public static void main(String[] args) {

        int one = 200;
        int two = 38;
        int free = 29;
        if (one > two && one > free) {
            System.out.println("Число " + one + " большее");
        } else if (two > one && two > free) {
            System.out.println("Число " + two + " большее");
        } else if (free > one && free > two) {
            System.out.println("Число " + free + "большее");
        } else if (one == two || two == free || free == one) {
            System.out.println("Два числа равны");
        } else {
            System.out.println("Числа равны");
        }
    }
}
