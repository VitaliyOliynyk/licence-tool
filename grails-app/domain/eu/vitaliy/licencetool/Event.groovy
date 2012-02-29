package eu.vitaliy.licencetool

class Event {

    String name
    Date date
    EventType eventType

    static constraints = {
        name(size: 2..255)
    }
}
