package com.learn.right.l;

public class App {
  public static void main(String[] args) {
    // Liskov Substitution Principle

    // Secara umum prinsi ini mengajarkan bahwa kelas turunan yang melakukan extends pada class parentnya
    // harus dapat mengoverride kelas parentnya tanpa harus merusak fungsi program

    Duck duck = new Duck();
    duck.eat();
    duck.swim();
    duck.quack();

    Duck malard = new Malard();
    malard.eat();
    malard.swim();
    malard.quack();
  }
}
