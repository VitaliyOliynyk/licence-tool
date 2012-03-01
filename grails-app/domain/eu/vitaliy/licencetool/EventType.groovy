package eu.vitaliy.licencetool

class EventType {

    String name

    @Override
    public String toString() {
        name
    }

    static constraints = {
        name(size: 2..128)
    }


}
