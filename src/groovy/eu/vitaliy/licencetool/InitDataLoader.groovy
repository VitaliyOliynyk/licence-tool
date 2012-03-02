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
        def eventTypes
        if (!EventType.count()) {
            eventTypes = [
                    new EventType(name: "Warszawa JUG"),
                    new EventType(name: "Agile Warsaw"),
                    new EventType(name: "Warszawa DP")
            ]
            eventTypes*.save(failOnError: true)
            eventTypes
        } else {
            eventTypes = EventType.findAll()
        }
    }
}
