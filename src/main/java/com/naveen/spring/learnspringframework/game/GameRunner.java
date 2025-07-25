package com.naveen.spring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

  @Autowired
  private GamingConsole gamingConsole;

  public GameRunner(GamingConsole gamingConsole) {
    this.gamingConsole = gamingConsole;
  }


  public void run() {
    gamingConsole.up();
    gamingConsole.down();
    gamingConsole.left();
    gamingConsole.right();
  }
}