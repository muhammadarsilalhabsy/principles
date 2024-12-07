package com.learn.wrong.l;

// RubberDuck tidak seharusnya mengimplementasikan Duck
// menalinkan harus mengimplementasikan Toy atau sejenisnya
// dikaernakan RubberDuck tidak bisa makan
public class RubberDuck extends Duck{

  @Override
  void eat() {
    // do nothing...
  }
}
