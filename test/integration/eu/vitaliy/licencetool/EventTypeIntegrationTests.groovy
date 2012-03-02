package eu.vitaliy.licencetool

import static org.junit.Assert.*
import org.junit.*
import static org.fest.assertions.Assertions.*
import grails.test.mixin.TestFor

@TestFor(EventType)
class EventTypeIntegrationTests {

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testPersist() {
        def eventType = new EventType(name: "a")
        assert !eventType.validate()

        eventType.name = "aaaa"
        eventType.save()
        
        assert eventType.id != null
        assert EventType.findAllByName(eventType.name).size() > 0
    }
}
