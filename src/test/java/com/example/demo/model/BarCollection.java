package com.example.demo.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BarCollection extends DataCollection {

  private DataBase<List<DataValue>> value;
}
