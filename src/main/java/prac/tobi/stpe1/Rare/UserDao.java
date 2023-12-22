package prac.tobi.stpe1.Rare;

import java.sql.*;

public class UserDao {


    /**
     *
     * 관심사
     * 1. 커넥션가져오기
     * 2. SQL 문장을 담을 Statement 만들고 실행하기
     * 3. 리소스 반납하기
     *
     * @param user
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void add(User user) throws SQLException, ClassNotFoundException {

        //1차 분리..중복코드로 메소드로 추출한다
        /*
        Class.forName("org.postgresql.Driver");
        String users = "postgres";
        String password = "password";


        Connection c = DriverManager.getConnection(
                "jdbc:postgresql://localhost/toby_spring"
                , users
                , password
        );
        */

        Connection c = getConnection();

        PreparedStatement ps = c.prepareStatement(
                "insert into users(id, name, password) values (?, ?, ?)"
        );
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();

        ps.close();
        c.close();
    }

    public User get(String id) throws SQLException, ClassNotFoundException {


        /*
        Class.forName("org.postgresql.Driver");

        String user = "postgres";
        String password = "password";

        Connection c = DriverManager.getConnection(
                "jdbc:postgresql://localhost/toby_spring"
                , user
                , password
        );
        */


        Connection c = getConnection();


        PreparedStatement ps = c.prepareStatement(
                "select * from users where id = ?"
        );
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        rs.next();

        User users = new User();
        users.setId(rs.getString("id"));
        users.setName(rs.getString("name"));
        users.setPassword(rs.getString("password"));

        rs.close();
        ps.close();
        c.close();

        return users;
    }

    // 커넥션 가져오기 관심사
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        String user = "postgres";
        String password = "password";

        Connection c = DriverManager.getConnection(
                "jdbc:postgresql://localhost/toby_spring"
                , user
                , password
        );
        return c;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao dao = new UserDao();

        User user = new User();
        user.setId("1");
        user.setName("제이크");
        user.setPassword("jakejake");

        dao.add(user);

        System.out.println(user.getId() + " register succeeded");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + " query succeeded");
    }
}
