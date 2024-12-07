package com.learn.right.o;

public class App {
  public static void main(String[] args) {

    // Open / Close principle
    // Secara umum prinsip ini menyarankan agar setiap class itu tidak bisa di modifikasi secara langsung
    // namun bisa di extends untuk melakukan modifikasi, sehingga membuat kode menjadi konsisten
    // tanpa harus mempengaruhi kode yang sudah ada sebelumnya.
    // untuk melakukan cara seperti ini kita dapat menggunakan pewarisan parent ke child (polymorphism)

    // Normal Robot
    MyRobot normalRobot = new MyRobot();
    normalRobot.talk();
    normalRobot.walk();

    // Super Robot
    MySuperRobot superRobot = new MySuperRobot();
    superRobot.walk();
    superRobot.talk();
    superRobot.fly();
    superRobot.killMosquito();
  }
}
