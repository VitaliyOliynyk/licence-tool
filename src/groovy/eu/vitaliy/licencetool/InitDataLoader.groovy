package eu.vitaliy.licencetool

/**
 * Created by IntelliJ IDEA.
 * User: xaoc
 * Date: 02.03.12
 * Time: 14:02
 * To change this template use File | Settings | File Templates.
 */
class InitDataLoader {

    
    
    void loadData(){
        def eventTypes = eventTypes()
        def events = events(eventTypes[0])
        def products = products()
        def licenceDraws = licenceDraws(events[0], products[0])
        def profiles = personProfiles()
        def persons = persons(profiles[0])

    }

    Collection products() {
        createOrGetData([new Product(name: "Intellij IDEA", productVersion: 11)])
    }

    Collection licenceDraws(Event event, Product product) {
        createOrGetData([new LicenceDraw(event: event, product: product, qty: 1)])
    }

    Collection events(EventType eventType) {
        createOrGetData([new Event(name: "Scala", eventDate: new Date(), eventType: eventType)])
    }

    private Collection persons(PersonProfile personProfile) {

        createOrGetData([new Person(username: "user1", password: "123456",
                accountExpired:false, accountLocked:false, passwordExpired:false,
                enabled: true, profile: personProfile)])
    }

    private Collection personProfiles() {
        createOrGetData([new PersonProfile(firstName: "Jan", lastName: "Kowalski", email: "aaaa@pl.pl")])
    }

    private Collection eventTypes() {
        createOrGetData( [
                new EventType(name: "Warszawa JUG"),
                new EventType(name: "Agile Warsaw"),
                new EventType(name: "Warszawa DP")
        ])
    }


    private  Collection createOrGetData(domains){
        if(!domains){ return [] }

        def DomainType = domains[0].class
        if (!DomainType.count()) {
            domains*.save(failOnError: true)
            domains
        } else {
            domains = DomainType.findAll()
        }
    }

}
