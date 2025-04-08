package fr.michaelchlon.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.michaelchlon.springcoredemo.common.Coach;

@RestController
public class DemoController {
  // Define a private field for the dependency
  private Coach myCoach;
  private Coach anotherCoach;

  @Autowired
  public DemoController(
      @Qualifier("cricketCoach") Coach theCoach,
      @Qualifier("cricketCoach") Coach theAnotherCoach) {

    System.out.println("In constructor: " + getClass().getSimpleName());

    myCoach = theCoach;
    anotherCoach = theAnotherCoach;
  }

  // Define an endpoint to return the daily workout
  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

  @GetMapping("/check")
  public String check() {
    return "Comapring beans: myCoach == anotherCoach: " + (myCoach == anotherCoach);
  }
}
