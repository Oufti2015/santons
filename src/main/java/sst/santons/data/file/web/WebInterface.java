package sst.santons.data.file.web;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import sst.santons.data.DataModel;
import sst.santons.data.Santon;
import sst.santons.data.file.web.json.Data;
import sst.santons.data.file.web.json.Gallery;

public class WebInterface {
    public static void toFile() {
	Gallery gallery = new Gallery();
	for (Santon santon : DataModel.me().getSantons()) {
	    Data data = new Data();
	    data.name = santon.getName();
	    data.buttonText = "Zoom...";
	    data.description = santon.getDescription() + " (" + santon.getManufacturer().getName() + ")";
	    data.title = santon.getDescription()
		    + ((santon.getWalloonName() != null) ? " - " + santon.getWalloonName() : "");

	    gallery.data.add(data);

	    try (Writer writer = new OutputStreamWriter(new FileOutputStream("data/gallery.json"), "UTF-8")) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		gson.toJson(gallery, writer);
	    } catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }

	}
    }
}
