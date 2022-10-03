import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Qual a temperatura em Fahrenheit?");
        float f = console.nextFloat();
        float c = (f - 32) * 5 / 9;

        System.out.println("Corresponde a " + c + " graus celsius");

    }
}