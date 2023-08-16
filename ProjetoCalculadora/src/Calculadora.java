import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField txtVisor;
    private JButton btn1;
    private JButton btn9;
    private JButton btn8;
    private JButton btn7;
    private JButton btn6;
    private JButton btn5;
    private JButton btn4;
    private JButton btn3;
    private JButton btn2;
    private JButton btn0;
    private JButton btnClear;
    private JButton btnIgual;
    private JButton btnDiv;
    private JButton btnMult;
    private JButton btnSub;
    private JButton btnSoma;
    private JPanel panel;

    private Double valor;
    private String operacao;

    public Calculadora(){

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText() + '0');
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText() + '1');
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText() + '2');
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText() + '3');
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText() + '4');
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText() + '5');
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText() + '6');
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText() + '7');
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText() + '8');
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText() + '9');
            }
        });

        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = Double.valueOf(txtVisor.getText());
                operacao = "+";
                txtVisor.setText("");
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = Double.valueOf(txtVisor.getText());
                operacao = "-";
                txtVisor.setText(" ");
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = Double.valueOf(txtVisor.getText());
                operacao = "/";
                txtVisor.setText(" ");
            }
        });

        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = Double.valueOf(txtVisor.getText());
                operacao = "x";
                txtVisor.setText(" ");
            }
        });

        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double resultado;
                switch (operacao){
                    case "+":
                        resultado = valor + Double.valueOf(txtVisor.getText());
                        txtVisor.setText(String.valueOf(resultado));
                        break;

                    case "-":
                        resultado = valor - Double.valueOf(txtVisor.getText());
                        txtVisor.setText(String.valueOf(resultado));
                        break;

                    case "x":
                        resultado = valor * Double.valueOf(txtVisor.getText());
                        txtVisor.setText(String.valueOf(resultado));
                        break;

                    case "/":
                        resultado = valor / Double.valueOf(txtVisor.getText());
                        txtVisor.setText(String.valueOf(resultado));
                        break;
                }
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText("0");
                operacao = "";
                valor = null;
            }
        });
    }

    public JPanel getPanel(){
        return this.panel;
    }
}
