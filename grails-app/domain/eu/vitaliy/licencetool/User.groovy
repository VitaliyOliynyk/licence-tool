package eu.vitaliy.licencetool

class User {

    String userName
    UserProfile profile
    Date dateCreated
    static constraints = {
         userName(blank: false, minSize: 3, maxSize: 20)
    }
}
