package dev.sobue.spock;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.springframework.util.StringUtils.hasLength;

class SampleTests {

  // 3 cases
  @ParameterizedTest(name = "{0} => {1}")
  @MethodSource("input")
  @DisplayName("StringUtils - Tests - ")
  void test(String input, Boolean answer) {
    assertEquals(answer, !hasLength(input));
  }

  private static Stream<Arguments> input() {
    return Stream.of(
        arguments(null, true),
        arguments("", true),
        arguments("a", false)
    );
  }
}
