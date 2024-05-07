package tr.com.melihcetin.ui;

import tr.com.melihcetin.interfaces.UIInterfaces;
import tr.com.melihcetin.utilities.MenusUI;

import javax.swing.*;

public class MainWindow extends JFrame implements UIInterfaces {
    public MainWindow(){
        initWindow();
    }

    @Override
    public void initWindow() {
        JTabbedPane tabs = initTabs();
        JMenuBar bar = initBar();

        //add(tabs);
        setJMenuBar(bar);
        setTitle("Stock and Sales Manager (BETA)");
        setSize(800,400);
        //pack(); // Auto size
        setVisible(true);
        setLocationRelativeTo(null); // center
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public JPanel initPanel() {
        JPanel panel = new JPanel();

        return panel;
    }

    @Override
    public JMenuBar initBar() {
        JMenuBar bar = MenusUI.initBar();
        return bar;
    }

    @Override
    public JTabbedPane initTabs() {
        JTabbedPane tabs = new JTabbedPane();
        return tabs;
    }
}
