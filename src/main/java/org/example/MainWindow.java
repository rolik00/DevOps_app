package org.example;

import java.awt.Color;
import java.awt.Font;
import java.math.BigInteger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/** класс, создающий графический интерфейс программы. */
public final class MainWindow {
  /** Поле, определяющее цвет фона окна. */
  private static final Color MAINCOLOR = new Color(138, 103, 172);
  /** Поле, определяющее цвет надписей у окна. */
  private static final Color TITLECOLOR = new Color(233, 178, 127);
  /** Поле, определяющее шрифт надписей. */
  @SuppressWarnings("checkstyle:LineLength")
  private static final Font MAINFONT = new Font(Font.SANS_SERIF, Font.PLAIN + Font.BOLD, 14);
  /** Поле, определяющее место, куда пользователь вводит число. */
  private static JTextArea field;
  /** Поле, определяющее ответ для полученного значения. */
  private static JLabel answer;

  private MainWindow() { }

  /** функция, создающая графический интерфейс.
    *
    * @return - возвращает окно экрана
    */
  public static JFrame createMainWindow() {
    final int frameWidth = 600;
    final int frameHeight = 400;
    JFrame frame = new JFrame("Вычисление факториала");
    frame.setSize(frameWidth, frameHeight);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    frame.getContentPane().setBackground(MAINCOLOR);

    final int labelX = 50;
    final int labelY = 50;
    final int labelWidth = 500;
    final int labelHeight = 40;
    JLabel label = new JLabel("Введите число, большее нуля, для вычисления его факториала");
    label.setLocation(labelX, labelY);
    label.setSize(labelWidth, labelHeight);
    label.setForeground(TITLECOLOR);
    label.setFont(MAINFONT);
    frame.add(label);

    final int fieldX = 250;
    final int fieldY = 100;
    final int fieldWidth = 100;
    final int fieldHeight = 30;
    field = new JTextArea();
    field.setLocation(fieldX, fieldY);
    field.setSize(fieldWidth, fieldHeight);
    field.setFont(MAINFONT);
    frame.add(field);

    final int answerX = 200;
    final int answerY = 200;
    final int answerWidth = 300;
    final int answerHeight = 40;
    answer = new JLabel("");
    answer.setFont(MAINFONT);
    answer.setForeground(TITLECOLOR);
    answer.setSize(answerWidth, answerHeight);
    answer.setLocation(answerX, answerY);
    frame.add(answer);

    JButton button = createButton();
    frame.add(button);

    return frame;
  }

  /** функция, создающая кнопку для получения факториала введенного числа.
    *
    * @return - возвращает кнопку
    */
  private static JButton createButton() {
    final int buttonX = 200;
    final int buttonY = 300;
    final int buttonWidth = 200;
    final int buttonHeight = 40;
    JButton button = new JButton("Получить ответ!");
    button.setSize(buttonWidth, buttonHeight);
    button.setFont(MAINFONT);
    button.setLocation(buttonX, buttonY);
    button.addActionListener(e -> {
      int x = Integer.parseInt(field.getText());
      BigInteger factorial = Factorial.getFactorial(x);
      String s = "Факториал числа " + x + " равен " + factorial;
      answer.setText(s);
    });
    return button;
  }
}
