package sst.santons.data;

import java.util.ArrayList;
import java.util.HashMap;

public class DataModel {
    private static DataModel instance = null;

    static {
	instance = new DataModel();
    }

    private DataModel() {
    }

    public static DataModel me() {
	return instance;
    }

    private long lastIdGenerated = 0;
    private ArrayList<Manufacturer> manufacturers = new ArrayList<>();
    private ArrayList<Santon> santons = new ArrayList<>();
    private HashMap<String, Santon> santonsMap = new HashMap<>();
    private HashMap<String, Manufacturer> manufacturersMap = new HashMap<>();

    public long getLastIdGenerated() {
	return lastIdGenerated;
    }

    public long getNewId() {
	return ++lastIdGenerated;
    }

    public ArrayList<Manufacturer> getManufacturers() {
	return manufacturers;
    }

    public ArrayList<Santon> getSantons() {
	return santons;
    }

    public void add(Santon santon) {
	santons.add(santon);
	if (null == santonsMap.get(santon.getName())) {
	    santonsMap.put(santon.getName(), santon);
	} else {
	    System.out.println("Already exists : " + santon);
	}
    }

    public void add(Manufacturer man) {
	manufacturers.add(man);
	if (null == santonsMap.get(man.getName())) {
	    manufacturersMap.put(man.getName(), man);
	} else {
	    System.out.println("Already exists : " + man);
	}
    }

    public Santon getSanton(String name) {
	return santonsMap.get(name);
    }

    public Manufacturer getManufacturer(String name) {
	return manufacturersMap.get(name);
    }

    @Override
    public String toString() {
	return "Santons.DataModel[Last Id:" + getLastIdGenerated() + "/Manufacturers:" + getManufacturers().size()
		+ "/Santons:" + getSantons().size() + "]";
    }

    public void load(DataModel temp) {
	lastIdGenerated = temp.getLastIdGenerated();

	santons.addAll(temp.getSantons());

	for (Santon santon : santons) {
	    Manufacturer manu = santon.getManufacturer();
	    Manufacturer manuFromHash = manufacturersMap.get(manu.getName());
	    if (null == manuFromHash) {
		manufacturersMap.put(manu.getName(), manu);
		manufacturers.add(manu);
	    } else {
		santon.setManufacturer(manuFromHash);
	    }
	}
    }

    public boolean check() {
	boolean check = true;
	check = check && (santons.size() == santonsMap.size());
	check = check && (manufacturers.size() == manufacturersMap.size());
	return check;
    }
}
