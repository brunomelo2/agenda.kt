package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contactform extends JFrame {

    private JPanel rootpanel;
    private JTextField textname;
    private JTextField textfone;
    private JButton buttonsalvar;
    private JButton buttoncancelar;
    private JPanel Rootpanel;

    public Contactform(){
        setContentPane(Rootpanel);
        setSize(500,250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2 - getSize().width/2,dim.height/2 - getSize().height/2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setListeners();
    }
private void setListeners() {
        buttonsalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Contactform();
                dispose();
            }
        });

    buttoncancelar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new mainform();
            dispose();
        }
    });
    }
}



