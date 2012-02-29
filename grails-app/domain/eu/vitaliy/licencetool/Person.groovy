package eu.vitaliy.licencetool

class Person {

    String userName
    Date dateCreated
    PersonProfile profile

    static constraints = {
         userName(blank: false, size:  2..20)
         profile(nullable: true)
    }

}
