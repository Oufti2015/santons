package sst.santons.data;

import java.time.LocalDate;

public class Santon {
    private Long id;
    private String idManufacturer;
    private String name;
    private String walloonName;
    private String description;
    private String surname;
    private Manufacturer manufacturer;
    private LocalDate acquisitionDate;
    private String picture;
    private String manufacturerLink;

    public Santon(Long id, String idManufacturer, String name, String walloonName, String description, String surname,
	    Manufacturer manufacturer, LocalDate acquisitionDate, String picture, String manufacturerLink) {
	super();
	this.id = id;
	this.idManufacturer = idManufacturer;
	this.name = name;
	this.walloonName = walloonName;
	this.description = description;
	this.surname = surname;
	this.manufacturer = manufacturer;
	this.acquisitionDate = acquisitionDate;
	this.picture = picture;
	this.manufacturerLink = manufacturerLink;
    }

    public Long getId() {
	return id;
    }

    public String getIdManufacturer() {
	return idManufacturer;
    }

    public String getName() {
	return name;
    }

    public String getSurname() {
	return surname;
    }

    public Manufacturer getManufacturer() {
	return manufacturer;
    }

    public LocalDate getAcquisitionDate() {
	return acquisitionDate;
    }

    public String getPicture() {
	return picture;
    }

    public String getManufacturerLink() {
	return manufacturerLink;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public void setIdManufacturer(String idManufacturer) {
	this.idManufacturer = idManufacturer;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setSurname(String surname) {
	this.surname = surname;
    }

    public void setManufacturer(Manufacturer manufacturer) {
	this.manufacturer = manufacturer;
    }

    public void setAcquisitionDate(LocalDate acquisitionDate) {
	this.acquisitionDate = acquisitionDate;
    }

    public void setPicture(String picture) {
	this.picture = picture;
    }

    public void setManufacturerLink(String manufacturerLink) {
	this.manufacturerLink = manufacturerLink;
    }

    public String getWalloonName() {
	return walloonName;
    }

    public void setWalloonName(String walloonName) {
	this.walloonName = walloonName;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    @Override
    public String toString() {
	return "Santon[Id=" + this.getId() + "/IdManu=" + this.getIdManufacturer() + "/" + this.getName() + "]";
    }

}
