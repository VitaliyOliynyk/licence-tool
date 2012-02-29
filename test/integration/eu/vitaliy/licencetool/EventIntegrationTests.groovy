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
        def event = new Event(name: "a")
        assert !event.validate()

        event.name = "aaaa"
        event.save()

        assert event.id != null
        assert EventType.findByName(event.name).size() > 0
    }
}
