package fr.michaelchlon.springcoredemo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach {
  public CricketCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  // __ * INFO: Define our init method __________________________________
  @PostConstruct
  public void doMyStartupStuff() {
    System.out.println("In doMyStartupStuff: " + getClass().getSimpleName());
  }

  // __ * INFO: Define our destroy method __________________________________
  @PreDestroy
  public void doMyCleanupStuff() {
    System.out.println("In doMyCleanupStuff: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes";
  }

}
