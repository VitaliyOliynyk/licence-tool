package eu.vitaliy.licencetool

class PersonProfile {
    String firstName
    String lastName
    String email
    static belongsTo = [person: Person]

    static constraints = {
        firstName(blank: false, minSize: 2, maxSize: 30)
        lastName(blank: false, minSize: 2, maxSize: 30)
        email(email:true, nullable: false)
    }
}
