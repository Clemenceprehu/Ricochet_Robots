module com.example.ricochet_robots {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ricochet_robots to javafx.fxml;
    exports com.example.ricochet_robots;
}