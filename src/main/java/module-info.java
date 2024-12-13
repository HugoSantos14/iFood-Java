module model.ifood {
    requires javafx.controls;
    requires javafx.fxml;

    opens ifood to javafx.fxml;
    exports ifood;
}
