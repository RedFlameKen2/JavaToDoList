package frames;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
import static util.Constants.*;

public class MainFrame extends JFrame{

    private JPanel northPanel, centerPanel;
    private JLabel labels[];
    private JButton startBtn;
    
    public MainFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(DEFUALT_WINDOW_SIZE);
        
        initComponents();
    }

    private void initComponents() {
        labels = new JLabel[3];
        labels[0] = new JLabel("ToDoList");


        startBtn = new JButton("Start");

        setLayout(new BorderLayout());
        
        northPanel = new JPanel();
        
        northPanel.add(labels[0]);
        
        centerPanel = new JPanel();

        centerPanel.setLayout(new GridLayout(2, 2, 10, 10));
        centerPanel.add(startBtn);

        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);


    }


}
