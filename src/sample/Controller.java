package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {
    Perro perro = new Perro();

    String nombre = "";

    @FXML
    private Label idlabelEdad;
    @FXML
    private Label idlabelNombre;


    @FXML
    public void onEdadClicked(MouseEvent event) {
        idlabelEdad.setText(perro.edad.toString());
    }

    @FXML
    public void onNombreClicked() {
        nombre += perro.nombre;
        idlabelNombre.setText(nombre);
    }
}
