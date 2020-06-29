package dev.sobue.spock

import org.springframework.util.StringUtils
import spock.lang.Specification
import spock.lang.Unroll

class SpockSampleTests extends Specification {

    // 3 cases
    @Unroll
    def "StringUtils - Tests - #input"() {
        expect:
        assert StringUtils.isEmpty(input) == answer

        where:
        input | answer
        null  | true
        ""    | true
        "a"   | false
    }
}
