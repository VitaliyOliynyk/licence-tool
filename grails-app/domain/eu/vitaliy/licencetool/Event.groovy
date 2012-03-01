package eu.vitaliy.licencetool

class Event {

    String name
    Date eventDate
    EventType eventType

    static constraints = {
        name(size: 2..255)
        eventDate()
        eventType()
    }

    @Override
    public String toString() {
        "${eventType} / ${name} / ${eventDate}";
    }


}
