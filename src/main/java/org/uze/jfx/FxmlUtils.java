package org.uze.jfx;

import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Uze on 19.01.14.
 */
public final class FxmlUtils {

    @SuppressWarnings("unchecked")
    public static FXMLLoader createLoader(String name, Locale locale) throws IOException {
        final String fxmlName = "/fxml/" + name + ".fxml";
        final URL fxmlUrl = FxmlUtils.class.getResource(fxmlName);
        if (fxmlUrl == null) {
            throw new RuntimeException("Resource not found: " + fxmlName);
        }
        ResourceBundle resourceBundle = null;
        if (locale != null) {
            final String bundleName = "bundles." + name;
            resourceBundle = ResourceBundle.getBundle(bundleName, locale);
        }
        if (resourceBundle != null) {
            return new FXMLLoader(fxmlUrl, resourceBundle);
        } else {
            return new FXMLLoader(fxmlUrl);
        }
    }
}
