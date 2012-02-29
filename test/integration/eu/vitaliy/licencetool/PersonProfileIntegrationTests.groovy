package eu.vitaliy.licencetool

import static org.junit.Assert.*
import org.junit.*
import static org.fest.assertions.Assertions.*

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
        def userProfile = new PersonProfile(firstName: "Jan", lastName: "Kowalski", email: "aaaa@pl.pl")
        userProfile.save()
        assert userProfile.id != null
        def userProfileSaved = PersonProfile.findByFirstName("Jan")
        assert userProfile == userProfileSaved
    }
}
