import java.util.HashMap;
import java.util.Map;

import dao.Sql2oUserDao;
import dao.UserDao;
import models.user;
import org.sql2o.Sql2o;
import spark.ModelAndView;

import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.*;




public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");
        staticFileLocation("/public");
        String connectionString = "jdbc:h2:~/amberforest.db;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        Sql2oUserDao sql2oUserDao = new Sql2oUserDao(sql2o);

        get("/", (request, response) -> {

            return new ModelAndView(new HashMap(), "index.hbs");

        }, new HandlebarsTemplateEngine());

        post("/create", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            Integer userId = Integer.parseInt(request.params("id"));
            String name = request.params("name");
            String email = request.params("email");
            String password = request.params("password");
            String confirm = request.params("confirm");
            String account = request.params("account");
            String broker = request.params("broker");
            String country = request.params("country");
            Integer login = Integer.parseInt(request.params("login"));
            String tradePassword = request.params("tradepassword");

            user newUser = new user(userId, name, email, password, confirm, country,  account, broker, login, tradePassword);
            UserDao userDao = null;
            userDao.add(newUser);
            response.redirect("/");

            return null;
        }, new HandlebarsTemplateEngine());

        get("/create", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "index.hbs");
        });
    }

}
