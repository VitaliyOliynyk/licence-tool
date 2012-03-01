package eu.vitaliy.licencetool

class LicenceDraw {

    int qty
    Event event
    Product product

    static hasMany = [persons: Person]

    static constraints = {
        qty()
        event()
    }
}

