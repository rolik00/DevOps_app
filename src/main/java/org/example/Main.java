package org.example;

import javax.swing.JFrame;

/** класс, запускающий программу. */
public class Main {
  public static void main(String[] args) {
    JFrame frame = MainWindow.create_main_window();
    frame.setVisible(true);
  }
}