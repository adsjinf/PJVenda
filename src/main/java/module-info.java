module br.com.adsistemas.pjvenda {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.adsistemas.pjvenda to javafx.fxml;
    exports br.com.adsistemas.pjvenda;
}