package sst.santons.model;

import java.time.LocalDate;

import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SantonModel {

    private LongProperty id;
    private StringProperty idManufacturer;
    private StringProperty name;
    private StringProperty walloonName;
    private StringProperty description;
    private StringProperty surname;
    private ObjectProperty<ManufacturerModel> manufacturer;
    private ObjectProperty<LocalDate> acquisitionDate;
    private StringProperty picture;
    private StringProperty manufacturerLink;

    public SantonModel(Long id, String idManufacturer, String name, String walloonName, String description,
	    String surname, ManufacturerModel manufacturer, LocalDate acquisitionDate, String picture,
	    String manufacturerLink) {
	super();
	this.id = new SimpleLongProperty((null == id) ? -1 : id);
	this.idManufacturer = new SimpleStringProperty(idManufacturer);
	this.name = new SimpleStringProperty(name);
	this.walloonName = new SimpleStringProperty(walloonName);
	this.description = new SimpleStringProperty(description);
	this.surname = new SimpleStringProperty(surname);
	this.manufacturer = new SimpleObjectProperty<>(manufacturer);
	this.acquisitionDate = new SimpleObjectProperty<>(acquisitionDate);
	this.picture = new SimpleStringProperty(picture);
	this.manufacturerLink = new SimpleStringProperty(manufacturerLink);
    }

    public LongProperty id() {
	return id;
    }

    public StringProperty idManufacturer() {
	return idManufacturer;
    }

    public StringProperty name() {
	return name;
    }

    public StringProperty walloonName() {
	return walloonName;
    }

    public StringProperty description() {
	return description;
    }

    public StringProperty surname() {
	return surname;
    }

    public ObjectProperty<ManufacturerModel> manufacturer() {
	return manufacturer;
    }

    public ObjectProperty<LocalDate> acquisitionDate() {
	return acquisitionDate;
    }

    public StringProperty picture() {
	return picture;
    }

    public StringProperty manufacturerLink() {
	return manufacturerLink;
    }

    public Long getId() {
	return id.get();
    }

    public String getIdManufacturer() {
	return idManufacturer.get();
    }

    public String getName() {
	return name.get();
    }

    public String getWalloonName() {
	return walloonName.get();
    }

    public String getDescription() {
	return description.get();
    }

    public String getSurname() {
	return surname.get();
    }

    public ManufacturerModel getManufacturer() {
	return manufacturer.get();
    }

    public LocalDate getAcquisitionDate() {
	return acquisitionDate.get();
    }

    public String getPicture() {
	return picture.get();
    }

    public String getManufacturerLink() {
	return manufacturerLink.get();
    }

    public void setId(LongProperty id) {
	this.id = id;
    }

    public void setIdManufacturer(StringProperty idManufacturer) {
	this.idManufacturer = idManufacturer;
    }

    public void setName(StringProperty name) {
	this.name = name;
    }

    public void setWalloonName(StringProperty walloonName) {
	this.walloonName = walloonName;
    }

    public void setDescription(StringProperty description) {
	this.description = description;
    }

    public void setSurname(StringProperty surname) {
	this.surname = surname;
    }

    public void setManufacturer(ObjectProperty<ManufacturerModel> manufacturer) {
	this.manufacturer = manufacturer;
    }

    public void setAcquisitionDate(ObjectProperty<LocalDate> acquisitionDate) {
	this.acquisitionDate = acquisitionDate;
    }

    public void setPicture(StringProperty picture) {
	this.picture = picture;
    }

    public void setManufacturerLink(StringProperty manufacturerLink) {
	this.manufacturerLink = manufacturerLink;
    }

}
