import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            JFrame calculadora = new JFrame("Calcular");
            calculadora.setContentPane(new Calculadora().getPanel());
            calculadora.setSize(600,650);
            calculadora.setVisible(true);
    }
}