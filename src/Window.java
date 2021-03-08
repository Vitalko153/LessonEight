import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    Window(){
        setLocation(650, 500);
        setSize(400, 400);
        setTitle("Мое прекрасное окно");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        JButton btnClose = new JButton("Exit");
        add(btnClose, BorderLayout.SOUTH);
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(153);
            }
        });

        JButton btnUp = new JButton("Up");
        add(btnUp, BorderLayout.NORTH);
        btnUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Это сообщение выведится в консоль.");
            }
        });

        JButton btnRight = new JButton("Right");
        add(btnRight, BorderLayout.LINE_END);

        JButton btnLeft = new JButton("Left");
        add(btnLeft, BorderLayout.LINE_START);

        JButton btnRun = new JButton("Press me");
        add(btnRun, BorderLayout.CENTER);
        btnRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Alert alert = new Alert();
            }
        });

    }

}
