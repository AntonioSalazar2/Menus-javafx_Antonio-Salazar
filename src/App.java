import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {

        MenuBar menuBar = new MenuBar();
        Menu menuArchivo = new Menu("Archivo");
        Menu menuEditar = new Menu("Editar");
        Menu menuAyuda = new Menu("Ayuda");

        MenuItem nuevo = new MenuItem("Nuevo");
        MenuItem abrir = new MenuItem("Abrir");
        MenuItem guardar = new MenuItem("Guardar");
        MenuItem guardarcomo = new MenuItem("Guardar como");
        MenuItem imprimir = new MenuItem("Imprimir");
        MenuItem salir = new MenuItem("Salir");

        MenuItem cortar = new MenuItem("Cortar");
        MenuItem copiar = new MenuItem("Copiar");
        MenuItem pegar = new MenuItem("Pegar");
        MenuItem opciones = new MenuItem("Opciones");

        MenuItem info = new MenuItem("Información");
        MenuItem soporte = new MenuItem("Soporte técnico");


        menuArchivo.getItems().addAll(nuevo, abrir, guardar, guardarcomo, imprimir, new SeparatorMenuItem(), salir);

        menuEditar.getItems().addAll(cortar, copiar, pegar, new SeparatorMenuItem(), opciones);

        menuAyuda.getItems().addAll(info, soporte);

        nuevo.setOnAction(e -> System.out.println("Se crea un nuevo archivo"));
        abrir.setOnAction(e -> System.out.println("Se abre un archivo del explorador de archivos"));
        guardar.setOnAction(e -> System.out.println("Se guarda los cambios del archivo actual"));
        guardarcomo.setOnAction(e -> System.out.println("se guarda el archivo en otro lugar del sistema"));
        imprimir.setOnAction(e -> System.out.println("Se imprime el archivo"));
        salir.setOnAction(e -> primaryStage.close());

        cortar.setOnAction(e -> System.out.println("Cortar la selección"));
        copiar.setOnAction(e -> System.out.println("Copiar la selección"));
        pegar.setOnAction(e -> System.out.println("Pegar la selección copiada recientemente"));
        opciones.setOnAction(e -> System.out.println("Consultar más opciones de edición"));

        info.setOnAction(e -> System.out.println("Infomación de ayuda al usuario"));
        soporte.setOnAction(e -> System.out.println("Redireccionado a soporte técnico"));

        menuBar.getMenus().addAll(menuArchivo, menuEditar, menuAyuda);

        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Sistema de menús_Antonio Salazar");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}