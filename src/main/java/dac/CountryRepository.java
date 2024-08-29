package dac;

import model.Country;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CountryRepository {
    public final Connection connection;

    public CountryRepository() throws SQLException {
        connection = new Db().getConnection();

    }

    public void createTable() throws SQLException {
        String str =
                """

        create table if not exists country(
        id serial primary key,
        tittle varchar,
        population int
        );
        """;
        Statement statement = connection.createStatement();
        statement.execute(str);
        System.out.println("Хочу спать!!спать😩");
        statement.close();

        }

    public String saveCountr(Country country) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("insert into country(tittle, population) values(?.?);");
        statement.setString(1, country.getTitle());
        statement.setInt(2, country.getPopulation());
        System.out.println("jlllllllllllll");
        statement.close();
        return "uhukukuhk";
    }

}
