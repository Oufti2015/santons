package sst.santons.data.file;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

import sst.common.file.output.OutputFile;
import sst.common.html.AbstractHTMLElement;
import sst.common.html.HTML;
import sst.common.html.HTMLBody;
import sst.common.html.HTMLHyperlinks;
import sst.common.html.HTMLImage;
import sst.common.html.head.HTMLLink;
import sst.common.html.table.HTMLTable;
import sst.common.html.table.HTMLTableRow;
import sst.santons.data.DataModel;
import sst.santons.data.Santon;
import sst.santons.data.file.web.WebInterface;

public class HTMLFileInterface {

    private static final Charset CHAR_SET = StandardCharsets.UTF_8;
    private static final String FIRST_HTML = "first.html";
    private static final String LAST_HTML = "last.html";
    private static final String TITLE = "Les Santons de Paul";

    public void toFile(File folder) {
	indexToFile(folder);
	santonsToFile(folder + File.separator + "santons", DataModel.me().getSantons());

	try {
	    DataModelFileInterface.toFile("data/santons.json");
	    WebInterface.toFile();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    private boolean previousIsFirst = false;
    private boolean nextIsLast = false;

    private void santonsToFile(String folder, List<Santon> santons) {
	Santon previous = null, santon = null, next = null;
	boolean loopFinished = false;
	for (Iterator<Santon> iterator = santons.iterator(); !loopFinished;) {
	    previousIsFirst = (null == previous && null != santon);

	    previous = santon;
	    santon = next;
	    next = (iterator.hasNext()) ? iterator.next() : null;
	    if (null == santon) {
		santon = next;
		next = (iterator.hasNext()) ? iterator.next() : null;
	    }
	    loopFinished = (null == next);
	    nextIsLast = (null != next && !iterator.hasNext());
	    santonToFile(folder, santon, previous, next);
	}
    }

    private void santonToFile(String folder, Santon santon, Santon previous, Santon next) {
	if (null == santon.getId()) {
	    santon.setId(DataModel.me().getNewId());
	}
	if (null != next && null == next.getId()) {
	    next.setId(DataModel.me().getNewId());
	}
	String filename = santon.getId() + ".html";
	if (null == previous) {
	    filename = FIRST_HTML;
	} else if (null == next) {
	    filename = LAST_HTML;
	}
	filename = folder + File.separator + filename;
	HTML htmlIndex = santon(santon, previous, next);
	try (OutputFile of = new OutputFile(filename)) {
	    of.println(htmlIndex.toString());
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    private HTML santon(Santon santon, Santon previous, Santon next) {
	HTML html = new HTML();
	html.head().charset(CHAR_SET).title(TITLE).addChild(new HTMLLink().rel("stylesheet").href("../santons.css"));
	HTMLBody body = html.body();
	HTMLTable table = new HTMLTable();
	table.style("width: 100%");
	HTMLTableRow row = table.newRow();
	row.newCell().rowspan(2).classId("previous").addChild(new HTMLHyperlinks().href(previous(previous))
		.addChild(new HTMLImage().src("../images/previous.jpg").width(128).height(128)));
	row.newCell().style("width: 50%").addChild(createMenuTable(false));
	row.newCell().rowspan(2).classId("next").addChild(new HTMLHyperlinks().href(next(next))
		.addChild(new HTMLImage().src("../images/next.png").width(128).height(128)));
	table.newRow().newCell().classId("details").addChild(santonTable(santon));

	body.addChild(table);
	return html;
    }

    private String next(Santon next) {
	return nextIsLast ? LAST_HTML : ((null == next) ? FIRST_HTML : (next.getId() + ".html"));
    }

    private String previous(Santon previous) {
	return previousIsFirst ? FIRST_HTML : ((null == previous) ? LAST_HTML : previous.getId() + ".html");
    }

    private AbstractHTMLElement santonTable(Santon santon) {
	HTMLTable table = new HTMLTable();
	table.style("width: 100%");
	table.newRow().newCell().classId("detailsimg")
		.addChild(new HTMLImage().src(santon.getPicture()).width(255).height(509));
	table.row().newCell().style("detailstext").addChild(textTable(santon));
	return table;
    }

    private AbstractHTMLElement textTable(Santon santon) {
	HTMLTable table = new HTMLTable();
	table.style("width: 100%");
	row(table, "R&eacute;f&eacute;rence", "" + santon.getId());
	row(table, "R&eacute;f&eacute;rence du Santonnier", santon.getIdManufacturer());
	row(table, "Nom", santon.getName());
	row(table, "Nom wallon / No Walon", santon.getWalloonName());
	row(table, "Description", santon.getDescription());
	row(table, "Surnom", santon.getSurname() != null ? santon.getSurname() : "n/a");
	row(table, "Santonnier", santon.getManufacturer().getName());
	row(table, "Date d'aquisition", santon.getAcquisitionDate() != null ? "" + santon.getAcquisitionDate() : "n/a");
	row(table, "Lien du santonnier",
		new HTMLHyperlinks().href(santon.getManufacturerLink()).textContent(santon.getName()));

	return table;
    }

    private void row(HTMLTable table, String title, String data) {
	table.newRow().newCell().classId("detailstexttitle").textContent(title);
	table.row().newCell().style("width: 5%").textContent("&nbsp;");
	table.row().newCell().classId("detailstextcontenu").textContent(data);
    }

    private void row(HTMLTable table, String title, AbstractHTMLElement data) {
	table.newRow().newCell().classId("detailstexttitle").textContent(title);
	table.row().newCell().style("width: 5%").textContent("&nbsp;");
	table.row().newCell().classId("detailstextcontenu").addChild(data);
    }

    private void indexToFile(File folder) {
	HTML htmlIndex = index();
	try (OutputFile of = new OutputFile(folder + File.separator + "index.html")) {
	    of.println(htmlIndex.toString());
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    private HTML index() {
	HTML html = new HTML();
	html.head().charset(CHAR_SET).title(TITLE).addChild(new HTMLLink().rel("stylesheet").href("santons.css"));
	HTMLBody body = html.body();
	HTMLTable table = new HTMLTable();
	table.style("width: 100%");
	HTMLTableRow row = table.newRow();
	row.newCell().style("width: 25%").textContent("&nbsp;");
	row.newCell().style("width: 50%").addChild(createMenuTable(true));
	row.newCell().style("width: 25%").textContent("&nbsp;");
	table.newRow().newCell("&nbsp;");
	table.row().newCell().addChild(new HTMLImage().src("images/hp.jpg").width(900).height(796));
	table.row().newCell("&nbsp;");
	body.addChild(table);
	return html;
    }

    private AbstractHTMLElement createMenuTable(boolean isMainPage) {
	HTMLTable table = new HTMLTable();
	table.style("width: 100%");
	table.newRow().newCell().classId("title").textContent(TITLE);
	table.row().newCell().classId("menu")
		.addChild(new HTMLHyperlinks().href((isMainPage ? "" : "../") + "index.html").textContent("Accueil"));
	table.row().newCell().classId("menu").addChild(
		new HTMLHyperlinks().href((isMainPage ? "santons/" : "") + FIRST_HTML).textContent("Les santons"));
	table.row().newCell().classId("menu").addChild(
		new HTMLHyperlinks().href((isMainPage ? "" : "../") + "apropos.html").textContent("A propos"));
	return table;
    }
}
