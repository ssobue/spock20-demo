package dev.sobue.spock

import org.junit.experimental.runners.Enclosed
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification
import spock.lang.Unroll

@RunWith(Enclosed)
class SpockApplicationTests {

    // 1 case
    @SpringBootTest
    static class InnerClass extends Specification {

        @Autowired
        ApplicationContext context

        def "Context Load Test"() {
            expect:
            assert context != null
        }
    }

    // 4 cases
    @SpringBootTest
    static class InnerClass2 extends Specification {

        @Autowired
        ApplicationContext context

        @Unroll
        def "Context Load Test - #cnt"() {
            expect:
            assert context != null
            where:
            cnt | _
            1   | _
            2   | _
            3   | _
            4   | _
        }
    }
}
