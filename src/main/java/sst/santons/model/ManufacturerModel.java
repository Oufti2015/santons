package sst.santons.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ManufacturerModel {

    private StringProperty name;

    public ManufacturerModel(String name) {
	this.name = new SimpleStringProperty(name);
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

    @Override
    public String toString() {
	return getName();
    }
}
