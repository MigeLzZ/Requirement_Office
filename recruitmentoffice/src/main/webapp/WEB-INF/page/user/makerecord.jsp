<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/begin-html.jsp"%>
<div align="center">
	<br>
	<div class="container">
		<div class="row">
			<div class=col-md-2>Дата</div>
			<div class=col-md-2>Время</div>
			<div class=col-md-2>Доктор</div>
		</div>
	</div>
	<br>
	<div class="container">
		<c:forEach items="${schedule_list}" var="schedule">
			<form class="form-horizontal" action="appointment_action" method=post>
				<div class="row">
					<input id="id" class="form-control input-md" name="schedule_id"
						type="hidden" value="${schedule.id}" />
					<div class=col-md-2>
						<input id="date" readonly class="form-control plaintext"
							name="schedule_date" value="${schedule.date}" />
					</div>
					<div class=col-md-2>
						<input id="timeSlot" readonly class="form-control plaintext"
							name="schedule_timeslot" value="${schedule.time_slot}" />
					</div>
					<!-- <div class=col-md-2>
						<input id="userId" class="form-control input-md"
							name="schedule_user_id" type="hidden" value="${schedule.user_id}" />
					</div> -->
					
					<div class=col-md-2>
						<c:forEach items="${doctor_list}" var="doctor">
							<c:if test="${doctor.id==schedule.doctors_id}">
								<input class="form-control input-md" value="${doctor.name}" />
							</c:if>
						</c:forEach>
					</div>
					
					<!-- ==schedule.doctors_id -->
					
					<div class=col-md-1>
						<button id="Record" value="Record" name="Record"
							class="btn btn-info">Записаться</button>
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
		
		<c:if test="${msg!=null}">
			<div class="alert alert-danger" role="alert">
				<c:out value="${msg}"></c:out>
			</div>
		</c:if>
		
	</div>
</div>
<%@ include file="/WEB-INF/include/end-html.jsp"%>