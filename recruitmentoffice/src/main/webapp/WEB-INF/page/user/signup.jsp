<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/begin-html.jsp"%>
<div align="center">
	<br>
	<div align="center">
		<div class="container">
			<div class="page-header">
				<h2>Здравствуй Призывник!</h2>
			</div>
			<br>
			<form class="form-horizontal" action="signup_action" method="post">
				<fieldset>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="Login">Логин</label>
						<div class="col-md-4">
							<input id="Login" name="user_login" type="text"
								placeholder="Вася92Победитель" class="form-control input-md"
								required="">
						</div>
					</div>

					<!-- Password input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="Password">Пароль</label>
						<div class="col-md-4">
							<input id="Password" name="user_password" type="password"
								placeholder="Минимум 5 знаков" class="form-control input-md"
								required="">
						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="Name">Имя</label>
						<div class="col-md-4">
							<input id="Name" name="user_name" type="text"
								placeholder="Диван" class="form-control input-md" required="">
						</div>
					</div>
					
					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="Surname">Фамилия</label>
						<div class="col-md-4">
							<input id="Surname" name="user_surname" type="text"
								placeholder="Генералов" class="form-control input-md" required="">
						</div>
					</div>
					
					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="Age">Возраст</label>
						<div class="col-md-4">
							<input id="Age" name="user_age" type="text"
								placeholder="18" class="form-control input-md" required="">
						</div>
					</div>
					
					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="Registration">Прописка</label>
						<div class="col-md-4">
							<input id="Registration" name="user_registration" type="text"
								placeholder="г.Минск, ул.Гамарника" class="form-control input-md" required="">
						</div>
					</div>
					
					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="Height">Рост</label>
						<div class="col-md-4">
							<input id="Height" name="user_height" type="text"
								placeholder="190" class="form-control input-md" required="">
						</div>
					</div>
					
					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="Weight">Вес</label>
						<div class="col-md-4">
							<input id="Weight" name="user_weight" type="text"
								placeholder="80" class="form-control input-md" required="">
						</div>
					</div>
					
					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="TypeOfBlood">Группа крови</label>
						<div class="col-md-4">
							<input id="TypeOfBlood" name="user_type_of_blood" type="text"
								placeholder="A/A+/B/B+" class="form-control input-md" required="">
						</div>
					</div>
					
					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="SkinDisease">Кожные заболевания</label>
						<div class="col-md-4">
							<input id="SkinDisease" name="user_skin_disease" type="text"
								placeholder="Дa/Нет" class="form-control input-md" required="">
						</div>
					</div>

					<!-- Button -->
					<div class="form-group">
						<label class="col-md-4 control-label" for="singlebutton"></label>
						<div class="col-md-4">
							<button id="singlebutton" name="singlebutton"
								class="btn btn-outline-primary">Зарегистрироваться</button>
						</div>
					</div>

				</fieldset>
			</form>

		<c:if test="${msg!=null}">
			<div class="alert alert-danger" role="alert">
				<c:out value="${msg}"></c:out>
			</div>
		</c:if>
		</div>
	</div>
<%@ include file="/WEB-INF/include/end-html.jsp"%>