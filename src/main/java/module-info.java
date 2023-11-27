module com.shay {
    requires transitive javafx.graphics; // Add this part every time in every project with JAVAFX
    requires transitive javafx.base; // Add this part every time in every project with JAVAFX as well
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.shay to javafx.fxml;

    exports com.shay;
}
