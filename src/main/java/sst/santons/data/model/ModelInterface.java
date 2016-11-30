package sst.santons.data.model;

import sst.santons.data.DataModel;
import sst.santons.data.Manufacturer;
import sst.santons.data.Santon;
import sst.santons.model.ManufacturerModel;
import sst.santons.model.SantonModel;

public class ModelInterface {

	public static Manufacturer db(ManufacturerModel model) {
		Manufacturer result = null;

		result = DataModel.me().getManufacturer(model.getName());
		if (null == result) {
			result = new Manufacturer(model.getName());
		} else {
			result.setName(model.getName());
		}
		return result;
	}

	public static ManufacturerModel model(Manufacturer manu) {
		return new ManufacturerModel(manu.getName());
	}

	public static Santon db(SantonModel model) {
		Santon result = null;

		result = DataModel.me().getSanton(model.getName());
		if (null == result) {
			result = new Santon(model.getId(), model.getIdManufacturer(), model.getName(), model.getWalloonName(),
					model.getDescription(), model.getSurname(),
					DataModel.me().getManufacturer(model.getManufacturer().getName()), model.getAcquisitionDate(),
					model.getPicture(), model.getManufacturerLink());
		}
		return result;
	}

	public static SantonModel model(Santon santon) {
		return new SantonModel(santon.getId(), santon.getIdManufacturer(), santon.getName(), santon.getWalloonName(),
				santon.getDescription(), santon.getSurname(), ManufacturerModel.get(santon.getManufacturer().getName()),
				santon.getAcquisitionDate(), santon.getPicture(), santon.getManufacturerLink());
	}
}
