package tr.com.melihcetin.ui;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import tr.com.melihcetin.interfaces.UIInterfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddProductUI extends JDialog implements UIInterfaces {
    public AddProductUI() {
        initWindow();
    }

    @Override
    public void initWindow() {
        JPanel panel = initPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Product Registration Area"));
        add(panel);
        setTitle("Add a New Product");
        //pack(); //AutoSize
        setModalityType(DEFAULT_MODALITY_TYPE);
        setSize(300, 300); // Sabit boyut belirtildi
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true); // Görünür hale getirme
    }

    @Override
    public JPanel initPanel() {

        //Font font = new Font("", Font.PLAIN, 14);

        JPanel panel = new JPanel(new GridLayout(5,2,5,15));
        //panel.setLayout(null); // Layout manager'ı kaldırdık, böylece bileşenlerin boyutlarını manuel olarak ayarlayabiliriz

        JLabel nameLabel = new JLabel("Name: ",JLabel.CENTER);
        JTextField nameField = new JTextField();
        //nameLabel.setBounds(10, 10, 80, 30); // Etiketin boyutu ve konumu belirlendi
        //nameField.setBounds(100, 10, 150, 30); // Giriş alanının boyutu ve konumu belirlendi

        JLabel categoryLabel = new JLabel("Category: ",JLabel.CENTER);
        JComboBox<String> categoryBox = new JComboBox<>();
        //categoryLabel.setBounds(10, 40, 80, 30); // Etiketin boyutu ve konumu belirlendi
        //categoryBox.setBounds(100, 40, 150, 30); // ComboBox'ın boyutu ve konumu belirlendi

        JLabel dateLabel = new JLabel("Date: ",JLabel.CENTER);
        //JPanel calendarPanel = new JPanel();
        JCalendar calendar = new JCalendar();
        JDateChooser dateChooser = new JDateChooser();
        //calendarPanel.add(calendar);
        //dateLabel.setBounds(10, 70, 100, 30); // Etiketin boyutu ve konumu belirlendi
        //calendarPanel.setBounds(100, 70, 180, 150); // JCalendar'ın boyutu ve konumu belirlendi

        JLabel priceLabel = new JLabel("Price: ",JLabel.CENTER);
        JTextField priceField = new JTextField();
        //priceLabel.setBounds(10, 230, 80, 30); // Etiketin boyutu ve konumu belirlendi
        //priceField.setBounds(100, 230, 150, 30); // Giriş alanının boyutu ve konumu belirlendi

        JButton saveButton = new JButton("Save");
        JButton cancelButton = new JButton("Cancel");
        //saveButton.setBounds(180, 270, 80, 35); // Butonların boyutu ve konumu belirlendi
        //cancelButton.setBounds(100, 270, 80, 35); // Butonların boyutu ve konumu belirlendi

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(categoryLabel);
        panel.add(categoryBox);
        panel.add(dateLabel);
        panel.add(dateChooser);
        panel.add(priceLabel);
        panel.add(priceField);
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