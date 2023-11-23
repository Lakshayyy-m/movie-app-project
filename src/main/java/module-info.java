module client.movieapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires java.net.http;
    requires com.google.gson;
    requires javafx.web;
    requires java.desktop;


    exports client.movieapp.movieshowdata;
    opens client.movieapp.movieshowdata to com.google.gson, javafx.fxml, javafx.web;
    exports client.movieapp;
    opens client.movieapp to com.google.gson, javafx.fxml, javafx.web;

}