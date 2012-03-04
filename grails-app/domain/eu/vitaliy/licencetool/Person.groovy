package eu.vitaliy.licencetool

class Person {

	transient springSecurityService

	String username
	String password
	boolean enabled
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
    PersonProfile profile

    static belongsTo = LicenceDraw
    static hasMany = [licenceDraws: LicenceDraw]

	static constraints = {
		username blank: false, unique: true, size: 2..20
		password blank: false
        profile(nullable: true, validator: {
            it?.validate()
        })
	}

	static mapping = {
		password column: '`password`'
	}

	Set<Role> getAuthorities() {
		PersonRole.findAllByPerson(this).collect { it.role } as Set
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService.encodePassword(password)
	}
}
