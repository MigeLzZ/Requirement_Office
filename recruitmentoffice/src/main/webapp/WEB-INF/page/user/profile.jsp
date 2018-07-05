<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/begin-html.jsp"%>
<div align="center">
	<br>
	<div class="container">
		<br> <b>
			<div class="row" align="center">
				<div class="col-md-2">Логин</div>
				<div class="col-md-2">Пароль</div>
				<div class="col-md-2">Прописка</div>
				<div class="col-md-2">Рост</div>
				<div class="col-md-2">Вес</div>
				<div class="col-md-2">Кожные заболевания</div>
			</div>
		</b> <br>
		<div class="row" align="center">
			<div class="form-control input-md, col-md-2">${user.login}</div>
			<div class="form-control input-md, col-md-2">${user.password}</div>
			<div class="form-control input-md, col-md-2">${user.registration}</div>
			<div class="form-control input-md, col-md-2">${user.height}</div>
			<div class="form-control input-md, col-md-2">${user.weight}</div>
			<div class="form-control input-md, col-md-2">${user.skin_disease}</div>
		</div>
		<br><br><br><br>
		<form class="form-horizontal" action="profile_action" method="post">
			<fieldset>

				<!-- Form Name -->
				<h3><legend>Редактирование профиля</legend></h3>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="Login">Логин</label>
					<div class="col-md-4">
						<input id="Login" name="user_login" type="text"
							placeholder="" class="form-control input-md" required=""
							value="${user.login}">
					</div>
				</div>

				<!-- Password input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="Password">Пароль</label>
					<div class="col-md-4">
						<input id="Password" name="user_password" type="password"
							placeholder="" class="form-control input-md" required=""
							value="${user.password}"> <span class="help-block">(min
							5 symbols)</span>
					</div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="Registration">Прописка</label>
					<div class="col-md-4">
						<input id="Registration" name="user_registration" type="text"
							placeholder="" class="form-control input-md" required=""
							value="${user.registration}">
					</div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="Height">Рост</label>
					<div class="col-md-4">
						<input id="Height" name="user_height" type="text"
							placeholder="" class="form-control input-md" required=""
							value="${user.height}">
					</div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="Weight">Вес</label>
					<div class="col-md-4">
						<input id="Weight" name="user_weight" type="text"
							placeholder="" class="form-control input-md" required=""
							value="${user.weight}">
					</div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="SkinDisease">Кожные заболевания</label>
					<div class="col-md-4">
						<input id="SkinDisease" name="user_skin_disease" type="text"
							placeholder="" class="form-control input-md" required=""
							value="${user.skin_disease}">
					</div>
				</div>

				<!-- Button -->
				<div class="form-group">
					<div class="col-md-3">
						<button id="singlebutton" name="singlebutton"
							class="btn btn-info">Сохранить</button>
					</div>
				</div>
			</fieldset>
		</form>

		<c:if test="${msg_success!=null}">
			<div class="alert alert-success" role="alert">
				<c:out value="${msg_success}"></c:out>
			</div>
		</c:if>
	</div>
</div>

<%@ include file="/WEB-INF/include/end-html.jsp"%>