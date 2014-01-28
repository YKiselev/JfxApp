package org.uze.jfxapp;

import com.tangosol.coherence.component.manageable.modelAdapter.ManagementMBean;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ToolBar;
import org.uze.jfx.Form;

import javax.management.MBeanServerConnection;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.net.MalformedURLException;

/**
 * Created by Uze on 21.01.14.
 */
public class MainForm extends Form {

    public static final String FXML_NAME = "main";

    @FXML
    private MenuBar menuBar;
    @FXML
    private ToolBar toolBar;

    @FXML
    public void initialize() {
        populateMBean();
    }

    @FXML
    private void populateMBean() {
//        try {
//            JMXServiceURL serviceURL = new JMXServiceURL("service:jmx:rmi://silent:3000/jndi/rmi://silent:9000/jmxrmi");
//            JMXConnector connector = JMXConnectorFactory.connect(serviceURL);
//            MBeanServerConnection remote = connector.getMBeanServerConnection();
//            ObjectName objectName = new ObjectName("Coherence:type=Management");
//            Object d = remote.getDomains();
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (MalformedObjectNameException e) {
//            e.printStackTrace();
//        }
    }
}
