package telasPrincipais.Login;

import java.awt.event.KeyEvent;
import javax.swing.JButton;

public class AplicacaoButtonLogin extends AplicacaoTextLogin{
    JButton B1, B2;
    public AplicacaoButtonLogin(){
        B1 =new JButton("Cancelar");
        B1.setSize(85, 40);
        B1.setLocation(50,115);
        B1.setMnemonic(KeyEvent.VK_I);

        B2 =new JButton("Login");
        B2.setSize(85, 40);
        B2.setLocation(150,115);
        B2.setMnemonic(KeyEvent.VK_A);

        getContentPane().add(B1);
        getContentPane().add(B2);

    }
}
