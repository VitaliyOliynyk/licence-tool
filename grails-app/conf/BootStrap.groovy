import eu.vitaliy.licencetool.EventType

class BootStrap {

    def init = { servletContext ->
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

    def destroy = {
    }
}
