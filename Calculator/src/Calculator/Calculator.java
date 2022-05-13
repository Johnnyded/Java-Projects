package Calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

    private JPanel contentPane;
    private JTextField Display;
    
    double enterNum1;
    double enterNum2;
    double result;
    String operate;
    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator frame = new Calculator();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Calculator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //(coordinates, coordinates, width, height)
        setBounds(100, 100, 400 , 480);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        Display = new JTextField();
        Display.setFont(new Font("Tahoma", Font.PLAIN, 24));
        Display.setHorizontalAlignment(SwingConstants.RIGHT);
        Display.setBounds(10, 11, 364, 64);
        contentPane.add(Display);
        Display.setColumns(10);
        
        JButton btnNewButton = new JButton("\uF0E7");
        btnNewButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String bs = null;
                if(Display.getText().length() > 0)
                {
                    StringBuilder stB = new StringBuilder(Display.getText());
                    stB.deleteCharAt(Display.getText().length() - 1);
                    bs = stB.toString();
                    Display.setText(bs);
                    
                }
            }
        });
        btnNewButton.setFont(new Font("Wingdings", Font.BOLD, 24));
        btnNewButton.setBounds(10, 86, 69, 60);
        contentPane.add(btnNewButton);
        
        JButton btnClearEmpty = new JButton("CE");
        btnClearEmpty.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                Display.setText("");
                String firstNum, secondNum;
                
                firstNum = String.valueOf(enterNum1);
                secondNum = String.valueOf(enterNum2);
                
                firstNum = "";
                secondNum = "";
            }
        });
        btnClearEmpty.setFont(new Font("Tahoma", Font.BOLD, 24));
        btnClearEmpty.setBounds(107, 86, 69, 60);
        contentPane.add(btnClearEmpty);
        
        JButton btnClear = new JButton("C");
        btnClear.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                Display.setText("");
            }
        });
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 24));
        btnClear.setBounds(208, 86, 69, 60);
        contentPane.add(btnClear);
        
        JButton btnPlusMinus = new JButton("+/-");
        btnPlusMinus.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                double pm = Double.parseDouble(String.valueOf(Display.getText()));
                pm = pm*(-1);
                Display.setText(String.valueOf(pm));
            }
        });
        btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 24));
        btnPlusMinus.setBounds(287, 86, 87, 60);
        contentPane.add(btnPlusMinus);
        
        JButton btn7 = new JButton("7");
        btn7.setToolTipText("seven Gae");
        btn7.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String digit = Display.getText() + btn7.getText();
                Display.setText(digit);
            }
        });
        btn7.setFont(new Font("Tahoma", Font.BOLD, 24));
        btn7.setBounds(10, 157, 69, 60);
        contentPane.add(btn7);
        
        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener() 
        {
            
            public void actionPerformed(ActionEvent e) 
            {
                String digit = Display.getText() + btn8.getText();
                Display.setText(digit);
            }
        });
        
        btn8.setFont(new Font("Tahoma", Font.BOLD, 24));
        btn8.setBounds(107, 157, 69, 60);
        contentPane.add(btn8);
        
        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String digit = Display.getText() + btn9.getText();
                Display.setText(digit);
            }
        });
        btn9.setFont(new Font("Tahoma", Font.BOLD, 24));
        btn9.setBounds(208, 157, 69, 60);
        contentPane.add(btn9);
        
        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                enterNum1 = Double.parseDouble(Display.getText());
                Display.setText(null);
                operate = "+";
            }
        });
        btnPlus.setFont(new Font("Tahoma", Font.BOLD, 24));
        btnPlus.setBounds(305, 157, 69, 60);
        contentPane.add(btnPlus);
        
        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String digit = Display.getText() + btn4.getText();
                Display.setText(digit);
            }
        });
        btn4.setFont(new Font("Tahoma", Font.BOLD, 24));
        btn4.setBounds(10, 228, 69, 60);
        contentPane.add(btn4);
        
        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String digit = Display.getText() + btn5.getText();
                Display.setText(digit);
            }
        });
        btn5.setFont(new Font("Tahoma", Font.BOLD, 24));
        btn5.setBounds(107, 228, 69, 60);
        contentPane.add(btn5);
        
        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String digit = Display.getText() + btn6.getText();
                Display.setText(digit);
            }
        });
        btn6.setFont(new Font("Tahoma", Font.BOLD, 24));
        btn6.setBounds(208, 228, 69, 60);
        contentPane.add(btn6);
        
        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                enterNum1 = Double.parseDouble(Display.getText());
                Display.setText(null);
                operate = "-";
            }
        });
        btnMinus.setFont(new Font("Tahoma", Font.BOLD, 24));
        btnMinus.setBounds(305, 228, 69, 60);
        contentPane.add(btnMinus);
        
        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String digit = Display.getText() + btn1.getText();
                Display.setText(digit);
            }
        });
        btn1.setFont(new Font("Tahoma", Font.BOLD, 24));
        btn1.setBounds(10, 299, 69, 60);
        contentPane.add(btn1);
        
        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String digit = Display.getText() + btn2.getText();
                Display.setText(digit);
            }
        });
        btn2.setFont(new Font("Tahoma", Font.BOLD, 24));
        btn2.setBounds(107, 299, 69, 60);
        contentPane.add(btn2);
        
        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String digit = Display.getText() + btn3.getText();
                Display.setText(digit);
            }
        });
        btn3.setFont(new Font("Tahoma", Font.BOLD, 24));
        btn3.setBounds(208, 299, 69, 60);
        contentPane.add(btn3);
        
        JButton btnMultiply = new JButton("*");
        btnMultiply.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                enterNum1 = Double.parseDouble(Display.getText());
                Display.setText(null);
                operate = "*";
            }
            
        });
        btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 24));
        btnMultiply.setBounds(305, 299, 69, 60);
        contentPane.add(btnMultiply);
        
        JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String digit = Display.getText() + btn0.getText();
                Display.setText(digit);
            }
        });
        btn0.setFont(new Font("Tahoma", Font.BOLD, 24));
        btn0.setBounds(10, 370, 69, 60);
        contentPane.add(btn0);
        
        JButton btnDecimal = new JButton(".");
        btnDecimal.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                if(!Display.getText().contains("."))
                {
                    Display.setText(Display.getText() +btnDecimal.getText());
                }
            }
        });
        btnDecimal.setFont(new Font("Tahoma", Font.BOLD, 24));
        btnDecimal.setBounds(107, 370, 69, 60);
        contentPane.add(btnDecimal);
        
        JButton btnEquals = new JButton("=");
        btnEquals.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                enterNum2 = Double.parseDouble(Display.getText());
                if (operate == "+")
                {
                    result = enterNum1 + enterNum2;
                    Display.setText(String.valueOf(result));
                }
                else if (operate == "-")
                {
                    result = enterNum1 - enterNum2;
                    Display.setText(String.valueOf(result));
                }
                
                else if (operate == "*")
                {
                    result = enterNum1 * enterNum2;
                    Display.setText(String.valueOf(result));
                }
                else if (operate == "/")
                {
                    result = enterNum1 / enterNum2;
                    Display.setText(String.valueOf(result));
                }
            }
        });
        btnEquals.setFont(new Font("Tahoma", Font.BOLD, 24));
        btnEquals.setBounds(208, 370, 69, 60);
        contentPane.add(btnEquals);
        
        JButton btnDivide = new JButton("/");
        btnDivide.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                enterNum1 = Double.parseDouble(Display.getText());
                Display.setText(null);
                operate = "/";
            }
        });
        btnDivide.setFont(new Font("Tahoma", Font.BOLD, 24));
        btnDivide.setBounds(305, 370, 69, 60);
        contentPane.add(btnDivide);
    }
}
