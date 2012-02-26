package eu.vitaliy.licencetool

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
        def person = new Person(userName: "user1", profile: new PersonProfile(firstName: "Jan", lastName: "Kowalski", email: "jkgmail.com"))
        person.save()


        def savedPerson = Person.get(person.id)

        assert person.id == savedPerson.id
        assert person == savedPerson

        assert person.profile.firstName == savedPerson.profile.firstName
    }

}
