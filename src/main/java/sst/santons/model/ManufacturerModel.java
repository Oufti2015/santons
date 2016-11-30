package sst.santons.model;

import java.util.HashMap;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ManufacturerModel {

    private static HashMap<String, ManufacturerModel> manufacturers = new HashMap<>();

    private StringProperty name;

    public ManufacturerModel(String name) {
	this.name = new SimpleStringProperty(name);
	manufacturers.put(name, this);
    }

    public StringProperty name() {
	return name;
    }

    public String getName() {
	return name.get();
    }

    public void setName(StringProperty name) {
	this.name = name;
    }

    public static ManufacturerModel get(String name) {
	return manufacturers.get(name);
    }

    @Override
    public String toString() {
	return getName();
    }

    @Override
    public boolean equals(Object obj) {
	return obj != null ? (name != null ? name.equals(((ManufacturerModel) obj).getName()) : false) : false;
    }
}
