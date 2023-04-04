/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.awt.Color;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import static javax.swing.BorderFactory.createEtchedBorder;
import static javax.swing.BorderFactory.createLineBorder;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author 84564
 */
public class DataValidator {
    public static void validateEmpty( JTextField field, StringBuilder sb, String errorMessage){
        if(field.getText().equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
        }else{
            field.setBackground(Color.white);
        }
        
    }
    public static void validateEmpty( JSpinner field, StringBuilder sb, String errorMessage){
        int value = (int) field.getValue();
        if(value <= 0 ){
            sb.append(errorMessage).append("\n");
            field.setBorder(createLineBorder(new java.awt.Color(255,255,0), 3));
            field.requestFocus();
        }else{
            field.setBorder(createLineBorder(new java.awt.Color(240,240,240)));
        }
        
    }
    
    public static void validateEmpty( JComboBox<String> field, StringBuilder sb, String errorMessage){
        if(field.getSelectedIndex() == 0){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
        }else{
            field.setBackground(Color.white);
        }
        
    }
    
    public static void isNumberic( JTextField field, StringBuilder sb, String errorMessage){
        try{
        if(Double.parseDouble(field.getText()) > 0){
            field.setBackground(Color.white);
        }
        }catch (NumberFormatException e){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.blue);
            field.requestFocus();
        }
    }
    
}
