package eu.vitaliy.licencetool

import static org.junit.Assert.*
import org.junit.*
import static org.fest.assertions.Assertions.*
import grails.test.mixin.TestFor

@TestFor(PersonProfile)
class PersonProfileIntegrationTests {

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
        def personProfile = new PersonProfile(firstName: "Jan", lastName: "Kowalski", email: "aaaa@pl.pl")
        assert personProfile.validate() == true
        personProfile.save()
        assert personProfile.id != null
        def userProfileSaved = PersonProfile.findByFirstName("Jan")
        assert personProfile == userProfileSaved
    }
}
