package eu.vitaliy.licencetool

class PersonProfile {
    String firstName
    String lastName
    String email
    static belongsTo = Person

    static constraints = {
        firstName(blank: false, size: 2..30)
        lastName(blank: false, size: 2..30)
        email(email:true, blank: false)
    }
}
