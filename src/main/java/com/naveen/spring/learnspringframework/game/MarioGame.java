package com.naveen.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{

  public void up() {
    System.out.println("MarioGame up");
  }
  public void down() {
    System.out.println("MarioGame down");
  }
  public void left() {
    System.out.println("MarioGame left");
  }
 public void right() {
    System.out.println("MarioGame right");
 }
}
