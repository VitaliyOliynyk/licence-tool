package eu.vitaliy.licencetool

import java.sql.Time

class Event {

    String name
    Time eventDate
    EventType eventType

    static constraints = {
        name(size: 2..255)
    }

}
