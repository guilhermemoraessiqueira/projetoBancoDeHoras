package telasPrincipais.Login;

import javax.swing.*;
import java.awt.*;

public class NFrameLogin extends JFrame {

    Color cor = new Color(152,147,147);

    public NFrameLogin(){

        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Color cor_borda = new Color(170, 170, 170);

        Container c = getContentPane();
        setLocation(100,50);
        setTitle("Login sistema");
        setSize (300, 200);
        c.setBackground(cor_borda);



        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
