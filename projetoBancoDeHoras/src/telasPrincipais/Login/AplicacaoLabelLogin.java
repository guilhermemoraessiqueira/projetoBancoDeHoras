package telasPrincipais.Login;

import javax.swing.*;
import java.awt.*;


public class AplicacaoLabelLogin extends NFrameLogin{

    JLabel L1, L2, L3, L4;
    Color cor1 = new Color(170,164,164);

    public AplicacaoLabelLogin(){
        L1 =new JLabel("Login", JLabel.CENTER);
        L1.setFont(new Font("Arial",Font.BOLD,16));
        //L1.setBorder(BorderFactory.createLineBorder(cor1,04));
        L1.setBackground(cor1);
        L1.setBounds(65,22,160,19);

        L2 =new JLabel("Usuário:",JLabel.LEFT);
        L2.setFont(new Font("arial",Font.BOLD,14));
        L2.setBounds(30,55,155,17);

        L3 =new JLabel("Senha:",JLabel.LEFT);
        L3.setFont(new Font("arial",Font.BOLD,14));
        L3.setBounds(30,85, 155,17);

        getContentPane().setLayout(null);
        getContentPane().add(L1);
        getContentPane().add(L2);
        getContentPane().add(L3);
    }
}
