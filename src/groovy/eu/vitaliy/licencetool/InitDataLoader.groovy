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
        def eventTypes = createOrGetEventTypes()
    }

    private createOrGetEventTypes() {
        def eventTypes = createOrGetData( [
                new EventType(name: "Warszawa JUG"),
                new EventType(name: "Agile Warsaw"),
                new EventType(name: "Warszawa DP")
        ])
    }


    private  createOrGetData(domains){
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
