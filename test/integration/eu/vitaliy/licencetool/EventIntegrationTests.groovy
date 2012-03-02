package eu.vitaliy.licencetool

import static org.junit.Assert.*
import org.junit.*
import static org.fest.assertions.Assertions.*
import grails.test.mixin.TestFor

@TestFor(Event)
class EventIntegrationTests {

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testSomething() {
        def event = new Event(name: "a", eventDate: new Date(), eventType: new EventType(name: "JUG"))
        assert !event.validate()

        event.name = "aaaa"
        assert event.validate()
        event.save()

        assert event.id != null
        assert Event.findAllByName(event.name).size() > 0
    }
}
