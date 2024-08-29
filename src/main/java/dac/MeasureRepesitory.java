package dac;

import model.Measure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MeasureRepesitory {
    public final Connection connection;

    public MeasureRepesitory() throws SQLException {
        connection = new Db().getConnection();

    }

    public void createTable() throws SQLException {
        String str =
                """
            
            create table if not exists measure(
            id serial primary key,
            name varchar,
            age int
            ownCity varchar
            );
            """;
            Statement statement1 = connection.createStatement();
            statement1.execute(str);
            System.out.println("Хочу спать!!спать😩");
            statement1.close();

            Statement statement2 = connection.createStatement();
            statement2.execute(str);
            System.out.println("Adilet");
            statement2.close();

            Statement statement3 = connection.createStatement();
            statement3.execute(str);
            System.out.println("Свет");
            statement3.close();

        }

        public String saveCountr1(Measure measure) throws SQLException {
            PreparedStatement statement = connection.prepareStatement("insert into measures(name, age, ownCity   ) values(?,?,?);");
            statement.setString(1, measure.getName());
            statement.setInt(2, measure.getAge());
            statement.setString(3, measure.getOwnCity());
            System.out.println("hhhhhhh");
            statement.close();
            return "uhukukuhk";

            public String saveCountr2(Measure measure) throws SQLException {
                PreparedStatement statement = connection.prepareStatement("insert into measures(name, age, ownCity   ) values(?,?,?);");
                statement.setString(1, measure.getName());
                statement.setInt(2, measure.getAge());
                statement.setString(3, measure.getOwnCity());
                System.out.println("jlllllllllllll");
                statement.close();
                return "uhukukuhk";

                public String saveCountr(Measure measure) throws SQLException {
                    PreparedStatement statement = connection.prepareStatement("insert into measures(name, age, ownCity   ) values(?,?,?);");
                    statement.setString(1, measure.getName());
                    statement.setInt(2, measure.getAge());
                    statement.setString(3, measure.getOwnCity());
                    System.out.println("jlllllllllllll");
                    statement.close();
                    return "uhukukuhk";

                }
            }


        }

    }


