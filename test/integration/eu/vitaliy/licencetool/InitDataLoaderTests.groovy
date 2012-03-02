package eu.vitaliy.licencetool

import static org.junit.Assert.*
import org.junit.*
import static org.fest.assertions.Assertions.*
import grails.test.mixin.TestFor
import grails.test.mixin.Mock

@Mock(EventType)
class InitDataLoaderTests {

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testLoadData() {
        def initDataLoader = new InitDataLoader()
        initDataLoader.loadData()
        assert EventType.count() > 0
    }
}
