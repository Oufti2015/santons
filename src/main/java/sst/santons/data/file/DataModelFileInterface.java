package sst.santons.data.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import sst.santons.data.DataModel;

public class DataModelFileInterface {

    public static void toFile(String filename) throws IOException {
	try (Writer writer = new OutputStreamWriter(new FileOutputStream(filename), "UTF-8")) {
	    Gson gson = new GsonBuilder().create();
	    gson.toJson(DataModel.me(), writer);
	}
    }

    public static void fromFile(String filename) throws IOException {
	try (Reader writer = new InputStreamReader(new FileInputStream(filename), "UTF-8")) {
	    Gson gson = new GsonBuilder().create();
	    DataModel temp = gson.fromJson(writer, DataModel.class);
	    DataModel.me().load(temp);
	    System.out.println("Data Model created. " + DataModel.me().getManufacturers().size() + " santonniers et "
		    + DataModel.me().getSantons().size());
	    System.out.println("Data Model created : " + DataModel.me());
	}

	HTMLFileInterface html = new HTMLFileInterface();
	html.toFile(new File("html"));
    }
}
