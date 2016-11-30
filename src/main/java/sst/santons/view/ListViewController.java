package sst.santons.view;

import java.io.IOException;
import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sst.santons.Santons;
import sst.santons.data.DataModel;
import sst.santons.data.Santon;
import sst.santons.data.file.DataModelFileInterface;
import sst.santons.data.model.ModelInterface;
import sst.santons.model.ManufacturerModel;
import sst.santons.model.SantonModel;

public class ListViewController {
    @FXML
    private TableView<SantonModel> mySantonsTable;
    @FXML
    private TableColumn<SantonModel, Number> idColumn;
    @FXML
    private TableColumn<SantonModel, String> idManufacturerColumn;
    @FXML
    private TableColumn<SantonModel, String> nameColumn;
    @FXML
    private TableColumn<SantonModel, ManufacturerModel> manufacturerColumn;
    @FXML
    private TableColumn<SantonModel, LocalDate> dateColumn;
    @FXML
    private TableView<SantonModel> missingSantonsTable;
    @FXML
    private TableColumn<SantonModel, String> idManufacturerMissingColumn;
    @FXML
    private TableColumn<SantonModel, String> nameMissingColumn;
    @FXML
    private TableColumn<SantonModel, ManufacturerModel> manufacturerMissingColumn;

    private ObservableList<SantonModel> mySantonsData = FXCollections.observableArrayList();
    private ObservableList<SantonModel> missingSantonsData = FXCollections.observableArrayList();
    private Santons owner = null;

    public ListViewController() {
	try {
	    DataModelFileInterface.fromFile("data/santons.json");
	    for (Santon santon : DataModel.me().getSantons()) {
		SantonModel model = ModelInterface.model(santon);
		if (null == santon.getId()) {
		    missingSantonsData.add(model);
		} else {
		    mySantonsData.add(model);
		}
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	    System.exit(-1);
	}
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
	// Initialize the person table with the two columns.
	idColumn.setCellValueFactory(cellData -> cellData.getValue().id());
	idManufacturerColumn.setCellValueFactory(cellData -> cellData.getValue().idManufacturer());
	nameColumn.setCellValueFactory(cellData -> cellData.getValue().name());
	manufacturerColumn.setCellValueFactory(cellData -> cellData.getValue().manufacturer());
	dateColumn.setCellValueFactory(cellData -> cellData.getValue().acquisitionDate());
	idManufacturerMissingColumn.setCellValueFactory(cellData -> cellData.getValue().idManufacturer());
	nameMissingColumn.setCellValueFactory(cellData -> cellData.getValue().name());
	manufacturerMissingColumn.setCellValueFactory(cellData -> cellData.getValue().manufacturer());

	mySantonsTable.setItems(mySantonsData);
	missingSantonsTable.setItems(missingSantonsData);
    }

    @FXML
    public void update() {
	System.out.println("Update...");
	SantonModel model = mySantonsTable.getSelectionModel().getSelectedItem();
	if (null != model) {
	    try {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ListViewController.class.getResource("SantonEditDialog.fxml"));
		AnchorPane page = (AnchorPane) loader.load();
		System.out.println("page = " + page);

		// Create the dialog stage
		Stage dialogStage = new Stage();
		dialogStage.setTitle("Modifier un santon");
		dialogStage.initModality(Modality.WINDOW_MODAL);
		dialogStage.initOwner(getOwner().getPrimaryStage());
		Scene scene = new Scene(page);
		dialogStage.setScene(scene);

		// Set the correpsonding controller
		SantonEditDialogController controller = loader.getController();
		controller.setModel(model);
		controller.setDialogStage(dialogStage);

		// getOwner().getRootLayout().setCenter(page);

		dialogStage.showAndWait();
	    } catch (IOException e) {
		e.printStackTrace();
		System.exit(-1);
	    }

	}
    }

    public Santons getOwner() {
	return owner;
    }

    public void setOwner(Santons owner) {
	this.owner = owner;
    }
}
