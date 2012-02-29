package eu.vitaliy.licencetool



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Event)
class EventTests {


    void testValidate() {
        def event = new Event(name: "a")
        assert !event.validate()

        event.name = "aaaa"
        assert event.validate()
    }
}
