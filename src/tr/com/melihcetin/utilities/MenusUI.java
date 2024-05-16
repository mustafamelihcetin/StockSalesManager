package tr.com.melihcetin.utilities;

import tr.com.melihcetin.ui.AddCategoryUI;
import tr.com.melihcetin.ui.AddProductUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenusUI {
    public static JMenuBar initBar() {
        JMenuBar bar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        bar.add(fileMenu);
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        JMenu productsMenu = new JMenu("Products");
        bar.add(productsMenu);
        JMenuItem addProductItem = new JMenuItem("Add a new product");
        productsMenu.add(addProductItem);
        JMenuItem addCategoryItem = new JMenuItem("Add a new category");
        productsMenu.add(addCategoryItem);
        productsMenu.addSeparator();
        JMenuItem editProductItem = new JMenuItem("Edit product");
        productsMenu.add(editProductItem);
        JMenuItem editCategoryItem = new JMenuItem("Edit category");
        productsMenu.add(editCategoryItem);

        addProductItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new AddProductUI();
                    }
                });
            }
        });

        addCategoryItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddCategoryUI();
            }
        });

        return bar;
    }
}
