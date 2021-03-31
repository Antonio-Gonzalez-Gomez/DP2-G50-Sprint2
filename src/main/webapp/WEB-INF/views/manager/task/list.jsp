<%--
- list.jsp
-
- Copyright (C) 2012-2021 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list>
	<acme:list-column code="manager.task.list.label.title" path="title" width="10%"/>
	<acme:list-column code="manager.task.list.label.description" path="description" width="10%"/>
	<acme:list-column code="manager.task.list.label.link" path="link" width="10%"/>
	<acme:list-column code="manager.task.list.label.startDate" path="startDate" width="10%"/>
	<acme:list-column code="manager.task.list.label.endingDate" path="endingDate" width="10%"/>
	<acme:list-column code="manager.task.list.label.workload" path="workload" width="10%"/>
	<acme:list-column code="manager.task.list.label.finished" path="finished" width="10%"/>
	<acme:list-column code="manager.task.list.label.privacy" path="privacy" width="10%"/>
</acme:list>