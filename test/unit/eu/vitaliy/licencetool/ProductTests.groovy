package eu.vitaliy.licencetool



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Product)
class ProductTests {

    
    void testValidate() {
        def product = new Product()
        assert !product.validate()

        product.name = "Intellij Idea"
        product.productVersion = 11

        assert product.validate()
    }
}
