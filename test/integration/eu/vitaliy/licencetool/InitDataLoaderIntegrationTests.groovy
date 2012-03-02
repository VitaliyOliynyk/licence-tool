package eu.vitaliy.licencetool

import static org.junit.Assert.*
import org.junit.*
import static org.fest.assertions.Assertions.*
import grails.test.mixin.TestFor
import grails.test.mixin.Mock

@Mock([EventType, PersonProfile, Person])
class InitDataLoaderIntegrationTests {

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    private checkDomainClasses(domainClasses){
        domainClasses.each {
            assert it.count() > 0
        }
    }

    @Test
    void testLoadData() {
        def initDataLoader = new InitDataLoader()
        initDataLoader.loadData()
        checkDomainClasses([EventType, PersonProfile, Person])
    }
}
