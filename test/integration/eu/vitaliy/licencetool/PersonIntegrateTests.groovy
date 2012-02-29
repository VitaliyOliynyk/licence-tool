package eu.vitaliy.licencetool

import org.junit.*

class PersonIntegrateTests {

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
        def person = new Person(userName: "user1")
        person.save()
        person.profile = new PersonProfile(firstName: "Jan", lastName: "Kowalski", email: "jkaa@gmail.com")
		

        assert Person.count() > 0
        def savedPerson = Person.get(person.id)

        assert person.id == savedPerson.id
        assert person == savedPerson

        assert person.profile.firstName == savedPerson.profile.firstName
    }

}
