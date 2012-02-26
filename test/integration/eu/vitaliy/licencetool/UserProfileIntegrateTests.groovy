package eu.vitaliy.licencetool

import static org.junit.Assert.*
import org.junit.*

class UserProfileIntegrateTests {

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
        def userProfile = new UserProfile(firstName: "Jan", lastName: "Kowalski")
        userProfile.save()
        assert userProfile.id > 0
        def userProfileSaved = UserProfile.findByFirstName("Jan")
        assert userProfile == userProfileSaved
    }
}
