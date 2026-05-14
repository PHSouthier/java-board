package br.com.phsouthier;

import br.com.phsouthier.persistence.migration.MigrationStrategy;

import java.sql.SQLException;

import static br.com.phsouthier.persistence.config.ConnectionConfig.getConnection;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
    }

}