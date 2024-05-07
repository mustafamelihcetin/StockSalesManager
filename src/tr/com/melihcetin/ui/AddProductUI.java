package tr.com.melihcetin.ui;

import tr.com.melihcetin.interfaces.UIInterfaces;

import javax.swing.*;

public class AddProductUI extends JDialog implements UIInterfaces {
    public AddProductUI() {
    }

    @Override
    public void initWindow() {
        JPanel panel = initPanel();
        add(panel);

        setTitle("Add a new product");
        pack(); // auto
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
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
