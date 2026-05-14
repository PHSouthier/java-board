package br.com.phsouthier.persistence.config;

import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public final class ConnectionConfig {

    public static Connection getConnection() throws SQLException {
        var url = System.getenv().getOrDefault("DATABASE_URL", "jdbc:postgresql://localhost:5433/board");
        var user = System.getenv().getOrDefault("DATABASE_USERNAME", "board");
        var password = System.getenv().getOrDefault("DATABASE_PASSWORD", "board");
        var connection = DriverManager.getConnection(url, user, password);
        connection.setAutoCommit(false);
        return connection;
    }

}