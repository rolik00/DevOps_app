package org.example;

import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;

public class MainWindow {
    private static final Color main_color = new Color(138, 103, 172), title_color = new Color(233, 178, 127);
    private static final Font font = new Font(Font.SANS_SERIF, Font.PLAIN + Font.BOLD, 14);
    private static JTextArea field;
    private static JLabel answer;

    public static JFrame create_main_window() {
        JFrame frame = new JFrame("Вычисление факториала");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(main_color);

        JLabel label = new JLabel("Введите число, большее нуля, для вычисления его факториала");
        label.setLocation(50, 50);
        label.setSize(500, 40);
        label.setForeground(title_color);
        label.setFont(font);
        frame.add(label);

        field = new JTextArea();
        field.setLocation(250, 100);
        field.setSize(100, 30);
        field.setFont(font);
        frame.add(field);

        answer = new JLabel("");
        answer.setFont(font);
        answer.setForeground(title_color);
        answer.setSize(300, 40);
        answer.setLocation(200, 200);
        frame.add(answer);

        JButton button = create_button();
        frame.add(button);

        return frame;
    }

    private static JButton create_button() {
        JButton button = new JButton("Получить ответ!");
        button.setSize(200, 40);
        button.setFont(font);
        button.setLocation(200, 300);
        button.addActionListener(e -> {
            int x = Integer.parseInt(field.getText());
            BigInteger factorial = Factorial.getFactorial(x);
            String s = "Факториал числа " + x + " равен " + factorial;
            answer.setText(s);
        });
        return button;
    }
}