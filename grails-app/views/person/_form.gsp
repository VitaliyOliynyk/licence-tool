<%@ page import="eu.vitaliy.licencetool.Person" %>



<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'userName', 'error')} required">
	<label for="userName">
		<g:message code="person.userName.label" default="User Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="userName" maxlength="20" required="" value="${personInstance?.userName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'password', 'error')} ">
	<label for="password">
		<g:message code="person.password.label" default="Password" />
		
	</label>
	<g:textField name="password" maxlength="30" value="${personInstance?.password}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'profile', 'error')} ">
	<label for="profile">
		<g:message code="person.profile.label" default="Profile" />
		
	</label>
	<g:select id="profile" name="profile.id" from="${eu.vitaliy.licencetool.PersonProfile.list()}" optionKey="id" value="${personInstance?.profile?.id}" class="many-to-one" noSelection="['null': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'licenceDraws', 'error')} ">
	<label for="licenceDraws">
		<g:message code="person.licenceDraws.label" default="Licence Draws" />
		
	</label>
	
</div>

