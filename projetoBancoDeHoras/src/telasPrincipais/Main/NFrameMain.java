package telasPrincipais.Main;

import javax.swing.*;
import java.awt.*;

public class NFrameMain extends JFrame {

    public NFrameMain() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Color cor_borda = new Color(170, 170, 170);

        Container c = getContentPane();
        setResizable(false);
        setLocation(100, 50);
        setTitle("Banco de horas");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c.setBackground(cor_borda);
    }
}
