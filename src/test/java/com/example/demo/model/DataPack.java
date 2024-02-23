package com.example.demo.model;

import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataPack {

  private Map<String, DataItem> items;
}
