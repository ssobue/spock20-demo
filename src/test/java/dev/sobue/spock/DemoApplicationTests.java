package dev.sobue.spock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@DisplayName("Application Launching Tests")
class DemoApplicationTests {

  @Autowired
  private ApplicationContext context;

  // 1 case
  @Test
  @DisplayName("Context Load Test")
  void contextLoads() {
    assertNotNull(context);
  }
}
