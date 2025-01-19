import io.javalin.Javalin;

import java.util.HashMap;
import java.util.Map;

public class HelloJavalin {
    public String message = "Test";
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public"); // Serve files from 'resources/public'
        }).start(7001);
        //app.get("/", ctx -> ctx.result("Welcome to FRIDGE!"));
        app.get("/", ctx -> ctx.redirect("/index.html"));
    }
}
