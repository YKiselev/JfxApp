package org.uze.jfxapp;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Locale;

/**
 * Created by Uze on 19.01.14.
 */
public class JfxApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        if (performUserLogon(stage)) {
            MainForm mainForm = Form.load(MainForm.FXML_NAME, null, stage);

            stage.show();
        }
    }

    private boolean performUserLogon(Stage stage) {
        LogonDialog dlg = LogonDialog.loadModalDialog(LogonDialog.FXML_NAME, Locale.getDefault(), stage);

        dlg.setUserName("test1");
        dlg.setPassword("123456");
        if (dlg.showAndWait() == ModalResult.OK) {
            String userName = dlg.getUserName();
            String password = dlg.getPassword();

            System.out.println("User entered: " + userName + "/" + password);
            return true;
        }

        return false;
    }
}
