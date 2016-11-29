package sst.santons.view;

import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sst.santons.cutover.SantonsCutover;
import sst.santons.data.Manufacturer;
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
    private TableColumn<SantonModel, String> waloonNameColumn;
    @FXML
    private TableColumn<SantonModel, Manufacturer> manufacturerColumn;
    @FXML
    private TableColumn<SantonModel, LocalDate> dateColumn;

    @FXML
    private TableView<SantonModel> missingSantonsTable;
    @FXML
    private TableColumn<SantonModel, String> idManufacturerMissingColumn;
    @FXML
    private TableColumn<SantonModel, String> nameMissingColumn;
    @FXML
    private TableColumn<SantonModel, Manufacturer> manufacturerMissingColumn;

    private ObservableList<SantonModel> santonsData = FXCollections.observableArrayList();

    public ListViewController() {
	SantonsCutover cutover = new SantonsCutover();
	cutover.getSantons()
		.stream()
		.map(s -> new SantonModel(s))
		.forEach(sm -> santonsData.add(sm));
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
	// Initialize the person table with the two columns.
	idColumn.setCellValueFactory(new PropertyValueFactory<SantonModel, Number>("id"));
	idManufacturerColumn.setCellValueFactory(new PropertyValueFactory<SantonModel, String>("idManufacturer"));
	nameColumn.setCellValueFactory(new PropertyValueFactory<SantonModel, String>("name"));
	waloonNameColumn.setCellValueFactory(new PropertyValueFactory<SantonModel, String>("walloonname"));
	dateColumn.setCellValueFactory(new PropertyValueFactory<SantonModel, LocalDate>("acquisitionDate"));
	manufacturerColumn.setCellValueFactory(new PropertyValueFactory<SantonModel, Manufacturer>("manufacturer"));

	idManufacturerMissingColumn.setCellValueFactory(cellData -> cellData.getValue().idManufacturer());
	nameMissingColumn.setCellValueFactory(cellData -> cellData.getValue().name());
	manufacturerMissingColumn.setCellValueFactory(cellData -> cellData.getValue().manufacturer());

	mySantonsTable.setItems(santonsData);
	missingSantonsTable.setItems(santonsData);
    }
}
