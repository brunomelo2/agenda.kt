package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainform extends JFrame {
    private JPanel rootpainel;
    private JButton novoContatoButton;
    private JButton removerButton;
    private JTable tableContatos;

    public mainform(){
       setContentPane(rootpainel);
       setSize(500,250);
       setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2 - getSize().width/2,dim.height/2 - getSize().height/2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setListeners();
    }
    private void setListeners (){
        novoContatoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Contactform();
                dispose();
            }
        });
        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
