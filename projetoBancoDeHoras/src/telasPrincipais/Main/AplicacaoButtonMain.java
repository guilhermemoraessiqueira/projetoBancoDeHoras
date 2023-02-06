package telasPrincipais.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class AplicacaoButtonMain extends AplicacaoComboBoxMain{
    JButton B1, B2;

    public AplicacaoButtonMain(){
        B1 = new JButton("Entrada");
        B1.setSize(150, 50);
        B1.setLocation(300,90);
        B1.setMnemonic(KeyEvent.VK_I);
        B1.setFont(new Font("Arial", Font.BOLD, 18));

        B2 = new JButton("Saída");
        B2.setSize(150, 50);
        B2.setLocation(300,150);
        B2.setMnemonic(KeyEvent.VK_A);
        B2.setFont(new Font("Arial", Font.BOLD, 20));


        getContentPane().add(B1);
        getContentPane().add(B2);
    }
}
