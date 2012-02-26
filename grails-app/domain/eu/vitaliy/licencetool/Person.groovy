package eu.vitaliy.licencetool

class Person {

    String userName
    static hasOne = [profile: PersonProfile]
    static constraints = {
         userName(blank: false, minSize: 3, maxSize: 20)

    }

}
