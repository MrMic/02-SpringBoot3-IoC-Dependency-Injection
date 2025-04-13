package fr.michaelchlon.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.michaelchlon.springcoredemo.common.Coach;
import fr.michaelchlon.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {

  @Bean("aquatic")
  public Coach swimCoach() {
    return new SwimCoach();
  }
}
