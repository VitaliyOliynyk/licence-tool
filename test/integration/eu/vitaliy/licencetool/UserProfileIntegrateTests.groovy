package eu.vitaliy.licencetool

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
        def userProfile = new PersonProfile(firstName: "Jan", lastName: "Kowalski")
        userProfile.person = new Person(userName: "user1", profile: userProfile)
        userProfile.save()
        assert userProfile.id > 0
        def userProfileSaved = PersonProfile.findByFirstName("Jan")
        assert userProfile == userProfileSaved

    }
}
