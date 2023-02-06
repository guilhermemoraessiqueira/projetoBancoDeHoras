package telasPrincipais.Main;

import javax.swing.*;

public class AplicacaoComboBoxMain extends AplicacaoTextMain{
    JComboBox<String> comboProjeto = new JComboBox<>();

    public AplicacaoComboBoxMain(){
        comboProjeto.addItem("01");

        comboProjeto.setSelectedIndex(0);
        comboProjeto.setBounds(130, 80, 150, 20);
        add(comboProjeto);

        getContentPane().add(comboProjeto);
    }
}
