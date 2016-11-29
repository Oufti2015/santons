package sst.santons.cutover;

import java.util.ArrayList;

import sst.santons.data.Manufacturer;
import sst.santons.data.Santon;

public class SantonsCutover {

    private ArrayList<Santon> santons = new ArrayList<>();

    public SantonsCutover() {
	Manufacturer noirhomme = new Manufacturer("Robert Noirhomme");

	santons.add(new Santon(null, "002", "Tchantchès", "Tchantchès avou s'bari à pèket", "Tchantchès au cruchon de genièvre", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#0"));
	santons.add(new Santon(null, "003", "Le boulanger", "Li bol'djî", "Le boulanger", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#1"));
	santons.add(new Santon(null, "004", "La femme au châle", null, null, null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#2"));
	santons.add(new Santon(null, "006", "Le petit meunier", "Li p'tit moûnî", "Le petit meunier", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#3"));
	santons.add(new Santon(null, "008", "La coupeuse de myrtilles", "Li copeûse di frombahes avou s'rivète", "La cueilleuse de myrtilles avec son peigne", null, noirhomme,
		null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#4"));
	santons.add(new Santon(null, "009", "La maraîchère", "Li cotîrèsse avou s'tchapê d'feut", "La maraîchère avec son chapeau de feutre", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#5"));
	santons.add(new Santon(null, "010", "Le braconnier", "Li brak'nî èt l'robète", "Le braconnier et le lapin", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#6"));
	santons.add(new Santon(null, "011", "La fermière au \"harkè\"", "Li cinserèsse avou l'harkè", "La fermière au porte-seau", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#7"));
	santons.add(new Santon(null, "012", "La marchande de poires cuites", "Li martchande di cûtes peures", "La marchande de poires cuites", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#8"));
	santons.add(new Santon(null, "013", "Le menuisier", "Li scrini", "Le menuisier", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#9"));
	santons.add(new Santon(null, "014", "La femme au fagot", "Li feume al fahène", "La femme au fagot", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#10"));
	santons.add(new Santon(null, "015", "Le mineur à la \"bouyote\"", "Li houyeu al bouyote", "Le mineur au rondin de bois", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#11"));
	santons.add(new Santon(null, "016", "Le vieux couple", "Li vî cope", "Le vieux couple", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#12"));
	santons.add(new Santon(null, "017", "L'innocent", null, null, null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#13"));
	santons.add(new Santon(null, "018", "La femme à la pomme d’amour", "Li feume al pome d’amour", "La femme à la pomme d’amour", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#14"));
	santons.add(new Santon(null, "019", "Le curé au pot de miel", "Li vî curé à pot d'lame", "Le vieux curé au pot de miel", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#15"));
	santons.add(new Santon(null, "20", "La femme à la tarte", "Li feume al doreye", "La femme à la tarte", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#16"));
	santons.add(new Santon(null, "021", "La boterresse liégeoise", "Li boterèsse a hèra", "La botteresse liégeoise", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#17"));
	santons.add(new Santon(null, "023", "Joseph Marcatchou (pêcheur)", "Li Marcatchou", "Marcatchou, un célèbre pêcheur liégeois", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#18"));
	santons.add(
		new Santon(null, "024", "L'acolyte", "L'acolète", "L'acolyte", null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#19"));
	santons.add(new Santon(null, "025", "L'accordéoniste", "L'accordèoneu", "L'accordéoniste", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#20"));
	santons.add(new Santon(null, "026", "La fleuriste", "Li fleûrisse", "La fleuriste", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#21"));
	santons.add(new Santon(null, "027", "Le vieux docteur", "Li vî docteûr", "Le vieux médecin de campagne", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#22"));
	santons.add(new Santon(null, "028", "Le forgeron", "Li mariha", "Le maréchal-ferrant", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#23"));
	santons.add(new Santon(null, "029", "La marchande de moutarde", null, null, null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#24"));
	santons.add(new Santon(null, "030", "La fermière et sa charrette à chien", "Li cinseresse avou s'tchèrète à tchin", "La fermière à la charrette à chien", null, noirhomme,
		null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#25"));
	santons.add(new Santon(null, "031a", "La macrale au balais droit", "Li macrale dèl Vi-Sam", "La sorcière de Vielsalm ", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#26"));
	santons.add(new Santon(null, "031b", "La macrale au balais oblique", "Li macrale dèl Vi-Sam", "La sorcière de Vielsalm ", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#27"));
	santons.add(new Santon(null, "031c", "La grande macrale", "Li macrale dèl Vi-Sam", "La sorcière de Vielsalm ", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#28"));
	santons.add(new Santon(null, "031d", "La macrale à la chouette", "Li macrale dèl Vi-Sam", "La sorcière de Vielsalm ", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#29"));
	santons.add(new Santon(null, "031e", "La postulante au flambeau", "Li macrale dèl Vi-Sam", "La sorcière de Vielsalm ", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#30"));
	santons.add(new Santon(null, "032", "Les commères", "Les kimères", "Les commères", null, noirhomme, null, null, null));
	santons.add(new Santon(null, "033", "L'instituteur", "Li vî maîsse di scole", "Le vieil instituteur", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#31"));
	santons.add(new Santon(null, "034", "Le bourgmestre", "Li mayeûr", "Le bourgmestre", null, noirhomme, null, null, null));
	santons.add(new Santon(null, "035", "Le marionnettiste liégeois", "Li djouweû d'marionètes", "Le marionnettiste", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#32"));
	santons.add(new Santon(null, "036", "La marchande de moutarde", "Li martchande di mostade", "La marchande de moutarde", null, noirhomme, null, null, null));
	santons.add(new Santon(null, "037", "Le vieux facteur", "Li vî facteûr", "Le vieux facteur", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#33"));
	santons.add(new Santon(null, "038a", "Le débardeur...", "Li dihièrdjeû avou si dj'va", "Le débardeur avec son cheval", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#34"));
	santons.add(new Santon(null, "038b", "...et son cheval", "Li dihièrdjeû avou si dj'va", "Le débardeur avec son cheval", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#35"));
	santons.add(new Santon(null, "039", "La gardeuse d'oies", null, null, null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#36"));
	santons.add(new Santon(null, "040", "La botteresse ardennaise", "Li boterèsse di l'Ardène", "La botteresse ardennaise", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#37"));
	santons.add(new Santon(null, "041", "La marchande de \"makeye\"", "Li martchande di makêye avou s'hinon", "La marchande de fromage blanc", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#38"));
	santons.add(new Santon(null, "042", "La marchande de pommes de terre", "Li feume as tchènas d'crompîres", "La femme aux paniers de pommes de terre", null, noirhomme, null,
		null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#39"));
	santons.add(new Santon(null, "043a", "Le garde-champêtre", "Li champète", "Le garde-champêtre", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#40"));
	santons.add(new Santon(null, "043b", "Le garde-champêtre des macralles", "Li champète dèl Vî-Sam", "Le champêtre du gr folklor de Vielsalm", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#41"));
	santons.add(new Santon(null, "044", "Le joueur d'orgue de barbarie", "Li djoueu d’Or", "Le joueur d’orgue de Barbarie", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#42"));
	santons.add(
		new Santon(null, "045", "Le \"sotè\" (nuton)", null, null, null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#43"));
	santons.add(new Santon(null, "046", "La macrale à califourchon", "Li macrale so s'ramon ", "La sorcière sur son balai", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#44"));
	santons.add(new Santon(null, "047", "Le gendarme", "Li jandarme", "Le gendarme", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#45"));
	santons.add(
		new Santon(null, "048", "Le diable", "Li djâle", "Le diable", null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#46"));
	santons.add(new Santon(null, "049", "Le brigadier", "Li brigadjer", "Le brigadier de gendarmerie", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#47"));
	santons.add(new Santon(null, "050", "Le marchand de glace et sa charrette", "Li martchand d'glace avou s'tchèrète", "Le marchand de glace avec sa charrette", null,
		noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#48"));
	santons.add(new Santon(null, "051", "La femme au chat", "Li feume a tchèt", "La femme au chat", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#49"));
	santons.add(new Santon(null, "052", "Saint-Nicolas", "Sint Nicolèy", "Saint Nicolas", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#50"));
	santons.add(new Santon(null, "053", "Le \"cokeli\" (amateur de chant de coq)", "Li  cokelî", "L'amateur de chants de coq", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#51"));
	santons.add(new Santon(null, "054", "La macrale au Tchtcha", "Li macrale a tchatcha", "La macrale au chaudron de tchatcha", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#52"));
	santons.add(new Santon(null, "055", "Nanesse", "Nanesse (en botteresse liégeoise)", "Nanesse en botteresse liégeoise", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#53"));
	santons.add(new Santon(null, "056", "Le colombophile", "Li colèbeu", "Le colombophile", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#54"));
	santons.add(new Santon(null, "057", " Les vieux compères", "Les deûs compères", "Les deux complices", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#55"));
	santons.add(new Santon(null, "058", "Le vacher", "Li vatchî", "Le vacher et sa vache", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#56"));
	santons.add(
		new Santon(null, "059", "L'avocat", "L'avocat", "L'avocat", null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#57"));
	santons.add(new Santon(null, "060", "L'enfant à la luge", "L’èfant a sployon", "L’enfant à la luge", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#58"));
	santons.add(new Santon(null, "061", "Le vitrier", "Li veûl’ti ", "Le vitrier", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#59"));
	santons.add(new Santon(null, "062", "L'apiculteur", "Li moh’lî", "L’apiculteur ", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#60"));
	santons.add(new Santon(null, "063", "Le jardinier", "Li djardinî al bèrwète", "Le jardinier à la brouette", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#61"));

	santons.add(new Santon(null, "064", "La macrale aux rats", "Li macrale a rats", "La sorcière aux  rats", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#62"));
	santons.add(new Santon(null, "065", "La marchande de fraises", "Li martchande di frèves", "La marchande de fraises de Vottem", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#63"));
	santons.add(
		new Santon(null, "066", "L'armurier liégeois", null, null, null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#64"));
	santons.add(new Santon(null, "067", "Le pharmacien", "L’apotikêre", "Le pharmacien", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#65"));
	santons.add(new Santon(null, "068", "La glaneuse", null, null, null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#66"));
	santons.add(
		new Santon(null, "069", "Le tendeur de grives", null, null, null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#67"));
	santons.add(new Santon(null, "070", " Le boucher", "Li boutchî", "Le boucher  ", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#68"));
	santons.add(new Santon(null, "071", "Le marchand d’échantillons de laine", "Li martchand d’plokètes ( Verviers )", "Le marchand d’échantillons de laine", null, noirhomme,
		null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#69"));
	santons.add(
		new Santon(null, "072", "Le joueur de quilles", null, null, null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#70"));
	santons.add(new Santon(null, "073", "La sage-femme", "Li sèdje-dame", "La sage femme", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#71"));
	santons.add(new Santon(null, "074", "Le chef de gare", "Li chèf di  gare  ", "Le chef de gare", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#72"));
	santons.add(new Santon(null, "075", "Le tendeur d'oiseaux", "Li tindeû ", "L’oiseleur", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#73"));
	santons.add(new Santon(null, "076", "Le tanneur", "Li tèneû", "Le tanneur de Stavelot", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#74"));
	santons.add(
		new Santon(null, "077", "L'écolier", "Li scolî", "L’écolier", null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#75"));
	santons.add(new Santon(null, "078", "La femme à la baratte", "Li feume a moûssî", "La femme à la baratte", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#76"));
	santons.add(new Santon(null, "079", "Le policier liégeois", "L’agent ", "Le policier liégeois", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#77"));
	santons.add(new Santon(null, "080", "La briquetière", "Li brikteu", "La briquetière", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#78"));
	santons.add(new Santon(null, "081", "La coupeuse de pain", "Li copeuse di pan", "La coupeuse  de pain", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#79"));
	santons.add(new Santon(null, "082", "Le pompier", "Li pompier", "Le pompier de Huy", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#80"));
	santons.add(new Santon(null, "083", "Le joueur de cornemuse", "Li djouweu d’cornemuse ", "Le joueur de cornemuse", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#81"));
	santons.add(new Santon(null, "084", "Le semeur", "Li teyeu d’pires", "Le tailleur de pierres", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#82"));
	santons.add(new Santon(null, "085", "La laitière", "Li feume a lècê", "La marchande de laitLa laitière", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#83"));
	santons.add(new Santon(null, "086", "Le scieur de bois", "Li soyeu d’bwès", "Le scieur de bois", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#84"));
	santons.add(new Santon(null, "087", "Le tailleur de pierres", "Li teyeu d’pires", "Le tailleur de pierres de Sprimont", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#85"));
	santons.add(new Santon(null, "088", "Le souffleur de verre du Val-St-Lambert", "Li ver’ri", "Le verrier (Val St Lambert)", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#86"));
	santons.add(new Santon(null, "089", "La fermière à la basse-cour", "Li cinseresse al poyeterèye", "La fermière à la basse-cour", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#87"));
	santons.add(new Santon(null, "090", "La lavandière", "Li bouw’rèsse", "La lavandière", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#88"));
	santons.add(new Santon(null, "091", "La dentellière", "Li cay’trèsse", "La dentellière de Marche-en-Famenne", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#89"));
	santons.add(new Santon(null, "092", "Le vétérinaire", "L’artisse ", "Le vétérinaire", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#90"));
	santons.add(new Santon(null, "093 (ou 94)", "L’écolière", "Li scolîre", "L’écolière", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#92"));
	santons.add(new Santon(null, "094 (ou 93)", "Le planteur de tabac de la Semois", "Li planteû d'toûbac", "Le planteur de tabac de la Semois", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#91"));
	santons.add(
		new Santon(null, "095", "L'ivrogne", "Li soleye", "l'ivrogne", null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#93"));
	santons.add(new Santon(null, "096", "Le Blanc Moussi", "Li blanc moussi", "Le blanc moussi", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#94"));
	santons.add(new Santon(null, "097a", "Le fermier...", "Li cinsi à clitchè", "Le fermier, le cheval et le tombereau", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#95"));
	santons.add(new Santon(null, "097b", "...le cheval et le tombereau", "Li cinsi à clitchè", "Le fermier, le cheval et le tombereau", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#96"));
	santons.add(new Santon(null, "098", "La couturière", "Li costîre", "La couturière", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#97"));
	santons.add(new Santon(null, "099", "Le violoneu", "Li  violoneu", "Le violoneu", null, noirhomme, null, null, null));
	santons.add(new Santon(null, "100 (ou 101)", "L'allumeur de réverbères", "L’ alumeu d’lampes", "L’allumeur de réverbère", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#99"));
	santons.add(new Santon(null, "101 (ou 100)", "L'institutrice", "Li d’mezelle di scole", "L’institutrice", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#98"));
	santons.add(
		new Santon(null, "102", "Le maçon", "Li  maçon", "Le maçon", null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#100"));
	santons.add(new Santon(null, "103", "Le pâtissier", "Li patissier", "-Le pâtissier", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#101"));
	santons.add(new Santon(null, "104", "Le cantonnier", "Li cantonî", "Le cantonnier", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#102"));
	santons.add(new Santon(null, "105", "L'infirmière", "L’infirmiére", "L’infirmière", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#103"));
	santons.add(new Santon(null, "106", "Le photographe", "Li photographe", "le photographe", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#104"));
	santons.add(new Santon(null, "107", "Le Moine d'Orval", "Li mwenne", "le moine d’Orval", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#105"));
	santons.add(new Santon(null, "108", "Le bibliothécaire", "Li bibliyotékêre", "le bibliothécaire", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#106"));
	santons.add(new Santon(null, "109", "Le garçon de café", "Li garçon d’cafè", "le garçon de café", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#107"));
	santons.add(new Santon(null, "110", "Le barbier", "Li barbî", "le barbier", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#108"));
	santons.add(new Santon(null, "111", "Le livreur de glace", "Li livreu d'glace", "le livreur de glace", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#109"));
	santons.add(new Santon(null, "112", "Le cordonnier", "Li cwèpî", "le cordonnier", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#110"));
	santons.add(new Santon(null, "113", "La marchande de sirop de Herve", "Li martchande di sirôpe", "la marchande de sirop de Herve", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#111"));
	santons.add(new Santon(null, "114", "Père Fouettard", "Hanscroufe", "le père fouettard", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#112"));
	santons.add(new Santon(null, "115", "Jules au cabinet", "Jules a cabinèt", "Jules au cabinet", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#113"));
	santons.add(new Santon(null, "116", "Le moine récollet", "Li mwenne récolèt", "le moine récollet", null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#114"));
	santons.add(new Santon(null, "HS", "Le franc maçon", null, null, null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#115"));
	santons.add(new Santon(null, "HS", "La Soeur de la Providence...", null, null, null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#116"));
	santons.add(
		new Santon(null, "HS", "...et son étudiante", null, null, null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#117"));
	santons.add(new Santon(null, "HS", "Le GI en blanc", null, null, null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#118"));
	santons.add(new Santon(null, "HS", "Le GI kaki de la bataille des ardennes", null, null, null, noirhomme, null, null,
		"http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#119"));
	santons.add(new Santon(null, "HS", "Le Molon de Namur", null, null, null, noirhomme, null, null, "http://www.santons.be/Santons/Mes_Santons/Pages/Les_Santons.html#120"));
	santons.add(new Santon(null, "117", "Le coureur cycliste", null, "Le coureur cycliste", null, noirhomme, null, null, null));
	santons.add(new Santon(null, "118", "Maria et sa « friture »", null, "Maria dans sa « friture »", null, noirhomme, null, null, null));
	santons.add(new Santon(null, "119", "Le herdier", "Li hierdî", "Le herdier", null, noirhomme, null, null, null));
	santons.add(new Santon(null, "120", "La haguette", "Li haguète", "la haguette de Malmédy", null, noirhomme, null, null, null));

	System.out.println("" + santons.size() + " santons created.");
    }

    public static void main(String[] args) {
	SantonsCutover cutover = new SantonsCutover();
    }
}
