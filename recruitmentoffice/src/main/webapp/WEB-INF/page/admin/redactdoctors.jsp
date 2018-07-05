<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/begin-html.jsp"%>
<div align="center">
	<br>
	<div class="container">
		<div class="row">
			<div class=col-md-2>Имя</div>
			<div class=col-md-2>Фамилия</div>
			<div class=col-md-2>Специальность</div>
			<div class=col-md-2>Время приёма</div>
		</div>
	</div>
	<br>
	<div class="container">
		<c:forEach items="${doctor_list}" var="doctor">
			<form class="form-horizontal" action="redact_doctors_action" method=post>
				<div class="row">
					<input id="id" class="form-control input-md" name="doctor_id"
						type="hidden" value="${doctor.id}" />
					<div class=col-md-2>
						<input id="name" class="form-control input-md"
							name="doctor_name" value="${doctor.name}" />
					</div>
					<div class=col-md-2>
						<input id="surname" class="form-control input-md"
							name="doctor_surname" value="${doctor.surname}" />
					</div>
					<div class=col-md-2>
						<input id="spec" class="form-control input-md"
							name="doctor_spec" value="${doctor.spec}" />
					</div>
					<div class=col-md-2>
						<input id="receiptTime" class="form-control input-md"
							name="doctor_receipt_time" value="${doctor.receiptTime}" />
					</div>
						
					<div class=col-md-2>
						<button id="UpdateD" value="UpdateD" name="UpdateD"
							class="btn btn-success">Обновить</button>
					</div>

					<div class=col-md-1>
						<button id="DeleteD" value="DeleteD" name="DeleteD"
							class="btn btn-warning">Удалить</button>
					</div>
				</div>
			</form>
			<br>
		</c:forEach>
		<c:if test="${msg_success!=null}">
			<div class="alert alert-success" role="alert">
				<c:out value="${msg_success}"></c:out>
			</div>
		</c:if>
		<br><br><br><br><br>
		<c:if test="${msg!=null}">
			<div class="alert alert-danger" role="alert">
				<c:out value="${msg}"></c:out>
			</div>
		</c:if>
	</div>
</div>
<%@ include file="/WEB-INF/include/end-html.jsp"%>