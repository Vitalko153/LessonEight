import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Alert extends JFrame {

    Alert(){
        setLocation(700, 650);
        setSize(300, 100);
        setTitle("Ошибка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

       JLabel label = new JLabel("Ошибка обработки ситуации.");
       add(label, BorderLayout.CENTER);

        JButton btnClose = new JButton("ОК");
        add(btnClose, BorderLayout.SOUTH);
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}