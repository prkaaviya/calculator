import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char operator;
    private JPanel JavaCalculator;
    private JTextField textField;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonPoint;
    private JButton buttonClear;
    private JButton buttonEquals;
    private JButton buttonMinus;
    private JButton buttonPlus;
    private JButton buttonMultiply;
    private JButton buttonDivide;

    public void getOperator(String buttonText) {
        operator = buttonText.charAt(0);
        total1 = total1 + Double.parseDouble(textField.getText());
        textField.setText("");
    }


    public JavaCalculator() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText() + button1.getText();
                textField.setText(text);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText() + button2.getText();
                textField.setText(text);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText() + button3.getText();
                textField.setText(text);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText() + button4.getText();
                textField.setText(text);
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText() + button5.getText();
                textField.setText(text);
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText() + button6.getText();
                textField.setText(text);
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText() + button7.getText();
                textField.setText(text);
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText() + button8.getText();
                textField.setText(text);
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText() + button9.getText();
                textField.setText(text);
            }
        });

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText() + button0.getText();
                textField.setText(text);
            }
        });

        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonText = buttonPlus.getText();
                getOperator(buttonText);
            }
        });

        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonText = buttonMinus.getText();
                getOperator(buttonText);
            }
        });

        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonText = buttonMultiply.getText();
                getOperator(buttonText);
            }
        });

        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonText = buttonDivide.getText();
                getOperator(buttonText);
            }
        });

        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                switch (operator) {
                    case '+':
                        total2 = total1 + Double.parseDouble(textField.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textField.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textField.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textField.getText());
                        break;
                }

                textField.setText(Double.toString(total2));
                total1 = 0;
            }
        });

        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total2 = 0;
                textField.setText("");
            }
        });

        buttonPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField.getText().equals("")) {
                    textField.setText("0.");
                }
                else if (textField.getText().contains(".")) {
                    buttonPoint.setEnabled(false);
                }
                else {
                    String text = textField.getText() + buttonPoint.getText();
                    textField.setText(text);
                }
                buttonPoint.setEnabled(true);
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
