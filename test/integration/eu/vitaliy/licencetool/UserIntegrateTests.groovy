package eu.vitaliy.licencetool

import static org.junit.Assert.*
import org.junit.*

class UserIntegrateTests {

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
        def user = new User(userName: "user1", profile: new UserProfile(firstName: "Jan", lastName: "Kowalski"))
        user.save()


        def savedUser = User.get(user.id)

        assert user.id == savedUser.id
        assert user == savedUser
        assert user.dateCreated != null
        assert user.dateCreated == savedUser.dateCreated

        assert user.profile.firstName == savedUser.profile.firstName
    }

}
