import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame( "Aula01");
        frame.setContentPane(new tela().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}