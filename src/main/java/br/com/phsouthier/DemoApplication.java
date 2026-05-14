package br.com.phsouthier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.phsouthier.persistence.migration.MigrationStrategy;

import static br.com.phsouthier.persistence.config.ConnectionConfig.getConnection;

import java.sql.SQLException;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)  throws SQLException {
		try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
		SpringApplication.run(DemoApplication.class, args);
	}

}
