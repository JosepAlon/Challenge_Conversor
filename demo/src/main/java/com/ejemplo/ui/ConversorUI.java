package com.ejemplo.ui;

import javax.swing.*;
import java.awt.*;

import com.ejemplo.utils.PlaceholderHelper;
import com.ejemplo.controllers.ConversorController;

// La clase ConversorUI hereda de JFrame, es decir, "es una ventana".
public class ConversorUI extends JFrame {

    private JComboBox<String> comboFrom; // Moneda origen
    private JComboBox<String> comboTo;   // Moneda destino
    private JTextField inputAmount;      // Monto a convertir
    private JTextField inputTo;          // Monto convertido



    public ConversorUI() {

        //  CONFIGURACIÓN DE LA VENTANA 
        setTitle("Conversor de Monedas");
        setSize(1000, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // PANEL PRINCIPAL
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        //  TÍTULO 
        JLabel title = new JLabel("Conversor de Monedas", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        add(title, BorderLayout.NORTH);

        //  COMBO FROM 
        gbc.gridx = 0;
        gbc.gridy = 0;
        comboFrom = new JComboBox<>(new String[] {"USD", "EUR", "ARS", "BRL", "CLP", "MXN", "PEN", "UYU", });
        comboFrom.setPreferredSize(new Dimension(75, 30));
        panel.add(comboFrom, gbc);

        //  CAMPO AMOUNT 
        gbc.gridx = 1;
        gbc.gridy = 0;
        inputAmount = new JTextField();
        inputAmount.setPreferredSize(new Dimension(200, 30));
        inputAmount.setText("Insertar monto a convertir");
        PlaceholderHelper.setPlaceholder(inputAmount, "Insertar monto a convertir");
        panel.add(inputAmount, gbc);


        //  COMBO TO
        gbc.gridx = 0;
        gbc.gridy = 1;
        comboTo = new JComboBox<>(new String[] {"USD", "EUR", "ARS", "BRL", "CLP", "MXN", "PEN", "UYU", });
        comboTo.setPreferredSize(new Dimension(75, 30));
        panel.add(comboTo, gbc);

        //  CAMPO TO
        gbc.gridx = 1;
        gbc.gridy = 1;  // Cambié la fila para que no se solapen
        inputTo = new JTextField();
        inputTo.setPreferredSize(new Dimension(200, 30));
        inputTo.setText("Resultado");
        inputTo.setEditable(false);
        PlaceholderHelper.setPlaceholder(inputTo, "Resultado");
        panel.add(inputTo, gbc);

        //  BOTÓN CONVERTIR
        gbc.gridx = 1;
        gbc.gridy = 2; // Cambié la fila para que no se solapen
        JButton convertirButton = new JButton("Convertir");
        convertirButton.setPreferredSize(new Dimension(200, 30));
        panel.add(convertirButton, gbc);

        //  EVENTO DEL BOTÓN 
        convertirButton.addActionListener(e -> convertir());
        add(panel);
        setVisible(true);
    }



    //  MÉTODO DE CONVERSIÓN 
    private void convertir() {

        ConversorController controller = new ConversorController();
        double valor = controller.convertir(comboFrom.getSelectedItem().toString(), comboTo.getSelectedItem().toString(), Double.parseDouble(inputAmount.getText()));
        inputTo.setText(String.valueOf(valor));

        System.out.println("Valor convertido: " + valor);
        System.out.println("SE TOCO EL BOTÓN");
        System.out.println("valor de la moneda1: " + inputAmount.getText());
        System.out.println("valor de la moneda2: " + inputTo.getText());

        System.out.println("Moneda FROM: " + comboFrom.getSelectedItem());
        System.out.println("Moneda TO: " + comboTo.getSelectedItem());
    }


}
