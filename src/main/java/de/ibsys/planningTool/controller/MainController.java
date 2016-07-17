package de.ibsys.planningTool.controller;

import de.ibsys.planningTool.controller.tab.ExportController;
import de.ibsys.planningTool.controller.tab.ForeCastController;
import de.ibsys.planningTool.controller.tab.XmlInputController;
import de.ibsys.planningTool.model.XmlInput;
import javafx.fxml.FXML;

/**
 * Created by minhnguyen on 17.07.16.
 */
public class MainController {

    private XmlInput xmlInput;

    @FXML
    private ForeCastController foreCastController;

    @FXML
    private XmlInputController xmlInputController;

    @FXML
    private ExportController exportController;

    @FXML
    public void initialize() {
        System.out.println("Start Application");
        foreCastController.init(this);
        xmlInputController.init(this);
        exportController.init(this);
        xmlInput = new XmlInput();
    }

    public XmlInput getXmlInput() {
        return xmlInput;
    }

    public void setXmlInput(XmlInput xmlInput) {
        this.xmlInput = xmlInput;
    }
}
