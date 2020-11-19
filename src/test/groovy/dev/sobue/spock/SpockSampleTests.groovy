package dev.sobue.spock

import spock.lang.Specification
import spock.lang.Unroll

import static org.springframework.util.StringUtils.hasLength

class SpockSampleTests extends Specification {

    // 3 cases
    @Unroll
    def "StringUtils - Tests - #input"() {
        expect:
        assert !hasLength(input) == answer

        where:
        input | answer
        null  | true
        ""    | true
        "a"   | false
    }
}
