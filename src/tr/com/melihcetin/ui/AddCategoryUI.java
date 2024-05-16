package tr.com.melihcetin.ui;

import tr.com.melihcetin.dal.CategoryDAL;
import tr.com.melihcetin.interfaces.UIInterfaces;

import javax.swing.*;
import java.awt.*;
public class AddCategoryUI extends JDialog implements UIInterfaces {
    public AddCategoryUI() {
        initWindow();
    }

    @Override
    public void initWindow() {
        JPanel panel = initPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Category Registration Area"));
        add(panel);
        setTitle("Add a New Category");
        //pack(); //AutoSize
        setModalityType(DEFAULT_MODALITY_TYPE);
        setSize(300, 300); // Sabit boyut belirtildi
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true); // Görünür hale getirme
    }

    @Override
    public JPanel initPanel() {
        JPanel panel = new JPanel(new GridLayout(6,2,5,15));
        JLabel categoryNameLabel = new JLabel("Category Name: ",JLabel.CENTER);
        JTextField categoryNameField = new JTextField();

        JLabel categoryLabel= new JLabel("Category",JLabel.CENTER);

        JComboBox categoryBox = new JComboBox(new CategoryDAL().GetAll().toArray());
        categoryBox.insertItemAt("--Select Category--",0);
        categoryBox.setSelectedIndex(0);

        JButton saveButton = new JButton("Save");
        JButton cancelButton = new JButton("Cancel");

        panel.add(categoryNameLabel);
        panel.add(categoryNameField);
        panel.add(categoryLabel);
        panel.add(categoryBox);
        panel.add(saveButton);
        panel.add(cancelButton);

        return panel;
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
