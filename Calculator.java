
package scientific_calculator;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {

    double n1, n2, result;
    int calculation;
    String sign, answer;
    //private JButton b1,b2,b3,b4;

    JFrame frame = new JFrame("Calculator");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    
    JButton b1 = new JButton("sin");
    JButton b2 = new JButton("cos");
    JButton b3 = new JButton("tan");
    JButton b4 = new JButton("log");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("AC");
    JButton buttonDelete = new JButton("Del");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("*");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x^2");
    JButton buttonR = new JButton("x^3");
    JButton buttonSqrt = new JButton("\u221A");
    JButton bSquare = new JButton("x^2");

    public void prepareGui() 
    {
         
        b1.setBounds(10,170,60,40);
        b1.setFont(new Font("Arial", Font.ITALIC, 15));
        b1.setBackground(Color.PINK);
        b1.setForeground(Color.BLACK);
        b1.setFocusable(false);
        frame.add(b1);
        b1.addActionListener(new ActionListener( ){
        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double d = Double.parseDouble(String.valueOf(textField.getText()));
            boolean Shift = false;
            if(!Shift)
            {
                boolean deg = false;
                if(!deg)
                {
                    textField.setText("sin("+String.valueOf(d)+")");
                    d=d*0.0174532925;
                }
                d=Math.sin(d);
            }
            else
            {
            textField.setText("sin^-1("+String.valueOf(d)+")");
            d=Math.asin(d)/0.0174532925;
            }
            textField.setText(String.valueOf(d));
        }
        });
        
         
        b2.setBounds(80,170,60,40);
        b2.setFont(new Font("Arial", Font.ITALIC, 15));
        b2.setBackground(Color.PINK);
        b2.setForeground(Color.BLACK);
        b2.setFocusable(false);
        frame.add(b2);
        b2.addActionListener(new ActionListener( ){
        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double d = Double.parseDouble(String.valueOf(textField.getText()));
            boolean Shift = false;
            if(!Shift)
            {
                boolean deg = false;
                if(!deg)
                {
                    textField.setText("cos("+String.valueOf(d)+")");
                    d=d*0.0174532925;
                }
                d=Math.cos(d);
            }
            else
            {
            textField.setText("cos^-1("+String.valueOf(d)+")");
            d=Math.acos(d)/0.0174532925;
            }
            textField.setText(String.valueOf(d));
        }
        });
        
         
        b3.setBounds(150,170,60,40);
        b3.setFont(new Font("Arial", Font.ITALIC, 15));
        b3.setBackground(Color.PINK);
        b3.setForeground(Color.BLACK);
        b3.setFocusable(false);
        frame.add(b3);
        b3.addActionListener(new ActionListener( ){
        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double d = Double.parseDouble(String.valueOf(textField.getText()));
            boolean Shift = false;
            if(!Shift)
            {
                boolean deg = false;
                if(!deg)
                {
                    textField.setText("tan("+String.valueOf(d)+")");
                    d=d*0.0174532925;
                }
                d=Math.tan(d);
            }
            else
            {
            textField.setText("tan^-1("+String.valueOf(d)+")");
            d=Math.atan(d)/0.0174532925;
            }
            textField.setText(String.valueOf(d));
        }
        });
        
         
        b4.setBounds(220,110,60,40);
        b4.setFont(new Font("Arial", Font.ITALIC, 15));
        b4.setBackground(Color.RED);
        b4.setForeground(Color.WHITE);
        b4.setFocusable(false);
        frame.add(b4);
        b4.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double d = Double.parseDouble(String.valueOf(textField.getText()));
            textField.setText("log("+String.valueOf(d)+")");
            d=Math.log10(d);
            textField.setText(String.valueOf(d));
        }
        
        });
        
        
        frame.setSize(296, 560);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buttonDelete.setBounds(150, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.ITALIC, 15));
        buttonDelete.setBackground(Color.RED);
        buttonDelete.setForeground(Color.WHITE);
        buttonDelete.setFocusable(false);
        frame.add(buttonDelete);

        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.ITALIC, 15));
        buttonClear.setBackground(Color.RED);
        buttonClear.setForeground(Color.WHITE);
        buttonClear.setFocusable(false);
        frame.add(buttonClear);
         
        buttonR.setBounds(150, 230, 60, 40);
        buttonR.setFont(new Font("Arial", Font.ITALIC, 15));
        buttonR.setBackground(new Color(230, 90, 180));
        buttonR.setFocusable(false);
        frame.add(buttonR);
        buttonR.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double d = Double.parseDouble(String.valueOf(textField.getText()));
            d = d * d * d;
            textField.setText(String.valueOf(d));
        }
        
        });
    }

    public void addcomponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.WHITE);
        frame.add(label);

        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.ITALIC, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.ITALIC, 14));
        onRadioButton.setBackground(Color.BLACK);
        onRadioButton.setForeground(Color.YELLOW);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.ITALIC, 14));
        offRadioButton.setBackground(Color.BLACK);
        offRadioButton.setForeground(Color.YELLOW);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonSeven.setBounds(10, 290, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonSeven.setFocusable(false);
        frame.add(buttonSeven);
        
        
        bSquare.setBounds(80, 230, 60, 40);
        bSquare.setFont(new Font("Arial", Font.ITALIC, 14));
        bSquare.setBackground(new Color(230, 90, 180));
        bSquare.setFocusable(false);
        frame.add(bSquare);
        bSquare.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double d = Double.parseDouble(String.valueOf(textField.getText()));
            d = d * d;
            textField.setText(String.valueOf(d));
        }
        
        });

        buttonEight.setBounds(80, 290, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonEight.setFocusable(false);
        frame.add(buttonEight);

        buttonNine.setBounds(150, 290, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonNine.setFocusable(false);
        frame.add(buttonNine);

        buttonFour.setBounds(10, 350, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonFour.setFocusable(false);
        frame.add(buttonFour);

        buttonFive.setBounds(80, 350, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonFive.setFocusable(false);
        frame.add(buttonFive);

        buttonSix.setBounds(150, 350, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonSix.setFocusable(false);
        frame.add(buttonSix);
        
        buttonOne.setBounds(10, 410, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonOne.setFocusable(false);
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 410, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonTwo.setFocusable(false);
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 410, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonThree.setFocusable(false);
        frame.add(buttonThree);

        buttonDot.setBounds(150, 470, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonDot.setFocusable(false);
        frame.add(buttonDot);

        buttonZero.setBounds(10, 470, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonZero.setFocusable(false);
        frame.add(buttonZero);

        buttonEqual.setBounds(220, 410, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonEqual.setBackground(new Color(239, 188, 2));
        buttonEqual.setFocusable(false);
        frame.add(buttonEqual);
        buttonEqual.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                n2 = Double.parseDouble(textField.getText());

                if (sign == "+") {
                    result = n1 + n2;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if (sign == "-") {
                    result = n1 - n2;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if (sign == "*") {
                    result = n1 * n2;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if (sign == "/") {
                    result = n1 / n2;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                }
            }

        });

        buttonDiv.setBounds(220, 170, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonDiv.setBackground(new Color(239, 188, 2));
        buttonDiv.setFocusable(false);
        frame.add(buttonDiv);
        buttonDiv.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(textField.getText());
                textField.setText(" ");
                sign = "/";
            }

        });

        buttonSqrt.setBounds(10, 230, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonSqrt.setBackground(new Color(230, 90, 180));
        buttonSqrt.setFocusable(false);
        frame.add(buttonSqrt);
        buttonSqrt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(String.valueOf(textField.getText()));
                d = Math.sqrt(d);
                textField.setText(String.valueOf(d));
            }

        });

        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonMul.setBackground(new Color(239, 188, 2));
        buttonMul.setFocusable(false);
        frame.add(buttonMul);
        buttonMul.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(textField.getText());
                textField.setText(" ");
                sign = "*";
            }

        });

        buttonMinus.setBounds(220, 290, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonMinus.setBackground(new Color(239, 188, 2));
        buttonMinus.setFocusable(false);
        frame.add(buttonMinus);
        buttonMinus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(textField.getText());
                textField.setText(" ");
                sign = "-";
            }

        });

        buttonPlus.setBounds(220, 350, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.ITALIC, 20));
        buttonPlus.setBackground(new Color(239, 188, 2));
        buttonPlus.setFocusable(false);
        frame.add(buttonPlus);
        buttonPlus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(textField.getText());
                textField.setText(" ");
                sign = "+";
            }

        });
    }

    public void addActionEvent() {
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source == onRadioButton) {
            enable();
        } else if (source == offRadioButton) {
            disable();
        } else if (source == buttonClear) {
            label.setText("");
            textField.setText("");
        } else if (source == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if (textField.getText().endsWith(""));
            label.setText("");
        } else if (source == buttonZero) {
            textField.setText(textField.getText() + "0");
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonDot) {
            textField.setText(textField.getText() + ".");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonMul) {
            String str = textField.getText();
            n1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(str + "*");
        } else if (source == buttonDiv) {
            String str = textField.getText();
            n1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(str + "/");
        } else if (source == buttonSquare) {
            String str = textField.getText();
            n1 = Double.parseDouble(textField.getText());
            double square = Math.pow(n1, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);

            } 
        }
        
    }
    public void enable(){
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        bSquare.setEnabled(true);
        buttonR.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);        
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        
        
    }
     public void disable(){
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setEnabled(false);
        label.setEnabled(false);
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        bSquare.setEnabled(false);
        buttonR.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);        
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
    }
     
     
   Calculator() {
        prepareGui();
        addcomponents();
        addActionEvent();
    }

}
