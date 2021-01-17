package com.example.restful.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.restful.dto.Greeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingControllerTest {

  private GreetingController greetingController;

  @BeforeEach
  void beforeEach() {
    greetingController = new GreetingController();
  }

  @Test
  void shouldReturnGreetingWithDefaultMessage() {
    Greeting response = greetingController.greet("World!");
    assertEquals("Greeting(id=1, content=Hello, World!)", response.toString());
  }

  @Test
  void shouldReturnGreetingWithCustomMessage() {
    Greeting response = greetingController.greet("developer");
    assertEquals("Greeting(id=1, content=Hello, developer)", response.toString());
  }
}
