package fr.insa.soa.consumer;

import fr.insa.soa.model.bean.Account;
import fr.insa.soa.model.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(AccountRepository repository) {

		return args -> {
			log.info("Preloading " + repository.save(new Account("username1", "password")));
			log.info("Preloading " + repository.save(new Account("username2", "password")));
		};
	}
}
