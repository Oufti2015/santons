package sst.santons.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import sst.santons.data.Manufacturer;
import sst.santons.data.Santon;

public class SantonModel {

    private IntegerProperty id;
    private StringProperty idManufacturer;
    private StringProperty name;
    private StringProperty surname;
    private StringProperty walloonname;
    private ObjectProperty<Manufacturer> manufacturer;
    private ObjectProperty<LocalDate> acquisitionDate;
    private StringProperty picture;
    private StringProperty manufacturerLink;

    public SantonModel(Santon santon) {
	super();
	if (santon.getId() != null) {
	    this.id = new SimpleIntegerProperty(santon.getId());
	} else {
	    this.id = new SimpleIntegerProperty(-1);
	}
	this.idManufacturer = new SimpleStringProperty(santon.getIdManufacturer());
	this.name = new SimpleStringProperty(santon.getName());
	this.surname = new SimpleStringProperty(santon.getSurname());
	this.walloonname = new SimpleStringProperty(santon.getWalloonName());
	this.manufacturer = new SimpleObjectProperty<>(santon.getManufacturer());
	this.acquisitionDate = new SimpleObjectProperty<>(santon.getAcquisitionDate());
	this.picture = new SimpleStringProperty(santon.getPicture());
	this.manufacturerLink = new SimpleStringProperty(santon.getManufacturerLink());
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

    public StringProperty walloonname() {
	return walloonname;
    }

    public ObjectProperty<Manufacturer> manufacturer() {
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

    public String getWalloonname() {
	return walloonname.get();
    }

    public Manufacturer getManufacturer() {
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

    public void setManufacturer(ObjectProperty<Manufacturer> manufacturer) {
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
