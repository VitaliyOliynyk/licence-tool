package eu.vitaliy.licencetool



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(EventType)
class EventTypeTests {

    void testSomething() {
        def eventType = new EventType(name: "a")
        assert !eventType.validate()

        eventType.name = "aaaa"
        assert eventType.validate()
    }
}
