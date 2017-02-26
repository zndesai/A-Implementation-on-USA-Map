/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zankrutidesai unity id : zndesai
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class SearchUSA {

    static Map<Node, Path> map = new HashMap<Node, Path>();
    static LinkedList<Node> expanded = new LinkedList<Node>();
    static Queue<Path> allPaths = new PriorityQueue<Path>();
    static LinkedList<Node> finalpath = new LinkedList<Node>();
    static List<Node> allCities = new ArrayList<Node>();
    static String searchType = "";

    public static void main(String[] args) {
        searchType = args[0];

        Node albanyGA = new Node();
        Node albanyNY = new Node();
        Node albuquerque = new Node();
        Node atlanta = new Node();
        Node augusta = new Node();
        Node austin = new Node();
        Node bakersfield = new Node();
        Node baltimore = new Node();
        Node batonRouge = new Node();
        Node beaumont = new Node();
        Node boise = new Node();
        Node boston = new Node();
        Node buffalo = new Node();
        Node calgary = new Node();
        Node charlotte = new Node();
        Node chattanooga = new Node();
        Node chicago = new Node();
        Node cincinnati = new Node();
        Node cleveland = new Node();
        Node coloradoSprings = new Node();
        Node columbus = new Node();
        Node dallas = new Node();
        Node dayton = new Node();
        Node daytonaBeach = new Node();
        Node denver = new Node();
        Node desMoines = new Node();
        Node elPaso = new Node();
        Node eugene = new Node();
        Node europe = new Node();
        Node ftWorth = new Node();
        Node fresno = new Node();
        Node grandJunction = new Node();
        Node greenBay = new Node();
        Node greensboro = new Node();
        Node houston = new Node();
        Node indianapolis = new Node();
        Node jacksonville = new Node();
        Node japan = new Node();
        Node kansasCity = new Node();
        Node keyWest = new Node();
        Node lafayette = new Node();
        Node lakeCity = new Node();
        Node laredo = new Node();
        Node lasVegas = new Node();
        Node lincoln = new Node();
        Node littleRock = new Node();
        Node losAngeles = new Node();
        Node macon = new Node();
        Node medford = new Node();
        Node memphis = new Node();
        Node mexia = new Node();
        Node mexico = new Node();
        Node miami = new Node();
        Node midland = new Node();
        Node milwaukee = new Node();
        Node minneapolis = new Node();
        Node modesto = new Node();
        Node montreal = new Node();
        Node nashville = new Node();
        Node newHaven = new Node();
        Node newOrleans = new Node();
        Node newYork = new Node();
        Node norfolk = new Node();
        Node oakland = new Node();
        Node oklahomaCity = new Node();
        Node omaha = new Node();
        Node orlando = new Node();
        Node ottawa = new Node();
        Node pensacola = new Node();
        Node philadelphia = new Node();
        Node phoenix = new Node();
        Node pittsburgh = new Node();
        Node pointReyes = new Node();
        Node portland = new Node();
        Node providence = new Node();
        Node provo = new Node();
        Node raleigh = new Node();
        Node redding = new Node();
        Node reno = new Node();
        Node richmond = new Node();
        Node rochester = new Node();
        Node sacramento = new Node();
        Node salem = new Node();
        Node salinas = new Node();
        Node saltLakeCity = new Node();
        Node sanAntonio = new Node();
        Node sanDiego = new Node();
        Node sanFrancisco = new Node();
        Node sanJose = new Node();
        Node sanLuisObispo = new Node();
        Node santaFe = new Node();
        Node saultSteMarie = new Node();
        Node savannah = new Node();
        Node seattle = new Node();
        Node stLouis = new Node();
        Node stamford = new Node();
        Node stockton = new Node();
        Node tallahassee = new Node();
        Node tampa = new Node();
        Node thunderBay = new Node();
        Node toledo = new Node();
        Node toronto = new Node();
        Node tucson = new Node();
        Node tulsa = new Node();
        Node uk1 = new Node();
        Node uk2 = new Node();
        Node vancouver = new Node();
        Node washington = new Node();
        Node westPalmBeach = new Node();
        Node wichita = new Node();
        Node winnipeg = new Node();
        Node yuma = new Node();

        allCities.add(albanyGA);
        allCities.add(albanyNY);
        allCities.add(albuquerque);
        allCities.add(atlanta);
        allCities.add(augusta);
        allCities.add(austin);
        allCities.add(bakersfield);
        allCities.add(baltimore);
        allCities.add(batonRouge);
        allCities.add(beaumont);
        allCities.add(boise);
        allCities.add(boston);
        allCities.add(buffalo);
        allCities.add(calgary);
        allCities.add(charlotte);
        allCities.add(chattanooga);
        allCities.add(chicago);
        allCities.add(cincinnati);
        allCities.add(cleveland);
        allCities.add(coloradoSprings);
        allCities.add(columbus);
        allCities.add(dallas);
        allCities.add(dayton);
        allCities.add(daytonaBeach);
        allCities.add(denver);
        allCities.add(desMoines);
        allCities.add(elPaso);
        allCities.add(eugene);
        allCities.add(europe);
        allCities.add(ftWorth);
        allCities.add(fresno);
        allCities.add(grandJunction);
        allCities.add(greenBay);
        allCities.add(greensboro);
        allCities.add(houston);
        allCities.add(indianapolis);
        allCities.add(jacksonville);
        allCities.add(japan);
        allCities.add(kansasCity);
        allCities.add(keyWest);
        allCities.add(lafayette);
        allCities.add(lakeCity);
        allCities.add(laredo);
        allCities.add(lasVegas);
        allCities.add(lincoln);
        allCities.add(littleRock);
        allCities.add(losAngeles);
        allCities.add(macon);
        allCities.add(medford);
        allCities.add(memphis);
        allCities.add(mexia);
        allCities.add(mexico);
        allCities.add(miami);
        allCities.add(midland);
        allCities.add(milwaukee);
        allCities.add(minneapolis);
        allCities.add(modesto);
        allCities.add(montreal);
        allCities.add(nashville);
        allCities.add(newHaven);
        allCities.add(newOrleans);
        allCities.add(newYork);
        allCities.add(norfolk);
        allCities.add(oakland);
        allCities.add(oklahomaCity);
        allCities.add(omaha);
        allCities.add(orlando);
        allCities.add(ottawa);
        allCities.add(pensacola);
        allCities.add(philadelphia);
        allCities.add(phoenix);
        allCities.add(pittsburgh);
        allCities.add(pointReyes);
        allCities.add(portland);
        allCities.add(providence);
        allCities.add(provo);
        allCities.add(raleigh);
        allCities.add(redding);
        allCities.add(reno);
        allCities.add(richmond);
        allCities.add(rochester);
        allCities.add(sacramento);
        allCities.add(salem);
        allCities.add(salinas);
        allCities.add(saltLakeCity);
        allCities.add(sanAntonio);
        allCities.add(sanDiego);
        allCities.add(sanFrancisco);
        allCities.add(sanJose);
        allCities.add(sanLuisObispo);
        allCities.add(santaFe);
        allCities.add(saultSteMarie);
        allCities.add(savannah);
        allCities.add(seattle);
        allCities.add(stLouis);
        allCities.add(stamford);
        allCities.add(stockton);
        allCities.add(tallahassee);
        allCities.add(tampa);
        allCities.add(thunderBay);
        allCities.add(toledo);
        allCities.add(toronto);
        allCities.add(tucson);
        allCities.add(tulsa);
        allCities.add(uk1);
        allCities.add(uk2);
        allCities.add(vancouver);
        allCities.add(washington);
        allCities.add(westPalmBeach);
        allCities.add(wichita);
        allCities.add(winnipeg);
        allCities.add(yuma);

        albanyGA.name = "albanyGA";
        albanyGA.lat = 31.58;
        albanyGA.log = 84.17;
        albanyGA.neighbour.put(tallahassee, 120);
        albanyGA.neighbour.put(macon, 106);

        albanyNY.name = "albanyNY";
        albanyNY.lat = 42.66;
        albanyNY.log = 73.78;
        albanyNY.neighbour.put(montreal, 226);
        albanyNY.neighbour.put(boston, 166);
        albanyNY.neighbour.put(rochester, 148);

        albuquerque.name = "albuquerque";
        albuquerque.lat = 35.11;
        albuquerque.log = 106.61;
        albuquerque.neighbour.put(elPaso, 267);
        albuquerque.neighbour.put(santaFe, 61);

        atlanta.name = "atlanta";
        atlanta.lat = 33.76;
        atlanta.log = 84.40;
        atlanta.neighbour.put(macon, 82);
        atlanta.neighbour.put(chattanooga, 117);

        augusta.name = "augusta";
        augusta.lat = 33.43;
        augusta.log = 82.02;
        augusta.neighbour.put(charlotte, 161);
        augusta.neighbour.put(savannah, 131);

        austin.name = "austin";
        austin.lat = 30.30;
        austin.log = 97.75;
        austin.neighbour.put(houston, 186);
        austin.neighbour.put(sanAntonio, 79);

        bakersfield.name = "bakersfield";
        bakersfield.lat = 35.36;
        bakersfield.log = 119.03;
        bakersfield.neighbour.put(losAngeles, 112);
        bakersfield.neighbour.put(fresno, 107);

        baltimore.name = "baltimore";
        baltimore.lat = 39.31;
        baltimore.log = 76.62;
        baltimore.neighbour.put(philadelphia, 102);
        baltimore.neighbour.put(washington, 45);

        batonRouge.name = "batonRouge";
        batonRouge.lat = 30.46;
        batonRouge.log = 91.14;
        batonRouge.neighbour.put(lafayette, 50);
        batonRouge.neighbour.put(newOrleans, 80);

        beaumont.name = "beaumont";
        beaumont.lat = 30.08;
        beaumont.log = 94.13;
        beaumont.neighbour.put(houston, 69);
        beaumont.neighbour.put(lafayette, 122);

        boise.name = "boise";
        boise.lat = 43.61;
        boise.log = 116.24;
        boise.neighbour.put(saltLakeCity, 349);
        boise.neighbour.put(portland, 428);

        boston.name = "boston";
        boston.lat = 42.32;
        boston.log = 71.09;
        boston.neighbour.put(providence, 51);
        boston.neighbour.put(albanyNY, 166);

        buffalo.name = "buffalo";
        buffalo.lat = 42.90;
        buffalo.log = 78.85;
        buffalo.neighbour.put(toronto, 105);
        buffalo.neighbour.put(rochester, 64);
        buffalo.neighbour.put(cleveland, 191);

        calgary.name = "calgary";
        calgary.lat = 51.00;
        calgary.log = 114.00;
        calgary.neighbour.put(vancouver, 605);
        calgary.neighbour.put(winnipeg, 829);

        charlotte.name = "charlotte";
        charlotte.lat = 35.21;
        charlotte.log = 80.83;
        charlotte.neighbour.put(greensboro, 91);
        charlotte.neighbour.put(augusta, 161);

        chattanooga.name = "chattanooga";
        chattanooga.lat = 35.05;
        chattanooga.log = 85.27;
        chattanooga.neighbour.put(nashville, 129);
        chattanooga.neighbour.put(atlanta, 117);

        chicago.name = "chicago";
        chicago.lat = 41.84;
        chicago.log = 87.68;
        chicago.neighbour.put(milwaukee, 90);
        chicago.neighbour.put(midland, 279);

        cincinnati.name = "cincinnati";
        cincinnati.lat = 39.14;
        cincinnati.log = 84.50;
        cincinnati.neighbour.put(indianapolis, 110);
        cincinnati.neighbour.put(dayton, 56);

        cleveland.name = "cleveland";
        cleveland.lat = 41.48;
        cleveland.log = 81.67;
        cleveland.neighbour.put(pittsburgh, 157);
        cleveland.neighbour.put(columbus, 142);
        cleveland.neighbour.put(buffalo, 191);

        coloradoSprings.name = "coloradoSprings";
        coloradoSprings.lat = 38.86;
        coloradoSprings.log = 104.79;
        coloradoSprings.neighbour.put(denver, 70);
        coloradoSprings.neighbour.put(santaFe, 316);

        columbus.name = "columbus";
        columbus.lat = 39.99;
        columbus.log = 82.99;
        columbus.neighbour.put(dayton, 72);
        columbus.neighbour.put(cleveland, 72);

        dallas.name = "dallas";
        dallas.lat = 32.80;
        dallas.log = 96.79;
        dallas.neighbour.put(denver, 792);
        dallas.neighbour.put(mexia, 83);

        dayton.name = "dayton";
        dayton.lat = 39.76;
        dayton.log = 84.20;
        dayton.neighbour.put(cincinnati, 56);
        dayton.neighbour.put(columbus, 72);

        daytonaBeach.name = "daytonaBeach";
        daytonaBeach.lat = 29.21;
        daytonaBeach.log = 81.04;
        daytonaBeach.neighbour.put(jacksonville, 92);
        daytonaBeach.neighbour.put(orlando, 54);

        denver.name = "denver";
        denver.lat = 39.73;
        denver.log = 104.97;
        denver.neighbour.put(wichita, 523);
        denver.neighbour.put(grandJunction, 246);
        denver.neighbour.put(coloradoSprings, 70);
        denver.neighbour.put(dallas, 792);

        desMoines.name = "desMoines";
        desMoines.lat = 41.59;
        desMoines.log = 93.62;
        desMoines.neighbour.put(omaha, 135);
        desMoines.neighbour.put(minneapolis, 246);

        elPaso.name = "elPaso";
        elPaso.lat = 31.79;
        elPaso.log = 106.42;
        elPaso.neighbour.put(sanAntonio, 580);
        elPaso.neighbour.put(tucson, 320);
        elPaso.neighbour.put(albuquerque, 267);

        eugene.name = "eugene";
        eugene.lat = 44.06;
        eugene.log = 123.11;
        eugene.neighbour.put(salem, 63);
        eugene.neighbour.put(medford, 165);

        europe.name = "europe";
        europe.lat = 48.87;
        europe.log = -2.33;
        europe.neighbour.put(philadelphia, 3939);

        ftWorth.name = "ftWorth";
        ftWorth.lat = 32.74;
        ftWorth.log = 97.33;
        ftWorth.neighbour.put(oklahomaCity, 209);

        fresno.name = "fresno";
        fresno.lat = 36.78;
        fresno.log = 119.79;
        fresno.neighbour.put(modesto, 109);
        fresno.neighbour.put(bakersfield, 107);

        grandJunction.name = "grandJunction";
        grandJunction.lat = 39.08;
        grandJunction.log = 108.56;
        grandJunction.neighbour.put(provo, 220);
        grandJunction.neighbour.put(denver, 246);

        greenBay.name = "greenBay";
        greenBay.lat = 44.51;
        greenBay.log = 88.02;
        greenBay.neighbour.put(minneapolis, 304);
        greenBay.neighbour.put(milwaukee, 117);

        greensboro.name = "greensboro";
        greensboro.lat = 36.08;
        greensboro.log = 79.82;
        greensboro.neighbour.put(raleigh, 74);
        greensboro.neighbour.put(charlotte, 91);

        houston.name = "houston";
        houston.lat = 29.76;
        houston.log = 95.38;
        houston.neighbour.put(mexia, 165);
        houston.neighbour.put(beaumont, 69);
        houston.neighbour.put(austin, 186);

        indianapolis.name = "indianapolis";
        indianapolis.lat = 39.79;
        indianapolis.log = 86.15;
        indianapolis.neighbour.put(stLouis, 246);
        indianapolis.neighbour.put(cincinnati, 110);

        jacksonville.name = "jacksonville";
        jacksonville.lat = 30.32;
        jacksonville.log = 81.66;
        jacksonville.neighbour.put(savannah, 140);
        jacksonville.neighbour.put(lakeCity, 113);
        jacksonville.neighbour.put(daytonaBeach, 92);

        japan.name = "japan";
        japan.lat = 35.68;
        japan.log = 220.23;
        japan.neighbour.put(pointReyes, 5131);
        japan.neighbour.put(sanLuisObispo, 5451);

        kansasCity.name = "kansasCity";
        kansasCity.lat = 39.08;
        kansasCity.log = 94.56;
        kansasCity.neighbour.put(tulsa, 249);
        kansasCity.neighbour.put(stLouis, 256);
        kansasCity.neighbour.put(wichita, 190);

        keyWest.name = "keyWest";
        keyWest.lat = 24.56;
        keyWest.log = 81.78;
        keyWest.neighbour.put(tampa, 446);

        lafayette.name = "lafayette";
        lafayette.lat = 30.21;
        lafayette.log = 92.03;
        lafayette.neighbour.put(beaumont, 122);
        lafayette.neighbour.put(batonRouge, 50);

        lakeCity.name = "lakeCity";
        lakeCity.lat = 30.19;
        lakeCity.log = 82.64;
        lakeCity.neighbour.put(tampa, 169);
        lakeCity.neighbour.put(tallahassee, 104);
        lakeCity.neighbour.put(jacksonville, 113);

        laredo.name = "laredo";
        laredo.lat = 27.52;
        laredo.log = 99.49;
        laredo.neighbour.put(sanAntonio, 154);
        laredo.neighbour.put(mexico, 741);

        lasVegas.name = "lasVegas";
        lasVegas.lat = 36.19;
        lasVegas.log = 115.22;
        lasVegas.neighbour.put(losAngeles, 275);
        lasVegas.neighbour.put(saltLakeCity, 486);

        lincoln.name = "lincoln";
        lincoln.lat = 40.81;
        lincoln.log = 96.68;
        lincoln.neighbour.put(wichita, 277);
        lincoln.neighbour.put(omaha, 58);

        littleRock.name = "littleRock";
        littleRock.lat = 34.74;
        littleRock.log = 92.33;
        littleRock.neighbour.put(memphis, 137);
        littleRock.neighbour.put(tulsa, 276);

        losAngeles.name = "losAngeles";
        losAngeles.lat = 34.03;
        losAngeles.log = 118.17;
        losAngeles.neighbour.put(sanDiego, 124);
        losAngeles.neighbour.put(sanLuisObispo, 182);
        losAngeles.neighbour.put(bakersfield, 112);
        losAngeles.neighbour.put(lasVegas, 275);

        macon.name = "macon";
        macon.lat = 32.83;
        macon.log = 83.65;
        macon.neighbour.put(atlanta, 82);
        macon.neighbour.put(albanyGA, 106);

        medford.name = "medford";
        medford.lat = 42.33;
        medford.log = 122.86;
        medford.neighbour.put(redding, 150);
        medford.neighbour.put(eugene, 165);

        memphis.name = "memphis";
        memphis.lat = 35.12;
        memphis.log = 89.97;
        memphis.neighbour.put(nashville, 210);
        memphis.neighbour.put(littleRock, 137);

        mexia.name = "mexia";
        mexia.lat = 31.68;
        mexia.log = 96.48;
        mexia.neighbour.put(dallas, 83);
        mexia.neighbour.put(houston, 165);

        mexico.name = "mexico";
        mexico.lat = 19.40;
        mexico.log = 99.12;
        mexico.neighbour.put(laredo, 741);

        miami.name = "miami";
        miami.lat = 25.79;
        miami.log = 80.22;
        miami.neighbour.put(westPalmBeach, 67);

        midland.name = "midland";
        midland.lat = 43.62;
        midland.log = 84.23;
        midland.neighbour.put(toledo, 82);
        midland.neighbour.put(chicago, 279);

        milwaukee.name = "milwaukee";
        milwaukee.lat = 43.05;
        milwaukee.log = 87.96;
        milwaukee.neighbour.put(chicago, 90);
        milwaukee.neighbour.put(greenBay, 117);

        minneapolis.name = "minneapolis";
        minneapolis.lat = 44.96;
        minneapolis.log = 93.27;
        minneapolis.neighbour.put(winnipeg, 463);
        minneapolis.neighbour.put(greenBay, 304);
        minneapolis.neighbour.put(desMoines, 246);

        modesto.name = "modesto";
        modesto.lat = 37.66;
        modesto.log = 120.99;
        modesto.neighbour.put(stockton, 29);
        modesto.neighbour.put(fresno, 109);

        montreal.name = "montreal";
        montreal.lat = 45.50;
        montreal.log = 73.67;
        montreal.neighbour.put(ottawa, 132);
        montreal.neighbour.put(albanyNY, 226);

        nashville.name = "nashville";
        nashville.lat = 36.15;
        nashville.log = 86.76;
        nashville.neighbour.put(chattanooga, 129);
        nashville.neighbour.put(memphis, 210);

        newHaven.name = "newHaven";
        newHaven.lat = 41.31;
        newHaven.log = 72.92;
        newHaven.neighbour.put(providence, 110);
        newHaven.neighbour.put(stamford, 92);

        newOrleans.name = "newOrleans";
        newOrleans.lat = 29.97;
        newOrleans.log = 90.06;
        newOrleans.neighbour.put(pensacola, 268);
        newOrleans.neighbour.put(batonRouge, 80);

        newYork.name = "newYork";
        newYork.lat = 40.70;
        newYork.log = 73.92;
        newYork.neighbour.put(philadelphia, 101);

        norfolk.name = "norfolk";
        norfolk.lat = 36.89;
        norfolk.log = 76.26;
        norfolk.neighbour.put(richmond, 92);
        norfolk.neighbour.put(raleigh, 174);

        oakland.name = "oakland";
        oakland.lat = 37.80;
        oakland.log = 122.23;
        oakland.neighbour.put(sanFrancisco, 8);
        oakland.neighbour.put(sanJose, 42);

        oklahomaCity.name = "oklahomaCity";
        oklahomaCity.lat = 35.48;
        oklahomaCity.log = 97.53;
        oklahomaCity.neighbour.put(tulsa, 105);
        oklahomaCity.neighbour.put(ftWorth, 209);

        omaha.name = "omaha";
        omaha.lat = 41.26;
        omaha.log = 96.01;
        omaha.neighbour.put(desMoines, 135);
        omaha.neighbour.put(lincoln, 58);

        orlando.name = "orlando";
        orlando.lat = 28.53;
        orlando.log = 81.38;
        orlando.neighbour.put(westPalmBeach, 168);
        orlando.neighbour.put(tampa, 84);
        orlando.neighbour.put(daytonaBeach, 54);

        ottawa.name = "ottawa";
        ottawa.lat = 45.42;
        ottawa.log = 75.69;
        ottawa.neighbour.put(toronto, 269);
        ottawa.neighbour.put(montreal, 132);

        pensacola.name = "pensacola";
        pensacola.lat = 30.44;
        pensacola.log = 87.21;
        pensacola.neighbour.put(tallahassee, 120);
        pensacola.neighbour.put(newOrleans, 268);

        philadelphia.name = "philadelphia";
        philadelphia.lat = 40.72;
        philadelphia.log = 76.12;
        philadelphia.neighbour.put(pittsburgh, 319);
        philadelphia.neighbour.put(newYork, 101);
        philadelphia.neighbour.put(uk1, 3548);
        philadelphia.neighbour.put(uk2, 3548);
        philadelphia.neighbour.put(baltimore, 102);
        philadelphia.neighbour.put(europe, 3939);

        phoenix.name = "phoenix";
        phoenix.lat = 33.53;
        phoenix.log = 112.08;
        phoenix.neighbour.put(tucson, 117);
        phoenix.neighbour.put(yuma, 178);

        pittsburgh.name = "pittsburgh";
        pittsburgh.lat = 40.40;
        pittsburgh.log = 79.84;
        pittsburgh.neighbour.put(cleveland, 157);
        pittsburgh.neighbour.put(philadelphia, 319);

        pointReyes.name = "pointReyes";
        pointReyes.lat = 38.07;
        pointReyes.log = 122.81;
        pointReyes.neighbour.put(redding, 215);
        pointReyes.neighbour.put(sacramento, 115);
        pointReyes.neighbour.put(japan, 5131);

        portland.name = "portland";
        portland.lat = 45.52;
        portland.log = 122.64;
        portland.neighbour.put(seattle, 174);
        portland.neighbour.put(salem, 47);
        portland.neighbour.put(boise, 428);

        providence.name = "providence";
        providence.lat = 41.80;
        providence.log = 71.36;
        providence.neighbour.put(boston, 51);
        providence.neighbour.put(newHaven, 110);

        provo.name = "provo";
        provo.lat = 40.24;
        provo.log = 111.66;
        provo.neighbour.put(grandJunction, 220);

        raleigh.name = "raleigh";
        raleigh.lat = 35.82;
        raleigh.log = 78.64;
        raleigh.neighbour.put(greensboro, 74);
        raleigh.neighbour.put(norfolk, 174);

        redding.name = "redding";
        redding.lat = 40.58;
        redding.log = 122.37;
        redding.neighbour.put(medford, 150);
        redding.neighbour.put(pointReyes, 215);

        reno.name = "reno";
        reno.lat = 39.53;
        reno.log = 119.82;
        reno.neighbour.put(saltLakeCity, 520);
        reno.neighbour.put(sacramento, 133);

        richmond.name = "richmond";
        richmond.lat = 37.54;
        richmond.log = 77.46;
        richmond.neighbour.put(washington, 105);
        richmond.neighbour.put(norfolk, 92);

        rochester.name = "rochester";
        rochester.lat = 43.17;
        rochester.log = 77.61;
        rochester.neighbour.put(albanyNY, 148);
        rochester.neighbour.put(buffalo, 64);

        sacramento.name = "sacramento";
        sacramento.lat = 38.56;
        sacramento.log = 121.47;
        sacramento.neighbour.put(sanFrancisco, 95);
        sacramento.neighbour.put(stockton, 51);
        sacramento.neighbour.put(pointReyes, 115);
        sacramento.neighbour.put(reno, 133);

        salem.name = "salem";
        salem.lat = 44.93;
        salem.log = 123.03;
        salem.neighbour.put(eugene, 63);
        salem.neighbour.put(portland, 47);

        salinas.name = "salinas";
        salinas.lat = 36.68;
        salinas.log = 121.64;
        salinas.neighbour.put(sanJose, 31);
        salinas.neighbour.put(sanLuisObispo, 137);

        saltLakeCity.name = "saltLakeCity";
        saltLakeCity.lat = 40.75;
        saltLakeCity.log = 111.89;
        saltLakeCity.neighbour.put(boise, 349);
        saltLakeCity.neighbour.put(lasVegas, 486);
        saltLakeCity.neighbour.put(reno, 520);

        sanAntonio.name = "sanAntonio";
        sanAntonio.lat = 29.45;
        sanAntonio.log = 98.51;
        sanAntonio.neighbour.put(austin, 79);
        sanAntonio.neighbour.put(elPaso, 580);
        sanAntonio.neighbour.put(laredo, 154);

        sanDiego.name = "sanDiego";
        sanDiego.lat = 32.78;
        sanDiego.log = 117.15;
        sanDiego.neighbour.put(yuma, 172);
        sanDiego.neighbour.put(losAngeles, 124);

        sanFrancisco.name = "sanFrancisco";
        sanFrancisco.lat = 37.76;
        sanFrancisco.log = 122.44;
        sanFrancisco.neighbour.put(oakland, 8);
        sanFrancisco.neighbour.put(sacramento, 95);

        sanJose.name = "sanJose";
        sanJose.lat = 37.30;
        sanJose.log = 121.87;
        sanJose.neighbour.put(salinas, 31);
        sanJose.neighbour.put(oakland, 42);

        sanLuisObispo.name = "sanLuisObispo";
        sanLuisObispo.lat = 35.47;
        sanLuisObispo.log = 120.66;
        sanLuisObispo.neighbour.put(salinas, 137);
        sanLuisObispo.neighbour.put(losAngeles, 182);
        sanLuisObispo.neighbour.put(japan, 5451);

        santaFe.name = "santaFe";
        santaFe.lat = 35.67;
        santaFe.log = 105.96;
        santaFe.neighbour.put(coloradoSprings, 316);
        santaFe.neighbour.put(albuquerque, 61);

        saultSteMarie.name = "saultSteMarie";
        saultSteMarie.lat = 46.49;
        saultSteMarie.log = 84.35;
        saultSteMarie.neighbour.put(thunderBay, 442);
        saultSteMarie.neighbour.put(toronto, 436);

        savannah.name = "savannah";
        savannah.lat = 32.05;
        savannah.log = 81.10;
        savannah.neighbour.put(jacksonville, 140);
        savannah.neighbour.put(augusta, 131);

        seattle.name = "seattle";
        seattle.lat = 47.63;
        seattle.log = 122.33;
        seattle.neighbour.put(vancouver, 115);
        seattle.neighbour.put(portland, 174);

        stLouis.name = "stLouis";
        stLouis.lat = 38.63;
        stLouis.log = 90.24;
        stLouis.neighbour.put(kansasCity, 256);
        stLouis.neighbour.put(indianapolis, 246);

        stamford.name = "stamford";
        stamford.lat = 41.07;
        stamford.log = 73.54;
        stamford.neighbour.put(newHaven, 92);

        stockton.name = "stockton";
        stockton.lat = 37.98;
        stockton.log = 121.30;
        stockton.neighbour.put(sacramento, 51);
        stockton.neighbour.put(modesto, 29);

        tallahassee.name = "tallahassee";
        tallahassee.lat = 30.45;
        tallahassee.log = 84.27;
        tallahassee.neighbour.put(pensacola, 120);
        tallahassee.neighbour.put(lakeCity, 104);
        tallahassee.neighbour.put(albanyGA, 120);

        tampa.name = "tampa";
        tampa.lat = 27.97;
        tampa.log = 82.46;
        tampa.neighbour.put(orlando, 84);
        tampa.neighbour.put(lakeCity, 169);
        tampa.neighbour.put(keyWest, 446);

        thunderBay.name = "thunderBay";
        thunderBay.lat = 48.38;
        thunderBay.log = 89.25;
        thunderBay.neighbour.put(winnipeg, 440);
        thunderBay.neighbour.put(saultSteMarie, 442);

        toledo.name = "toledo";
        toledo.lat = 41.67;
        toledo.log = 83.58;
        toledo.neighbour.put(midland, 82);

        toronto.name = "toronto";
        toronto.lat = 43.65;
        toronto.log = 79.38;
        toronto.neighbour.put(saultSteMarie, 436);
        toronto.neighbour.put(ottawa, 269);
        toronto.neighbour.put(buffalo, 105);

        tucson.name = "tucson";
        tucson.lat = 32.21;
        tucson.log = 110.92;
        tucson.neighbour.put(phoenix, 117);
        tucson.neighbour.put(elPaso, 320);

        tulsa.name = "tulsa";
        tulsa.lat = 36.13;
        tulsa.log = 95.94;
        tulsa.neighbour.put(oklahomaCity, 105);
        tulsa.neighbour.put(littleRock, 276);
        tulsa.neighbour.put(kansasCity, 249);

        uk1.name = "uk1";
        uk1.lat = 51.30;
        uk1.log = 0.00;
        uk1.neighbour.put(philadelphia, 3548);

        uk2.name = "uk2";
        uk2.lat = 51.30;
        uk2.log = 0.00;
        uk2.neighbour.put(philadelphia, 3548);

        vancouver.name = "vancouver";
        vancouver.lat = 49.25;
        vancouver.log = 123.10;
        vancouver.neighbour.put(seattle, 115);
        vancouver.neighbour.put(calgary, 605);

        washington.name = "washington";
        washington.lat = 38.91;
        washington.log = 77.01;
        washington.neighbour.put(richmond, 105);
        washington.neighbour.put(baltimore, 45);

        westPalmBeach.name = "westPalmBeach";
        westPalmBeach.lat = 26.71;
        westPalmBeach.log = 80.05;
        westPalmBeach.neighbour.put(orlando, 168);
        westPalmBeach.neighbour.put(miami, 67);

        wichita.name = "wichita";
        wichita.lat = 37.69;
        wichita.log = 97.34;
        wichita.neighbour.put(lincoln, 277);
        wichita.neighbour.put(denver, 523);
        wichita.neighbour.put(kansasCity, 190);

        winnipeg.name = "winnipeg";
        winnipeg.lat = 49.90;
        winnipeg.log = 97.13;
        winnipeg.neighbour.put(thunderBay, 440);
        winnipeg.neighbour.put(minneapolis, 463);
        winnipeg.neighbour.put(calgary, 829);

        yuma.name = "yuma";
        yuma.lat = 32.69;
        yuma.log = 114.62;
        yuma.neighbour.put(sanDiego, 172);
        yuma.neighbour.put(phoenix, 178);

        Node start = new Node();
        Node end = new Node();

        for (int i = 0; i < allCities.size(); i++) {
            if ((allCities.get(i).name).equals(args[1])) {
                start = allCities.get(i);
            }
            if ((allCities.get(i).name).equals(args[2])) {
                end = allCities.get(i);
            }
        }
        for (Iterator iterator = allCities.iterator(); iterator.hasNext();) {
            Node node = (Node) iterator.next();
            Set<Entry<Node, Integer>> neighbours = node.neighbour.entrySet();

            for (Entry<Node, Integer> neighbour : neighbours) {
                neighbour.getKey().neighbour.put(node, neighbour.getValue());
            }

        }
        if (searchType.equals("astar")) {
            searchAStar(start, end);
        } else if (searchType.equals("uniform")) {
            searchUniform(start, end);
        } else if (searchType.equals("greedy")) {
            searchGreedy(start, end);
        }

    }

    static void searchAStar(Node current, Node goal) {
        if (current.name.equals(goal.name)) {

            System.out.print("Expanded Cities: ");
            for (int i = 0; i < expanded.size(); i++) {
                System.out.print(((Node) expanded.get(i)).name + ", ");
            }

            System.out.println();
            System.out.println("Total nodes expanded: " + expanded.size());

            finalpath.add(current);
            int n = 0;
            int distance = 0;

            System.out.print("Cities in the solution path : ");
            if (map.isEmpty()) {
                System.out.print(current.name);
                System.out.println("-");
                System.out.println("Total number of cities in the path: " + 1);
                System.out.println("Total distance between these cities: " + 0);
            } else {
                do {
                    Path p = (Path) map.get(current);
                    current = p.city1;
                    distance = distance + p.dist;

                    n++;
                    finalpath.add(current);
                } while (finalpath.getLast().name != expanded.get(0).name);

                while (!finalpath.isEmpty()) {
                    System.out.print(finalpath.removeLast().name + ", ");
                }

                System.out.println("-");
                System.out.println("Total number of cities in the path: " + (n + 1));
                System.out.println("Total distance between these cities: " + distance);
            }
        } else {
            expanded.add(current);

            for (Entry<Node, Integer> path : current.neighbour.entrySet()) {
                int g = 0;
                double h;

                g = (Integer) path.getValue() + parentcost(current);
                h = heuristic(path.getKey(), goal);

                Path newpath = new Path();
                newpath.city1 = current;
                newpath.city2 = path.getKey();
                newpath.h = h;
                newpath.g = g;

                newpath.dist = path.getValue();
                allPaths.add(newpath);
            }
            Path p;
            while (true) {
                p = allPaths.poll();
                if (!expanded.contains(p.city2)) {
                    break;
                }
            }
            map.put(p.city2, p);
            searchAStar(p.city2, goal);

        }
    }

    static void searchUniform(Node current, Node goal) {

        if (current.name.equals(goal.name)) {

            System.out.print("Expanded Cities: ");
            for (int i = 0; i < expanded.size(); i++) {
                System.out.print(((Node) expanded.get(i)).name + ", ");
            }

            System.out.println();
            System.out.println("total nodes expanded: " + expanded.size());

            finalpath.add(current);
            int n = 0;
            int distance = 0;

            System.out.print("Cities in the solution path : ");
            if (map.isEmpty()) {
                System.out.print(current.name);
                System.out.println("-");
                System.out.println("Total number of cities in the path: " + 1);
                System.out.println("Total distance between these cities: " + 0);
            } else {
                do {
                    Path p = (Path) map.get(current);
                    current = p.city1;
                    distance = distance + p.dist;

                    n++;
                    finalpath.add(current);
                } while (finalpath.getLast().name != expanded.get(0).name);

                while (!finalpath.isEmpty()) {
                    System.out.print(finalpath.removeLast().name + ", ");
                }

                System.out.println("-");
                System.out.println("Total number of cities in the path: " + (n + 1));
                System.out.println("Total distance between these cities: " + distance);
            }
        } else {
            expanded.add(current);

            for (Entry<Node, Integer> path : current.neighbour.entrySet()) {
                int g = 0;
                double h = 0.0;

                g = (Integer) path.getValue() + parentcost(current);
                Path newpath = new Path();
                newpath.city1 = current;
                newpath.city2 = path.getKey();
                newpath.h = h;
                newpath.g = g;

                newpath.dist = path.getValue();
                allPaths.add(newpath);
            }
            Path p;
            while (true) {
                p = allPaths.poll();
                if (!expanded.contains(p.city2)) {
                    break;
                }
            }
            map.put(p.city2, p);
            searchUniform(p.city2, goal);

        }
    }

    static void searchGreedy(Node current, Node goal) {

        if (current.name.equals(goal.name)) {

            System.out.print("Expanded Cities: ");
            for (int i = 0; i < expanded.size(); i++) {
                System.out.print(((Node) expanded.get(i)).name + ", ");
            }

            System.out.println();
            System.out.println("total nodes expanded: " + expanded.size());

            finalpath.add(current);
            int n = 0;
            int distance = 0;

            System.out.print("Cities in the solution path : ");
            if (map.isEmpty()) {
                System.out.print(current.name);
                System.out.println("-");
                System.out.println("Total number of cities in the path: " + 1);
                System.out.println("Total distance between these cities: " + 0);
            } else {
                do {
                    Path p = (Path) map.get(current);
                    current = p.city1;
                    distance = distance + p.dist;

                    n++;
                    finalpath.add(current);
                } while (finalpath.getLast().name != expanded.get(0).name);

                while (!finalpath.isEmpty()) {
                    System.out.print(finalpath.removeLast().name + ", ");
                }

                System.out.println("-");
                System.out.println("Total number of cities in the path: " + (n + 1));
                System.out.println("Total distance between these cities: " + distance);
            }
        } else {
            expanded.add(current);

            for (Entry<Node, Integer> path : current.neighbour.entrySet()) {
                int g = 0;
                double h = 0.0;

                h = heuristic(path.getKey(), goal);
                Path newpath = new Path();
                newpath.city1 = current;
                newpath.city2 = path.getKey();
                newpath.h = h;
                newpath.g = g;

                newpath.dist = path.getValue();
                allPaths.add(newpath);
            }
            Path p;
            while (true) {
                p = allPaths.poll();
                if (!expanded.contains(p.city2)) {
                    break;
                }
            }
            map.put(p.city2, p);
            searchGreedy(p.city2, goal);

        }
    }

    public static int parentcost(Node current) {
        LinkedList<Node> gpath = new LinkedList<Node>();
        gpath.add(current);
        int g = 0;
        if (!map.isEmpty()) {
            while (gpath.getLast().name != expanded.get(0).name) {

                Path p = (Path) map.get(current);
                current = p.city1;
                g = g + p.dist;
                gpath.add(current);
            }
        }
        gpath.clear();
        return g;
    }

    public static double heuristic(Node city1, Node city2) {
        double d = Math.sqrt(Math.pow((69.5 * (city1.lat - city2.lat)), 2)
                + Math.pow((69.5 * Math.cos((city1.lat + city2.lat) / 360 * 3.141593f) * (city1.log - city2.log)), 2));
        return d;
    }

}

class Node {

    String name;
    double log;
    double lat;
    Map<Node, Integer> neighbour;

    public Node() {
        neighbour = new HashMap();
    }
}

class Path implements Comparable {

    Node city1;
    Node city2;
    double h;
    int g;
    int dist;

    @Override
    public int compareTo(Object p2) {
        Path p = (Path) p2;
        return (int) ((this.g + this.h) - (p.g + p.h));
    }
}
