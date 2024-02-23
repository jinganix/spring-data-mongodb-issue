package com.example.demo.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FooCollection extends DataCollection {

  private DataBase<List<Map<String, BigDecimal>>> dummy;
}
