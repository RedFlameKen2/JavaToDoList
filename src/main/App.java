package main;

import frames.MainFrame;

public class App {
    
    private MainFrame mainFrame;

    App(){
        
        initComponents();
        mainFrame.setVisible(true);
    }

    private void initComponents(){
        mainFrame = new MainFrame();

    }
}
