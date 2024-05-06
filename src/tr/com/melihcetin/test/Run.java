package tr.com.melihcetin.test;

import tr.com.melihcetin.ui.MainWindow;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow();
            }
        });
    }
}
