package sst.santons.view;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sst.santons.data.DataModel;
import sst.santons.data.Manufacturer;
import sst.santons.data.model.ModelInterface;
import sst.santons.model.ManufacturerModel;
import sst.santons.model.SantonModel;

public class SantonEditDialogController {
    @FXML
    private Label reference;
    @FXML
    private Label manufacturerReference;
    @FXML
    private TextField name;
    @FXML
    private TextField walloonName;
    @FXML
    private TextField description;
    @FXML
    private TextField surname;
    @FXML
    private ComboBox<ManufacturerModel> manfacturer;
    @FXML
    private DatePicker acquisitionDate;
    @FXML
    private TextField link;

    private SantonModel model = null;
    private Stage dialogStage = null;

    @FXML
    private void initialize() {
	ObservableList<ManufacturerModel> list = FXCollections.observableArrayList();
	manfacturer.setItems(list);

	for (Manufacturer santonnier : DataModel.me().getManufacturers()) {
	    list.add(ModelInterface.model(santonnier));
	}
    }

    public SantonModel getModel() {
	return model;
    }

    public void setModel(SantonModel model) {
	this.model = model;

	reference.setText("" + model.getId());
	manufacturerReference.setText(model.getIdManufacturer());
	name.setText(model.getName());
	walloonName.setText(model.getWalloonName());
	description.setText(model.getDescription());
	surname.setText(model.getSurname());
	manfacturer.getSelectionModel().select(model.getManufacturer());
	acquisitionDate.setValue(model.getAcquisitionDate());
    }

    @FXML
    public void ok() {

	model.setName(new SimpleStringProperty(name.getText()));
	model.setWalloonName(new SimpleStringProperty(walloonName.getText()));
	model.setDescription(new SimpleStringProperty(description.getText()));
	model.setSurname(new SimpleStringProperty(surname.getText()));
	model.setAcquisitionDate(new SimpleObjectProperty<>(acquisitionDate.getValue()));

	dialogStage.close();
    }

    @FXML
    public void cancel() {
	dialogStage.close();
    }

    public void setDialogStage(Stage dialogStage) {
	this.dialogStage = dialogStage;
    }
}
