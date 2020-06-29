package dev.sobue.spock;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SampleTests {

  // 3 cases
  @ParameterizedTest(name = "{0} => {1}")
  @MethodSource("input")
  @DisplayName("StringUtils - Tests - ")
  public void test(String input, Boolean answer) {
    assertEquals(answer, StringUtils.isEmpty(input));
  }

  private static Stream<Arguments> input() {
    return Stream.of(
        arguments(null, true),
        arguments("", true),
        arguments("a", false)
    );
  }
}
