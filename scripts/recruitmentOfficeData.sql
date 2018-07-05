-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.7.19-log - MySQL Community Server (GPL)
-- Операционная система:         Win64
-- HeidiSQL Версия:              9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Дамп данных таблицы recruitmentoffice.call: ~0 rows (приблизительно)
DELETE FROM `call`;
/*!40000 ALTER TABLE `call` DISABLE KEYS */;
INSERT INTO `call` (`id`, `year`, `company`) VALUES
	(1, 2018, 'Priziv.net');
/*!40000 ALTER TABLE `call` ENABLE KEYS */;

-- Дамп данных таблицы recruitmentoffice.doctors: ~5 rows (приблизительно)
DELETE FROM `doctors`;
/*!40000 ALTER TABLE `doctors` DISABLE KEYS */;
INSERT INTO `doctors` (`id`, `name`, `surname`, `spec`, `receiptTime`) VALUES
	(1, 'Валерий', 'Утюжин', 'Хирург 2-ой степени', '09:00 - 17:00'),
	(2, 'Пётр', 'Сковородов', 'Главный', '13:00 - 16:00'),
	(3, 'Александр', 'Лечилов', 'Терапевт', '08:30 - 13:00'),
	(5, 'Дмитрий', 'Помогалов', 'Отоларинголог', '10:00 - 14:00'),
	(6, 'Алексей', 'Летунский', 'Гастронтолог', '12:00 - 14:00');
/*!40000 ALTER TABLE `doctors` ENABLE KEYS */;

-- Дамп данных таблицы recruitmentoffice.private_portfolio: ~2 rows (приблизительно)
DELETE FROM `private_portfolio`;
/*!40000 ALTER TABLE `private_portfolio` DISABLE KEYS */;
INSERT INTO `private_portfolio` (`id`, `call_id`, `user_id`) VALUES
	(1, 1, 1),
	(2, 1, 2);
/*!40000 ALTER TABLE `private_portfolio` ENABLE KEYS */;

-- Дамп данных таблицы recruitmentoffice.roles: ~2 rows (приблизительно)
DELETE FROM `roles`;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` (`id`, `role`) VALUES
	(0, 'admin'),
	(1, 'user');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;

-- Дамп данных таблицы recruitmentoffice.schedule: ~9 rows (приблизительно)
DELETE FROM `schedule`;
/*!40000 ALTER TABLE `schedule` DISABLE KEYS */;
INSERT INTO `schedule` (`id`, `date`, `time_slot`, `user_id`, `doctors_id`) VALUES
	(1, '2018-07-04', '10:00:00', NULL, 1),
	(2, '2018-07-04', '10:30:00', NULL, 1),
	(3, '2018-07-04', '11:00:00', NULL, 1),
	(4, '2018-07-04', '12:00:00', NULL, 1),
	(5, '2018-07-05', '14:00:00', NULL, 2),
	(6, '2018-07-05', '14:30:00', NULL, 2),
	(7, '2018-07-05', '09:00:00', 2, 3),
	(8, '2018-07-05', '10:00:00', 2, 3);
/*!40000 ALTER TABLE `schedule` ENABLE KEYS */;

-- Дамп данных таблицы recruitmentoffice.users: ~3 rows (приблизительно)
DELETE FROM `users`;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `login`, `password`, `name`, `surname`, `age`, `registration`, `height`, `weight`, `type_of_blood`, `skin_disease`, `roles_id`) VALUES
	(1, 'Dru', '123', 'Андрей', 'Служивцев', '24', 'г.Минск, ул.Виноградова', '190', '86', 'A+', 'Нет', 1),
	(2, 'M1', '321', 'Михаил', 'Третьяков', '19', 'г.Минск, ул. Третьякова', '170', '62', 'B', 'Нет', 1),
	(3, 'Admin', 'Admin', 'Admin', 'Admin', '1', 'Admin', '1', '1', '1', '1', 0),
	(4, 'Empty', 'Empty', 'Бот', 'Пустой', '1', 'Пусто', '1', '1', '1', '1', 1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
