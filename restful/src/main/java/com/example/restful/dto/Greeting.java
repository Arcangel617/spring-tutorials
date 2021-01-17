package com.example.restful.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Greeting {

  private final Long id;
  private final String content;
}
