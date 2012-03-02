package eu.vitaliy.licencetool



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(PersonProfile)
class PersonProfileTests {


    void testValidate() {
        def personProfile = new PersonProfile()
        assert !personProfile.validate()

        personProfile.email = "aaaaa@pl.pl"
        personProfile.firstName = "Jan"
        personProfile.lastName = "Kowalski"
        assert personProfile.validate()


    }
}
