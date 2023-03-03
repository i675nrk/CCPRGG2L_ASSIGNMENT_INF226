import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;;

public class TryAgain extends JFrame {
    TryAgain(){

        JButton tryAgainButton = new JButton();
        JButton exitButton = new JButton();

        tryAgainButton.setText("Try Again");
        tryAgainButton.setFont(new Font("DialogInput", Font.BOLD, 25));

        exitButton.setText("Exit");
        exitButton.setFont(new Font("DialogInput", Font.BOLD, 25));

        tryAgainEventHandler handler = new tryAgainEventHandler();
        tryAgainButton.addActionListener(handler);
        this.setLayout(new FlowLayout());

        exitHandler handlers = new exitHandler();
        exitButton.addActionListener(handlers);
        this.setLayout(new FlowLayout());

        this.add(tryAgainButton);
        this.add(exitButton);

        // Frame layout
        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 550);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.pink);

    }
        // Event handler
    private class tryAgainEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            // Goes to game frame
            new GameFrame();
            // Closes frame
            dispose();

        }
    }
        private class exitHandler implements ActionListener{
            public void actionPerformed(ActionEvent event){
            dispose();
        }
    }
}
