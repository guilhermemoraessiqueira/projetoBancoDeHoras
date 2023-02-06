package telasPrincipais.Main;

import telasPrincipais.Login.NFrameLogin;

import javax.swing.*;
import java.awt.*;

public class AplicacaoLabelMain extends  NFrameMain{

    JLabel L1,L2,L3,L4,L5,L6,L7,L8;
    Color cor1 = new Color(13,28,102);

    public AplicacaoLabelMain(){
        L1 =new JLabel("Banco de horas", JLabel.CENTER);
        L1.setFont(new Font("Arial",Font.BOLD,26));
        //L1.setBorder(BorderFactory.createLineBorder(cor1,04));
        L1.setBackground(cor1);
        L1.setBounds(65,20,350,30);

        L2 =new JLabel("Projeto:",JLabel.LEFT);
        L2.setFont(new Font("arial",Font.BOLD,22));
        L2.setBounds(30,80,155,23);

        L3 =new JLabel("Data de início:",JLabel.LEFT);
        L3.setFont(new Font("arial",Font.BOLD,22));
        L3.setBounds(30,120, 155,23);

        L4 =new JLabel("00/00/0000",JLabel.LEFT);
        L4.setFont(new Font("arial",Font.ITALIC,16));
        L4.setBounds(180,120, 155,23);

        L5 =new JLabel("Horas trabalhadas",JLabel.LEFT);
        L5.setFont(new Font("arial",Font.BOLD,18));
        L5.setBounds(50,160, 190,17);

        L6 =new JLabel("00:00",JLabel.LEFT);
        L6.setFont(new Font("arial",Font.BOLD,40));
        L6.setBounds(70,190, 155,30);

        L7 =new JLabel("Descrição:",JLabel.LEFT);
        L7.setFont(new Font("arial",Font.BOLD,14));
        L7.setBounds(290,80, 155,17);

        L8 =new JLabel("Teste de descrição para isso",JLabel.LEFT);
        L8.setFont(new Font("arial", Font.ITALIC,14));
        L8.setBounds(290,100, 155,17);


        getContentPane().setLayout(null);
        getContentPane().add(L1);
        getContentPane().add(L2);
        getContentPane().add(L3);
        getContentPane().add(L4);
        getContentPane().add(L5);
        getContentPane().add(L6);
        //getContentPane().add(L7);
        //getContentPane().add(L8);
    }


}
