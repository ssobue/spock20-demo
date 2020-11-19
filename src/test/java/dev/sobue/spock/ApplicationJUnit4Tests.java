package dev.sobue.spock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationJUnit4Tests {

  @Autowired
  private ApplicationContext context;

  // 1 case
  @Test
  public void contextLoads() {
    assertNotNull(context);
  }
}
