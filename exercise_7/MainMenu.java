import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;;

public class MainMenu extends JFrame {
    MainMenu(){

        // JLabel
        JLabel imageLabel = new JLabel();
        ImageIcon cute = new ImageIcon("R.gif");
        imageLabel.setIcon(cute);
        
        // JButton
        JButton startButton = new JButton();
        startButton.setText("Start Game");
        startButton.setFont(new Font("DialogInput", Font.BOLD, 25));

        // Add event to start button
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);
        // Add Label and image to frame
        this.add(imageLabel);
        this.add(startButton);



        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 550);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.pink);

    }
        private class EventHandler implements ActionListener{
            public void actionPerformed(ActionEvent event) {
                
                // Goes to color menu
                new ColorMenu();
                // Closes frame
                dispose();
            }

        
                
                }
        }
        
    

