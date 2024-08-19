import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tela {
    public JTextField TXvalor01;
    public JTextField TXvalor02;
    public JButton BtnCalcular;
    public JRadioButton soma;
    public JRadioButton subtracao;
    public JRadioButton multiplicacao;
    public JRadioButton divisao;

    JPanel painel;

    public tela(){
        BtnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(TXvalor01.getText().isEmpty() || TXvalor02.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Os campos de valor não podem estar vazios");
                } else {
                    try {
                        double num1 = Double.parseDouble(TXvalor01.getText());
                        double num2 = Double.parseDouble(TXvalor02.getText());
                        double resultado = 0;

                        if (soma.isSelected()) {
                            resultado = num1 + num2;
                        } else if (subtracao.isSelected()) {
                            resultado = num1 - num2;
                        } else if (multiplicacao.isSelected()) {
                            resultado = num1 * num2;
                        } else if (divisao.isSelected()) {
                            if (num2 != 0) {
                                resultado = num1 / num2;
                            } else {
                                JOptionPane.showMessageDialog(null, "não e possivel fazer a divisão");
                                return;
                            }
                        }

                        System.out.println(resultado);
                        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Numeros invalidos");
                    }
                }
            }
        });
    }

}
