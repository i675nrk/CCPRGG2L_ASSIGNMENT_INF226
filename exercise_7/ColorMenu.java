import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

public class ColorMenu extends JFrame{

    JList colorList;
    // Color name array
    private String[] colorNameArray = {"PINK", "BLUE", "WHITE", "BLACK"};
    // Color list array
    private Color[] colorListArray = {Color.PINK, Color.blue, Color.WHITE, Color.BLACK};

    
    
    ColorMenu(){

        // JLabel
        JLabel label = new JLabel();
        label.setText("Choose your color: ");
        label.setFont(new Font("DialogInput", Font.BOLD, 25));
        this.add(label);

        // JList
        colorList = new JList(colorNameArray);
          // Restricts to one selection
        colorList.setFont(new Font("DialogInput", Font.BOLD, 25));
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.add(colorList);

        // add event
        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 550);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.pink);

    }

    private class EventHandler implements ListSelectionListener{
        
        public void valueChanged(ListSelectionEvent event){
            GamePanel gp = new GamePanel();
            gp.gameBGColor = colorListArray[colorList.getSelectedIndex()];

            // open game frame
            new GameFrame();
            // close game frame
            dispose();
        }
    }
}