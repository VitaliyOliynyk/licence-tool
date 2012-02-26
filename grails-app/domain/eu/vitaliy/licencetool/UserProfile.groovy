package eu.vitaliy.licencetool

class UserProfile {
    String firstName
    String lastName
    static belongsTo = User
    static constraints = {
        firstName(blank: false, minSize: 2, maxSize: 30)
        lastName(blank: false, minSize: 2, maxSize: 30)
    }
}
