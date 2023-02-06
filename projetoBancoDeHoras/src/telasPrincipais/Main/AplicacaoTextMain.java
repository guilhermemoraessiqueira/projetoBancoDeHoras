package telasPrincipais.Main;

import telasPrincipais.Login.AplicacaoTextLogin;

import javax.swing.*;

public class AplicacaoTextMain extends AplicacaoLabelMain{
    public JTextField Tx1;


    public AplicacaoTextMain(){
        Tx1 = new JTextField();
        this.Tx1 = Tx1;
        Tx1.setBounds(290, 100, 190, 100);
        Tx1.setHorizontalAlignment(JTextField.LEADING);

        //getContentPane().add(Tx1);

    }


}
