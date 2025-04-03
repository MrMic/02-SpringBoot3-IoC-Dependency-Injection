package fr.michaelchlon.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.michaelchlon.springcoredemo.common.Coach;

@RestController
public class DemoController {
  // Define a private field for the dependency
  private Coach myCoach;

  // Define a constructor for dependency injection
  @Autowired
  // This constructor will be called by Spring to inject the dependency
  // The @Autowired annotation is optional in this case, as there is only one
  // constructor
  public DemoController(Coach theCoach) {
    myCoach = theCoach;
  }

  // Define an endpoint to return the daily workout
  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }
}
