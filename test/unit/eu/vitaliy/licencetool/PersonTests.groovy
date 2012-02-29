package eu.vitaliy.licencetool



import grails.test.mixin.*

import static org.fest.assertions.Assertions.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Person)
@Mock(PersonProfile)
class PersonTests {

    void testSavePerson() {


        //given
        def user1 = new Person(userName: "user1", password: "1234567",
                profile: new PersonProfile(firstName: "Jan", lastName: "Kowalski", email: "aaaaa@pl.pl"))
        def user2 = new Person(userName: "u", password: "1234567",
                profile: new PersonProfile(firstName: "Jan", lastName: "Kowalski", email: "aaaaa@pl.pl"))
        def user3 = new Person(userName: "user1", password: "1234567",
                profile: new PersonProfile(firstName: "J", lastName: "Kowalski", email: "aaaaa@pl.pl"))

        //when

        //then
        assert user1.validate() == true
        assert user2.validate() == false
        assert user3.validate() == false
        assert user3.profile.validate() == false

    }
}
