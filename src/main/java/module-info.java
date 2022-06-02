module com.example.ricochet_robots {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.testng;
    requires org.junit.jupiter.api;


    opens com.example.ricochet_robots to javafx.fxml;
    exports com.example.ricochet_robots;
}