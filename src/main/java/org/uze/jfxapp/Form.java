package org.uze.jfxapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Uze on 21.01.14.
 */
public class Form {

    public static final String KEY_TITLE = "title";

    private Stage stage;

    public Stage getStage() {
        return stage;
    }

    protected void setStage(Stage stage) {
        this.stage = stage;
    }

    public static <F extends Form> F load(String name, Locale locale, Stage stage) {
        FXMLLoader loader;
        Parent parent;
        ResourceBundle resources;
        F result;
        try {
            loader = FxmlUtils.createLoader(name, locale);
            parent = (Parent) loader.load();
            resources = loader.getResources();
            result = loader.getController();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        if (stage == null) {
            stage = new Stage(StageStyle.DECORATED);
        }
        result.setStage(stage);

        if (stage.getScene() == null) {
            stage.setScene(new Scene(parent));
        }

        if (resources != null) {
            stage.setTitle(resources.getString(KEY_TITLE));
        }

        return result;
    }
}
