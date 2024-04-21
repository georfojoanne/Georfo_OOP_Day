
package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {

        private JTextField textField;
        private JButton[] numberButtons;
        private JButton[] functionButtons;
        private Calculator calculator;
        
        public CalculatorGUI(){
            setTitle("Simple Calculator");
            setSize(300,400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            
            calculator = new Calculator();
            textField = new JTextField();
            textField.setEditable(false);
            
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(5, 4, 5, 5));
            
            numberButtons = new JButton[10];
            for (int i = 0; i < 10; i++) {
                numberButtons[i] = new JButton(String.valueOf(i));
                numberButtons[i].addActionListener(this);
                panel.add(numberButtons[i]);
            }
            
            functionButtons = new JButton[6];
            String[] functionLabels = {"+", "-", "*", "/", "=", "Clear"};
            for (int i = 0; i < 6; i++){
                functionButtons[i] = new JButton(functionLabels[i]);
                functionButtons[i].addActionListener(this);
                panel.add(functionButtons[i]);
            }
            
            add(textField, BorderLayout.NORTH);
            add(panel, BorderLayout.CENTER);
            
            setVisible(true);
        }
        
        @Override
        
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            
            if (Character.isDigit(command.charAt(0))){
                textField.setText(textField.getText() + command);
            } else {
                char operator = command.charAt(0);
                if (operator == '=') {
                    calculator.setOperand(Double.parseDouble(textField.getText()));
                    double result = calculator.calculate();
                    textField.setText(String.valueOf(result));
                } else if (operator == 'C') {
                textField.setText(" ");
                calculator.clear();
            } else {
                    calculator.setOperand(Double.parseDouble(textField.getText()));
                    calculator.setOperator(operator);
                    textField.setText(" ");
                }
            }
        }
        
    public static void main(String[] args) {
        new CalculatorGUI();
    }
    }
    

