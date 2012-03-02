package eu.vitaliy.licencetool



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(LicenceDraw)
class LicenceDrawTests {

    @Ignore
    void testValidate() {
        def licenceDraw = new LicenceDraw()
        assert !licenceDraw.validate()

        licenceDraw.event = new Event(
                name: "a",
                eventDate : new Date(),
                eventType: new EventType(name: "JUG"),
                product: new Product(name: "Intellij IDEA", version: 11))
        assert licenceDraw.validate()

    }
}
