/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Hanyr
 */
public class FXMLDocumentController implements Initializable {
    
    Float data = 0f;
    int operation = -1;
    
    @FXML
    private Label display;

    @FXML
    private Button ac;

    @FXML
    private Button plusMinus;

    @FXML
    private Button percent;

    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button division;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button multiplication;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button subtraction;

    @FXML
    private Button dot;

    @FXML
    private Button zero;

    @FXML
    private Button equalto;

    @FXML
    private Button addition;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        }
        else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        }
        else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        }
        else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        }
        else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        }
        else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        }
        else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        }
        else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        }
        else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        }
        else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        }
        else if (event.getSource() == dot) {
            display.setText(display.getText() + ".");
        }
        else if (event.getSource() == equalto) {
            Float secondOperand = Float.parseFloat(display.getText());
            switch(operation){
            
                case 1: // Addition
                        Float ans = data + secondOperand;
                        display.setText(String.valueOf(ans));
                        break;
                        
                case 2: // Subtraction
                        ans = data - secondOperand;
                        display.setText(String.valueOf(ans));
                        break;
                        
                case 3: // Multiplicaition
                        ans = data * secondOperand;
                        display.setText(String.valueOf(ans));
                        break;
                        
                case 4: // Division
                    ans = 0f;
                    try{
                        ans = data / secondOperand;
                    }
                    catch(Exception e){display.setText("Error");}
                        display.setText(String.valueOf(ans));
                        break;
            }
        }
        else if (event.getSource() == addition) {
            data = Float.parseFloat(display.getText());
            operation = 1; // Addition
            display.setText("");
        }
        else if (event.getSource() == subtraction) {
            data = Float.parseFloat(display.getText());
            operation = 2; // Subtraction
            display.setText("");
        }
        else if (event.getSource() == multiplication) {
            data = Float.parseFloat(display.getText());
            operation = 3; // Multiplication
            display.setText("");
        }
        else if (event.getSource() == division) {
            data = Float.parseFloat(display.getText());
            operation = 4; // Division
            display.setText("");
        }
        else if (event.getSource() == clear) {
            display.setText("");
        }
        else if (event.getSource() == percent) {
            display.setText(display.getText() + "%");
        }
        else if (event.getSource() == plusMinus) {
            display.setText("");
        }
        else if (event.getSource() == ac) {
            display.setText("");
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
