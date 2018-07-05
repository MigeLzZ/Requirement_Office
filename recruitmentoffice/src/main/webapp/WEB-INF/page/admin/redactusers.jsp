<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/begin-html.jsp"%>
<div align="center">
	<br>
	<div class="container-fluid">
		<div class="row">
			<div class=col-md-1>Логин</div>
			<div class=col-md-1>Пароль</div>
			<div class=col-md-1>Имя</div>
			<div class=col-md-1>Фамилия</div>
			<div class=col-md-1>Возраст</div>
			<div class=col-md-1>Прописка</div>
			<div class=col-md-1>Рост</div>
			<div class=col-md-1>Вес</div>
			<div class=col-md-1>Группа крови</div>
			<div class=col-md-1>Кожные заболевания</div>
		</div>
	</div>
	<br>
	<div class="container-fluid">
		<c:forEach items="${user_list}" var="user">
			<form class="form-horizontal" action="redact_users_action" method=post>
				<div class="row">
					<input id="id" class="form-control input-md" name="user_id"
						type="hidden" value="${user.id}" />
					<div class=col-md-1>
						<input id="login" class="form-control input-md" name="user_login"
							value="${user.login}" />
					</div>
					<div class=col-md-1>
						<input id="password" class="form-control input-md"
							name="user_password" value="${user.password}" />
					</div>
					<div class=col-md-1>
						<input id="name" class="form-control input-md"
							name="user_name" value="${user.name}" />
					</div>
					<div class=col-md-1>
						<input id="surname" class="form-control input-md"
							name="user_surname" value="${user.surname}" />
					</div>
					<div class=col-md-1>
						<input id="age" class="form-control input-md"
							name="user_age" value="${user.age}" />
					</div>
					<div class=col-md-1>
						<input id="registration" class="form-control input-md"
							name="user_registration" value="${user.registration}" />
					</div>
					<div class=col-md-1>
						<input id="height" class="form-control input-md"
							name="user_height" value="${user.height}" />
					</div>
					<div class=col-md-1>
						<input id="weight" class="form-control input-md"
							name="user_weight" value="${user.weight}" />
					</div>
					<div class=col-md-1>
						<input id="typeOfBlood" class="form-control input-md"
							name="user_type_of_blood" value="${user.type_of_blood}" />
					</div>
					<div class=col-md-1>
						<input id="skinDisease" class="form-control input-md"
							name="user_skin_disease" value="${user.skin_disease}" />
					</div>
					<input id="rolesID" class="form-control input-md"
						name="user_roles_id" type="hidden" value="${user.roles_id}" />
						
					<div class=col-md-1>
						<button id="Update" value="Update" name="Update"
							class="btn btn-success">Обновить</button>
					</div>

					<div class=col-md-1>
						<button id="Delete" value="Delete" name="Delete"
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
		<c:if test="${msg!=null}">
			<div class="alert alert-danger" role="alert">
				<c:out value="${msg}"></c:out>
			</div>
		</c:if>
	</div>
</div>
<%@ include file="/WEB-INF/include/end-html.jsp"%>