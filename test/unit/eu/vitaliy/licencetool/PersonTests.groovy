package eu.vitaliy.licencetool



import grails.test.mixin.*

import static org.fest.assertions.Assertions.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Person)
class PersonTests {

    void testSavePerson() {
        //given
        def user1 = new Person(userName: "user1", profile: new PersonProfile(firstName: "Jan", lastName: "Kowalski"))
        def user2 = new Person(userName: "u", profile: new PersonProfile(firstName: "Jan", lastName: "Kowalski"))
        def user3 = new Person(userName: "user1", profile: new PersonProfile(firstName: "J", lastName: "Kowalski"))

        //when

        //then
        assertThat(user1.validate()).isTrue()
        assertThat(user2.validate()).isFalse()
        assertThat(user3.validate()).isFalse()
        //when
    }
}
