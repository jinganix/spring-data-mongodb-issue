package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import com.example.demo.model.DataPack;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

class ConverterTest {

  @Test
  void test() throws IOException {
    try (InputStream stream = ConverterTest.class.getResourceAsStream("/demo.json")) {
      assert stream != null;
      String text = new String(stream.readAllBytes(), StandardCharsets.UTF_8);
      Bson bson = Document.parse(text);
      MappingMongoConverter mappingMongoConverter =
          new MappingMongoConverter(mock(DefaultDbRefResolver.class), new MongoMappingContext());
      DataPack data = mappingMongoConverter.read(DataPack.class, bson);
      assertNotNull(data);
    }
  }
}
