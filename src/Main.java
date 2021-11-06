import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Calculadora Calcula = new Calculadora();

        Calcula.setA(100);
        Calcula.setB(2);

        Calcula.MULTIPLICA();
        System.out.println(Calcula.getResult() + "\n");

        Calcula.DIVIDE();
        System.out.println(Calcula.getResult() + "\n");

        Calcula.SOMA();
        System.out.println(Calcula.getResult() + "\n");

        Calcula.SUBTRAI();
        System.out.println(Calcula.getResult() + "\n");

    }

}
