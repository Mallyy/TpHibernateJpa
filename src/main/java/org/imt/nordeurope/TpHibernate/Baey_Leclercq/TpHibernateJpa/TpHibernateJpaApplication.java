package org.imt.nordeurope.TpHibernate.Baey_Leclercq.TpHibernateJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("org.imt.nordeurope.TpHibernate.Baey_Leclercq.TpHibernateJpa")
public class TpHibernateJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpHibernateJpaApplication.class, args);
	}

}
