import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(temperatureAndAge(23,37));
        System.out.println(temperatureAndAge(18,25));
        System.out.println(temperatureAndAge(35,27));
        System.out.println(temperatureAndAge(37,-7));
        System.out.println(temperatureAndAge(generateRandomAge(),35));
        System.out.println(generateRandomAge());
    }

    public static String temperatureAndAge(int Age, int temperature) {
        if (Age > 20 && Age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (Age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (Age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge(){
        Random ageCharacter=new Random();
        int age=ageCharacter.nextInt(100);
        return age;
    }
}