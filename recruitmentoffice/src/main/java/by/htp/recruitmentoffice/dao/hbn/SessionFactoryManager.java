package by.htp.recruitmentoffice.dao.hbn;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import by.htp.recruitmentoffice.domain.Call;
import by.htp.recruitmentoffice.domain.Doctor;
import by.htp.recruitmentoffice.domain.PrivatePortfolio;
import by.htp.recruitmentoffice.domain.Role;
import by.htp.recruitmentoffice.domain.Schedule;
import by.htp.recruitmentoffice.domain.User;

public final class SessionFactoryManager {

	private static SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {

		Configuration configuration = new Configuration();
		//configuration.configure("config/hibernate.cfg.xml");
		configuration.addAnnotatedClass(Call.class);
		configuration.addAnnotatedClass(Doctor.class);
		configuration.addAnnotatedClass(Role.class);
		configuration.addAnnotatedClass(User.class);
		configuration.addAnnotatedClass(PrivatePortfolio.class);
		configuration.addAnnotatedClass(Schedule.class);
		
		configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		configuration.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		configuration.setProperty("hibernate.connection.url",
			"jdbc:mysql://localhost:3306/recruitmentoffice?serverTimezone=UTC");
		configuration.setProperty("hibernate.connection.username", "root");
		configuration.setProperty("hibernate.connection.password", "root");
		configuration.setProperty("hibernate.show_sql", "true");
		configuration.setProperty("hibernate.enable_lazy_load_no_trans", "true");
		configuration.setProperty("current_session_context_class", "thread");
		configuration.setProperty("hibernate.jdbc.serverTimezone", "UTC");

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		return configuration.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}

}
