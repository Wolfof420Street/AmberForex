package dao;

import models.user;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oUserDao implements UserDao {

    private final Sql2o sql2o;

    public Sql2oUserDao(Sql2o sql2o){
        this.sql2o = sql2o; //making the sql2o object available everywhere so we can call methods in it
    }




    @Override
    public List<user> getAll() {
        return null;
    }

    @Override
    public void add(user newUser) {
        String sql = "INSERT INTO users (userName, email, password, confirm, account, country, broker, login, tradepassword) VALUES (:name, :email, :password, :confirm, :account, :country, :broker, :login, :tradepassword)";
        try(Connection con = sql2o.open()){
            int id = (int) con.createQuery(sql, true)
                    .bind(newUser)
                    .executeUpdate()
                    .getKey();
            newUser.setUserId(id);
        }
        catch (Sql2oException ex) {
            System.out.println(ex); //oops we have an error!
        }

    }

    @Override
    public user findById(int id) {
        return null;
    }

    @Override
    public void update(int id, String content) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAllTasks() {

    }
}
