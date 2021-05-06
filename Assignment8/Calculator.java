//package Assignment8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/** Creates a calculator using Java Swing
 * @Author Ian Chavez
 */
public class Calculator extends JFrame {
    private JLabel myLabel;
    private JTextField outputField;
    private JMenu operatorMenu;
    private JMenuBar operatorMenuBar;
    private JMenuItem addMenu;
    private JMenuItem subMenu;
    private JMenuItem multMenu;
    private JMenuItem divMenu;
    private ArrayList<JButton> digits;
    private JButton add;
    private JButton sub;
    private JButton mult;
    private JButton div;
    private JButton eq;
    private String currentOperation;
    private double firstOperand;

    // Constructor for Calculator class, creates basis for calculator
    public Calculator() {
        // Set initial field information
        this.currentOperation="";
        this.firstOperand=0;

        // Create output and menu panel
        JPanel displayPanel = new JPanel(new GridLayout(2, 2));
        outputField = new JTextField("0", 20);

        operatorMenu = new JMenu("Operations", false);

        operatorMenuBar = new JMenuBar();

        addMenu = new JMenuItem("Addition");
        subMenu = new JMenuItem("Subtraction");
        multMenu = new JMenuItem("Multiplication");
        divMenu = new JMenuItem("Division");

        operatorMenu.add(addMenu);
        operatorMenu.add(subMenu);
        operatorMenu.add(multMenu);
        operatorMenu.add(divMenu);
        operatorMenuBar.add(operatorMenu);
        setJMenuBar(operatorMenuBar);

        displayPanel.add(outputField);


        // Make panel for both sets of buttons
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

        // Make panel for digits 0 to 9 and decimal point
        JPanel digitsPanel = new JPanel(new GridLayout(4, 3));
        digits = new ArrayList<JButton>();
        digits.add(new JButton("0"));
        digits.add(new JButton("1"));
        digits.add(new JButton("2"));
        digits.add(new JButton("3"));
        digits.add(new JButton("4"));
        digits.add(new JButton("5"));
        digits.add(new JButton("6"));
        digits.add(new JButton("7"));
        digits.add(new JButton("8"));
        digits.add(new JButton("9"));
        digits.add(new JButton("."));
        digits.add(new JButton("CLEAR"));

        digitsPanel.add(digits.get(7));
        digitsPanel.add(digits.get(8));
        digitsPanel.add(digits.get(9));
        digitsPanel.add(digits.get(4));
        digitsPanel.add(digits.get(5));
        digitsPanel.add(digits.get(6));
        digitsPanel.add(digits.get(1));
        digitsPanel.add(digits.get(2));
        digitsPanel.add(digits.get(3));
        digitsPanel.add(digits.get(0));
        digitsPanel.add(digits.get(10));
        digitsPanel.add(digits.get(11));

        buttonPanel.add(digitsPanel);

        // Make panel for operator buttons
        JPanel operatorButtonPanel = new JPanel(new GridLayout(5, 1));

        ImageIcon addImage = new ImageIcon("Assignment8/images/add.png");
        add = new JButton(addImage);

        ImageIcon subImage = new ImageIcon("Assignment8/images/sub.png");
        sub = new JButton(subImage);

        ImageIcon multImage = new ImageIcon("Assignment8/images/mult.png");
        mult = new JButton(multImage);

        ImageIcon divImage = new ImageIcon("Assignment8/images/div.png");
        div = new JButton(divImage);

        ImageIcon eqImage = new ImageIcon("Assignment8/images/equals.png");
        eq = new JButton(eqImage);

        operatorButtonPanel.add(add);
        operatorButtonPanel.add(sub);
        operatorButtonPanel.add(mult);
        operatorButtonPanel.add(div);
        operatorButtonPanel.add(eq);
        buttonPanel.add(operatorButtonPanel);

        // Add both sets of buttons to displayPanel
        displayPanel.add(buttonPanel);
        add(displayPanel);


        // ActionListeners for respective buttons //
        // Decimal Button listener
        digits.get(10).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String currentText = outputField.getText();
                if(currentText.indexOf(".") < 0){
                    outputField.setText(currentText+".");
                }
            }
        });

        // Clear Button listener
        digits.get(11).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resetValues();
            }
        });

        // Operation Button listeners
        OperatorListener operatorListener = new OperatorListener();
        add.addActionListener(operatorListener);
        sub.addActionListener(operatorListener);
        mult.addActionListener(operatorListener);
        div.addActionListener(operatorListener);

        // Operation Menu Item listeners
        MenuListener menuListener = new MenuListener();
        addMenu.addActionListener(menuListener);
        subMenu.addActionListener(menuListener);
        multMenu.addActionListener(menuListener);
        divMenu.addActionListener(menuListener);


        // Digit Buttons listeners
        for(int i=0;i<=9;i++){
            digits.get(i).addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String currentText = outputField.getText();
                    JButton source = (JButton) e.getSource();
                    String newDigit = source.getText();
                    currentText = currentText + newDigit;
                    currentText = currentText.replaceFirst("^0+(?!$)", "");
                    outputField.setText(currentText);
                }
            });
        }

        // Equals Button listener
        eq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Double result = 0.0;
                String currentText = outputField.getText();
                try{
                    Double secondOperand = Double.parseDouble(currentText);

                    if(currentOperation.equals("+")){
                        result = firstOperand + secondOperand;
                    }
                    else if(currentOperation.equals("-")){
                        result = firstOperand - secondOperand;
                    }
                    else if(currentOperation.equals("*")){
                        result = firstOperand * secondOperand;
                    }
                    else if(currentOperation.equals("/")){
                        if(secondOperand != 0.0){
                            result = firstOperand / secondOperand;
                        }
                        else {
                            resetValues();
                            outputField.setBackground(Color.PINK);
                        }
                    }
                    outputField.setText(result.toString());
                    firstOperand = result;
                }
                catch(NumberFormatException e){
                    resetValues();
                }
            }
        });

        // Window Closing Listener
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });

        // Final touches
        setTitle("Ian Chavez's Calculator");
        setSize(500, 500);
        setVisible(true);

    }

    // Resets basic values such as current operation and first operand to their base information
    private void resetValues() {
        currentOperation = "";
        firstOperand = 0.0;
        outputField.setText("0");
    }

    /** Custom ActionListener for operator buttons in the Calculator
     * @Author Ian Chavez
     */
    private class OperatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            JButton source = (JButton)event.getSource();
            if (source == add) {
                currentOperation = "+";
            }
            else if (source == sub) {
                currentOperation = "-";
            }
            else if (source == mult) {
                currentOperation = "*";
            }
            else if (source == div) {
                currentOperation = "/";
            }

            String currentText = outputField.getText();
            try{
                Double currentTextDouble = Double.valueOf(currentText);
                firstOperand = currentTextDouble;
                outputField.setText("0");
            } catch(NumberFormatException e){
                resetValues();
            }
        }
    }

    /** Custom MenuListener for operator menu items in the Calculator, similar to operator button listener
     * @Author Ian Chavez
     */
    private class MenuListener implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            JMenuItem source = (JMenuItem)event.getSource();
            if (source.equals(addMenu)) {
                currentOperation = "+";
            }
            else if (source.equals(subMenu)) {
                currentOperation = "-";
            }
            else if (source.equals(multMenu)) {
                currentOperation = "*";
            }
            else if (source.equals(divMenu)) {
                currentOperation = "/";
            }

            String currentText = outputField.getText();
            try{
                Double currentTextDouble = Double.valueOf(currentText);
                firstOperand = currentTextDouble;
                outputField.setText("0");
            } catch(NumberFormatException e){
                resetValues();
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }

}
