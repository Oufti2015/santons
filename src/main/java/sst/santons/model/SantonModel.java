package sst.santons.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SantonModel {

    private IntegerProperty id;
    private StringProperty idManufacturer;
    private StringProperty name;
    private StringProperty surname;
    private ObjectProperty<ManufacturerModel> manufacturer;
    private ObjectProperty<LocalDate> acquisitionDate;
    private StringProperty picture;
    private StringProperty manufacturerLink;

    public SantonModel(Integer id, String idManufacturer, String name, String surname, ManufacturerModel manufacturer, LocalDate acquisitionDate, String picture,
	    String manufacturerLink) {
	super();
	this.id = new SimpleIntegerProperty(id);
	this.idManufacturer = new SimpleStringProperty(idManufacturer);
	this.name = new SimpleStringProperty(name);
	this.surname = new SimpleStringProperty(surname);
	this.manufacturer = new SimpleObjectProperty<>(manufacturer);
	this.acquisitionDate = new SimpleObjectProperty<>(acquisitionDate);
	this.picture = new SimpleStringProperty(picture);
	this.manufacturerLink = new SimpleStringProperty(manufacturerLink);
    }

    public IntegerProperty id() {
	return id;
    }

    public StringProperty idManufacturer() {
	return idManufacturer;
    }

    public StringProperty name() {
	return name;
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

    public Integer getId() {
	return id.get();
    }

    public String getIdManufacturer() {
	return idManufacturer.get();
    }

    public String getName() {
	return name.get();
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

    public void setId(IntegerProperty id) {
	this.id = id;
    }

    public void setIdManufacturer(StringProperty idManufacturer) {
	this.idManufacturer = idManufacturer;
    }

    public void setName(StringProperty name) {
	this.name = name;
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
