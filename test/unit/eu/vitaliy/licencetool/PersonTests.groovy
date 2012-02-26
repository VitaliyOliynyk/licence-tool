package eu.vitaliy.licencetool



import grails.test.mixin.*

import static org.fest.assertions.Assertions.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Person)
class PersonTests {

    void testSomething() {
       def user = new Person(userName:"user1", profile: new PersonProfile(firstName: "Jan", lastName: "Kowalski"))

       assertThat(user.userName).isEqualTo("user1")
    }
}
