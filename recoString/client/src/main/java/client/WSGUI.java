package client;

import client.WSClient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import java.awt.GridLayout;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class WSGUI extends JFrame {
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        //
        //
    }

    /**
     * Create the frame.
     */
    public WSGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Send string");
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                WSClient.recoStringCl(WSClient.pas_port, textField.getText());// nen
                //JOptionPane.showMessageDialog(null,WSClient.response_string);
                textField_1.setText(WSClient.response_string);
               
            }
        });
        btnNewButton.setBounds(22, 50, 121, 34);
        getContentPane().add(btnNewButton);

        textField = new JTextField();
        textField.setBounds(153, 54, 121, 27);
        getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setEditable(false);
        textField_1.setBounds(22, 176, 252, 20);
        getContentPane().add(textField_1);
        textField_1.setColumns(10);
        


        Label label = new Label("Response");
        label.setBounds(115, 144, 62, 22);
        getContentPane().add(label);
    }
}
