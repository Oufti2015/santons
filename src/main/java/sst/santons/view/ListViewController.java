package sst.santons.view;

import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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

    private ObservableList<SantonModel> santonsData = FXCollections.observableArrayList();

    public ListViewController() {
	ManufacturerModel noirhomme = new ManufacturerModel("Robert Noirhomme");
	santonsData.add(new SantonModel(1, "002", "Tchantchès", null, noirhomme, LocalDate.now(), null, null));
	santonsData.add(new SantonModel(2, "003", "Le boulanger", null, noirhomme, LocalDate.now(), null, null));
	santonsData.add(new SantonModel(3, "004", "La femme au châle", null, noirhomme, LocalDate.now(), null, null));
	santonsData.add(new SantonModel(4, "006", " Le petit meunier", null, noirhomme, LocalDate.now(), null, null));
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

	mySantonsTable.setItems(santonsData);
	missingSantonsTable.setItems(santonsData);
    }
}
