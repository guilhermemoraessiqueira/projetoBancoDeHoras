package telasPrincipais.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplicacaoEventoMain extends AplicacaoMenuBarMain implements ActionListener {
    public AplicacaoEventoMain() {
    }

    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String arg[]) {
        NFrameMain Fx = new AplicacaoEventoMain();
        Fx.show();
    }

}

