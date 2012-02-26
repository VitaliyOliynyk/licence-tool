package eu.vitaliy.licencetool



import grails.test.mixin.*
import org.junit.*
import static org.fest.assertions.Assertions.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {

    void testSomething() {
       def user = new User(userName:"user1", profile: new UserProfile(firstName: "Jan", lastName: "Kowalski"))

       assertThat(user.userName).isEqualTo("user1")
    }
}
