package telasPrincipais.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AplicacaoEventoLogin extends AplicacaoButtonLogin implements ActionListener
{

    public AplicacaoEventoLogin() {
        B1.addActionListener(this);// login
        B2.addActionListener(this);//cancelar
        this.setResizable(false);


    }
    public void actionPerformed(ActionEvent e)//
    {

        if (e.getSource() == B1) {
            JOptionPane.showMessageDialog(null,"B1");

        }
        if(e.getSource()==B2)
        {
            JOptionPane.showMessageDialog(null,"B2");
        }
    }

    public static void main ( String arg[]){
        NFrameLogin Fx = new AplicacaoEventoLogin();
        Fx. show();
    }
}
