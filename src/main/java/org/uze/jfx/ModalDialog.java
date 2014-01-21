package org.uze.jfx;

import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.Locale;

/**
 * Created by Uze on 19.01.14.
 */
public class ModalDialog extends Form {

    public static final String KEY_TITLE = "title";

    protected ModalResult modalResult;

    public ModalResult getModalResult() {
        return modalResult;
    }

    protected void setModalResult(ModalResult modalResult) {
        this.modalResult = modalResult;
        getStage().close();
    }

    public ModalResult showAndWait() {
        getStage().showAndWait();
        return modalResult;
    }

    public static <T extends ModalDialog> T loadModalDialog(String name, Locale locale, Window owner) {
        T result = load(name, locale, null);

        final Stage stage = result.getStage();

        stage.sizeToScene();
        stage.setResizable(false);

        if (owner != null && owner.isShowing()) {
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(owner);
        } else {
            stage.initModality(Modality.APPLICATION_MODAL);
        }

        return result;
    }
}
