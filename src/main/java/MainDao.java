import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainDao {
    public static void main(String[] args) {

        UserDao userDao = new UserDao(); //userCreate
        User user = new User();
        user.setUsername("Natalia");
        user.setEmail("natalia.4532@gmail.com");
        user.setPassword("123");
        userDao.create(user);
    }
}
//        User read = userDao.read(1); //userRead
//        System.out.println(read);
//
//        User readNotExist = userDao.read(2);
//        System.out.println(readNotExist);
//
//
//
//        User userToUpdate = userDao.read(1); //userUpdate
//        userToUpdate.setUsername("Natalia Zimmer");
//        userToUpdate.setEmail("natalia.4532@gmail.com");
//        userToUpdate.setPassword("321");
//        userDao.update(userToUpdate);
//
//
//
//        User secondUser = new User(); //findAll
//        secondUser.setUsername("Wiktoria");
//        secondUser.setEmail("wiktoria.4532@gmail.com");
//        secondUser.setPassword("5625");
//        userDao.create(secondUser);
//        User[] all = userDao.findAll();
//        for (User u : all) {
//            System.out.println(u);
//        }
//
//
//
//        userDao.delete(1); //userDelete
//        userDao.delete(2);
//
//    }