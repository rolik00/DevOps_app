package org.example;

import javax.swing.JFrame;

/** класс, запускающий программу. */
public final class Main {
  private Main() {}

  /**
   * функция, запускающая программу.
   *
   * @param args - аргументы запуска
   */
  public static void main(final String[] args) {
    JFrame frame = MainWindow.createMainWindow();
    frame.setVisible(true);
  }
}
