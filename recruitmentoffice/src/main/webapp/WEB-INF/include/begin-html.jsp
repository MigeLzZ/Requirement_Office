<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="assets/css/bootstrap.min.css">
</head>
<body>
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
			<a class="navbar-brand" href="main_action">Военный Призыв</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarColor01">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link"
						href="main_action">Оглавление</a></li>
					<c:if test="${user!=null && user.roles_id==0}">
						<li class="nav-item active"><a class="nav-link"
							href="redact_users_action">Редактировать пользователей</a></li>
						<li class="nav-item active"><a class="nav-link"
							href="redact_doctors_action">Редактировать докторов</a></li>	
					</c:if>
					<c:if test="${user!=null && user.roles_id==1}">
						<li class="nav-item active"><a class="nav-link"
							href="appointment_action">Записаться на приём</a></li>
						<li class="nav-item active"><a class="nav-link"
							href="doctors_list_action">Список докторов</a></li>
					</c:if>
				</ul>
				<ul class="navbar-nav navbar-right">
					<c:choose>
						<c:when test="${user==null}">
							<li class="nav-item active"><a class="nav-link"
								href="login_action">Войти в систему</a></li>
							<li class="nav-item active"><a class="nav-link"
								href="signup_action">Зарегистрироваться</a></li>
						</c:when>
						<c:otherwise>
							<li class="nav-item active"><a class="nav-link"
								href="profile_action">Профиль</a></li>
							<li class="nav-item active"><a class="nav-link"
								href="logout_action">Выйти из системы</a></li>
						</c:otherwise>
					</c:choose>

				</ul>
			</div>
		</nav>