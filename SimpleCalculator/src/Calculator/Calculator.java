
package Calculator;
import javax.swing.*;

public class Calculator {
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;
    
    public void setOperand(double operand){
        if (operator == 0){
            num1 = operand;
        }
        else 
           num2 = operand;
    }
    
    public void setOperator(char op) {
        operator = op;
    }
    
    public void clear(){
        num1 = 0;
        num2 = 0;
        result = 0;
        operator = 0;
    }
    
    public double calculate(){
        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0){
                    result = num1 / num2;
                }
                else 
                    result = Double.NaN;
                
                break;
        }
        
        return result;
    }
}
