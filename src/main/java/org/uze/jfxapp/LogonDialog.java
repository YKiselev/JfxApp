package org.uze.jfxapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.uze.jfx.ModalDialog;
import org.uze.jfx.ModalResult;

/**
 * Created by Uze on 19.01.14.
 */
public class LogonDialog extends ModalDialog {

    public static final String FXML_NAME = "logon";

    @FXML
    private TextField userNameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button okBtn;
    @FXML
    private Button cancelBtn;

    public String getUserName() {
        return userNameField.getText();
    }

    public String getPassword() {
        return passwordField.getText();
    }

    public void setUserName(String value) {
        userNameField.setText(value);
    }

    public void setPassword(String value) {
        passwordField.setText(value);
    }

    @FXML
    public void initialize() {
    }

    @FXML
    private void okBtnAction() {
        setModalResult(ModalResult.OK);
    }

    @FXML
    private void cancelBtnAction() {
        setModalResult(ModalResult.CANCEL);
    }
}
