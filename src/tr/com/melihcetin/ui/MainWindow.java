package tr.com.melihcetin.ui;

import tr.com.melihcetin.interfaces.UiInterfaces;

import javax.swing.*;

public class MainWindow extends JFrame implements UiInterfaces {
    public MainWindow(){
        initWindow();
    }

    @Override
    public void initWindow() {
        JTabbedPane tabs = initTabs();
        JMenuBar bar = initBar();

        //add(tabs);
        //setTitle("Stock and Sales Manager");
        pack(); // Auto size
        setVisible(true);
        setLocationRelativeTo(null); // center
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public JPanel initPanel() {
        return null;
    }

    @Override
    public JMenuBar initBar() {
        return null;
    }

    @Override
    public JTabbedPane initTabs() {
        return null;
    }
}
