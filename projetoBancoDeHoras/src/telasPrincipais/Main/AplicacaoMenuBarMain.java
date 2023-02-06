package telasPrincipais.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;

public class AplicacaoMenuBarMain extends AplicacaoButtonMain{

    public AplicacaoMenuBarMain(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar barraMenu = new JMenuBar();
        this.setJMenuBar(barraMenu);

        JMenu menuArquivo = new JMenu("Menu");
        barraMenu.add(menuArquivo);

        JMenuItem item1 = new JMenuItem("Adicionar Login");
        JMenuItem item2 = new JMenuItem("Adicionar projeto");
        JMenuItem item3 = new JMenuItem("Editar projeto");

        item1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                new NFrameMain().setVisible(true);
            }});

        item2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                new NFrameMain().setVisible(true);
            }});

        item3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                new NFrameMain().setVisible(true);
            }});

            menuArquivo.add(item1);
            menuArquivo.add(item2);
            menuArquivo.add(item3);
    }

}
