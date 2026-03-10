package com.ejemplo.utils;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class PlaceholderHelper {

    private PlaceholderHelper(){}
    public static  void setPlaceholder (JTextField field , String placeholder){
        field.setText(placeholder);
        field.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (field.getText().equals(placeholder)) field.setText("");

            }

            @Override
            public void focusLost(FocusEvent e) {
                if (field.getText().isEmpty()) field.setText(placeholder);

            }
        });
    }
}
