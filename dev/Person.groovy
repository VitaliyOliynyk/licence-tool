package eu.vitaliy.licencetool

class Person {

    String userName
    String password
    Date dateCreated
    PersonProfile profile

    static belongsTo = LicenceDraw
    static hasMany = [licenceDraws: LicenceDraw]

    static constraints = {
        userName(blank: false, size: 2..20)
        password(size: 4..30)
        profile(nullable: true, validator: {
                it?.validate()
        })
    }
}
