 /* Tube zones - Michael Earl 29/09/15 */
import javax.swing.*;
import java.util.HashMap;


class tube {
    /**
       Prompt the user for a station name and return the corresponding zone if found
    **/
    public static void main (String[] param){
	String station = getParam("Which station do you need to know the zone of?: ");
        HashMap sm = initStations();
	getZone(station, sm);
	System.exit(0);
    }
    /** 
	getZone - get the tube zone of a station specified from a hashmap
	@param station String actual name of the station
	@param stationmap HashMap hashmap object containing station -> zone mapping
    **/
    public static void getZone (String station, HashMap stationmap){
	if (!stationmap.containsKey(station))
	    JOptionPane.showMessageDialog(null,"Station " + station + " not found!");
	else
      	JOptionPane.showMessageDialog(null, 
				      station + " is in zone " + 
				      stationmap.get(station)
				      );
    }
    public static String getParam (String prompt){
	String response = JOptionPane.showInputDialog(prompt);
	return response;
    }
    /**
       initStations - build the station -> zone mapping object
     **/
    public static HashMap initStations (){
	HashMap stationmap = new HashMap();
	stationmap.put("Acton Town", new Integer(3));
	stationmap.put("Aldgate", new Integer(1));
	stationmap.put("Aldgate East", new Integer(1));
	stationmap.put("All Saints", new Integer(2));
	stationmap.put("Alperton", new Integer(4));
	stationmap.put("Angel", new Integer(1));
	stationmap.put("Archway", new Integer(3));
	stationmap.put("Arnos Grove", new Integer(4));
	stationmap.put("Arsenal", new Integer(2));
	stationmap.put("Baker Street", new Integer(1));
	stationmap.put("Balham", new Integer(3));
	stationmap.put("Bank", new Integer(1));
	stationmap.put("Barbican", new Integer(1));
	stationmap.put("Barking", new Integer(4));
	stationmap.put("Barkingside", new Integer(5));
	stationmap.put("Barons Court", new Integer(2));
	stationmap.put("Bayswater", new Integer(1));
	stationmap.put("Beckton", new Integer(3));
	stationmap.put("Beckton Park", new Integer(3));
	stationmap.put("Becontree", new Integer(5));
	stationmap.put("Belsize Park", new Integer(2));
	stationmap.put("Bethnal Green", new Integer(2));
	stationmap.put("Blackfriars", new Integer(1));
	stationmap.put("Blackhorse Road", new Integer(3));
	stationmap.put("Blackwall", new Integer(2));
	stationmap.put("Bond Street", new Integer(1));
	stationmap.put("Borough", new Integer(1));
	stationmap.put("Boston Manor", new Integer(4));
	stationmap.put("Bounds Green", new Integer(4));
	stationmap.put("Bow Church", new Integer(2));
	stationmap.put("Bow Road", new Integer(2));
	stationmap.put("Brent Cross", new Integer(3));
	stationmap.put("Bromley-By-Bow", new Integer(3));
	stationmap.put("Burnt Oak", new Integer(4));
	stationmap.put("Caledonian Road", new Integer(2));
	stationmap.put("Camden Town", new Integer(2));
	stationmap.put("Canary Wharf", new Integer(2));
	stationmap.put("Cannon Street", new Integer(1));
	stationmap.put("Canons Park", new Integer(5));
	stationmap.put("Chalk Farm", new Integer(2));
	stationmap.put("Chancery Lane", new Integer(1));
	stationmap.put("Charing Cross", new Integer(1));
	stationmap.put("Chigwell", new Integer(5));
	stationmap.put("Chiswick Park", new Integer(3));
	stationmap.put("Clapham Common", new Integer(2));
	stationmap.put("Clapham North", new Integer(2));
	stationmap.put("Clapham South", new Integer(3));
	stationmap.put("Colindale", new Integer(4));
	stationmap.put("Colliers Wood", new Integer(3));
	stationmap.put("Covent Garden", new Integer(1));
	stationmap.put("Crossharbour & London Arena", new Integer(2));
	stationmap.put("Custom House", new Integer(3));
	stationmap.put("Cyprus", new Integer(3));
	stationmap.put("Dagenham East", new Integer(5));
	stationmap.put("Dagenham Heathway", new Integer(5));
	stationmap.put("Devons Road", new Integer(2));
	stationmap.put("Dollis Hill", new Integer(3));
	stationmap.put("Ealing Broadway", new Integer(3));
	stationmap.put("Ealing Common", new Integer(3));
	stationmap.put("Earl's Court", new Integer(2));
	stationmap.put("Eastcote", new Integer(5));
	stationmap.put("East Acton", new Integer(2));
	stationmap.put("East Finchley", new Integer(3));
	stationmap.put("East Ham", new Integer(4));
	stationmap.put("East India", new Integer(3));
	stationmap.put("East Putney", new Integer(3));
	stationmap.put("Edgware", new Integer(5));
	stationmap.put("Edgware Road (B)", new Integer(1));
	stationmap.put("Edgware Road (C)", new Integer(1));
	stationmap.put("Elephant & Castle", new Integer(2));
	stationmap.put("Elm Park", new Integer(6));
	stationmap.put("Embankment", new Integer(1));
	stationmap.put("Euston", new Integer(1));
	stationmap.put("Euston Square", new Integer(1));
	stationmap.put("Fairlop", new Integer(5));
	stationmap.put("Farringdon", new Integer(1));
	stationmap.put("Finchley Central", new Integer(4));
	stationmap.put("Finchley Road", new Integer(2));
	stationmap.put("Finsbury Park", new Integer(2));
	stationmap.put("Fulham Broadway", new Integer(2));
	stationmap.put("Gallions Reach", new Integer(3));
	stationmap.put("Gants Hill", new Integer(4));
	stationmap.put("Gloucester Road", new Integer(1));
	stationmap.put("Golders Green", new Integer(3));
	stationmap.put("Goldhawk Road", new Integer(2));
	stationmap.put("Goodge Street", new Integer(1));
	stationmap.put("Grange Hill", new Integer(5));
	stationmap.put("Great Portland Street", new Integer(1));
	stationmap.put("Greenford", new Integer(4));
	stationmap.put("Green Park", new Integer(1));
	stationmap.put("Gunnersbury", new Integer(3));
	stationmap.put("Hainault", new Integer(5));
	stationmap.put("Hammersmith", new Integer(2));
	stationmap.put("Hampstead", new Integer(3));
	stationmap.put("Hanger Lane", new Integer(3));
	stationmap.put("Harlesden", new Integer(3));
	stationmap.put("Harrow & Wealdston", new Integer(5));
	stationmap.put("Harrow-on-the-Hill", new Integer(5));
	stationmap.put("Hatton Cross", new Integer(6));
	stationmap.put("Heathrow Terminals 1, 2 & 3", new Integer(6));
	stationmap.put("Heathrow Terminal 4", new Integer(6));
	stationmap.put("Hendon Central", new Integer(4));
	stationmap.put("Heron Quays", new Integer(2));
	stationmap.put("High Street Kensington", new Integer(1));
	stationmap.put("Highbury & Islington", new Integer(2));
	stationmap.put("Highgate", new Integer(3));
	stationmap.put("Hillingdon", new Integer(6));
	stationmap.put("Holborn", new Integer(1));
	stationmap.put("Holland Park", new Integer(2));
	stationmap.put("Holloway Road", new Integer(2));
	stationmap.put("Hornchurch", new Integer(6));
	stationmap.put("Hounslow Central", new Integer(4));
	stationmap.put("Hounslow East", new Integer(4));
	stationmap.put("Hounslow West", new Integer(5));
	stationmap.put("Hyde Park Corner", new Integer(1));
	stationmap.put("Ickenham", new Integer(6));
	stationmap.put("Island Gardens", new Integer(2));
	stationmap.put("Kennington", new Integer(2));
	stationmap.put("Kensal Green", new Integer(2));
	stationmap.put("Kensington (Olympia)", new Integer(2));
	stationmap.put("Kentish Town", new Integer(2));
	stationmap.put("Kenton", new Integer(4));
	stationmap.put("Kew Gardens", new Integer(4));
	stationmap.put("Kilburn", new Integer(2));
	stationmap.put("Kilburn Park", new Integer(2));
	stationmap.put("Kingsbury", new Integer(4));
	stationmap.put("King's Cross St. Pancras", new Integer(1));
	stationmap.put("Knightsbridge", new Integer(1));
	stationmap.put("Ladbroke Grove", new Integer(2));
	stationmap.put("Lambeth North", new Integer(1));
	stationmap.put("Lancaster Gate", new Integer(1));
	stationmap.put("Latimer Road", new Integer(2));
	stationmap.put("Leicester Square", new Integer(1));
	stationmap.put("Leyton", new Integer(3));
	stationmap.put("Leytonstone", new Integer(4));
	stationmap.put("Limehouse", new Integer(2));
	stationmap.put("Liverpool Street", new Integer(1));
	stationmap.put("London Bridge", new Integer(1));
	stationmap.put("Maida Vale", new Integer(2));
	stationmap.put("Manor House", new Integer(3));
	stationmap.put("Mansion House", new Integer(1));
	stationmap.put("Marble Arch", new Integer(1));
	stationmap.put("Marylebone", new Integer(1));
	stationmap.put("Mile End", new Integer(2));
	stationmap.put("Mill Hill East", new Integer(4));
	stationmap.put("Monument", new Integer(1));
	stationmap.put("Moorgate", new Integer(1));
	stationmap.put("Moor Park", new Integer(7));
	stationmap.put("Morden", new Integer(4));
	stationmap.put("Mornington Crescent", new Integer(2));
	stationmap.put("Mudchute", new Integer(2));
	stationmap.put("Neasden", new Integer(3));
	stationmap.put("Newbury Park", new Integer(4));
	stationmap.put("Northfields", new Integer(3));
	stationmap.put("Northolt", new Integer(5));
	stationmap.put("Northwick Park", new Integer(4));
	stationmap.put("Northwood", new Integer(6));
	stationmap.put("Northwood Hills", new Integer(6));
	stationmap.put("North Acton", new Integer(3));
	stationmap.put("North Ealing", new Integer(3));
	stationmap.put("North Harrow", new Integer(5));
	stationmap.put("North Wembley", new Integer(4));
	stationmap.put("Notting Hill Gate", new Integer(2));
	stationmap.put("Old Street", new Integer(1));
	stationmap.put("Osterley", new Integer(4));
	stationmap.put("Oval", new Integer(2));
	stationmap.put("Oxford Circus", new Integer(1));
	stationmap.put("Paddington", new Integer(1));
	stationmap.put("Park Royal", new Integer(3));
	stationmap.put("Parsons Green", new Integer(2));
	stationmap.put("Perivale", new Integer(4));
	stationmap.put("Picadilly Circus", new Integer(1));
	stationmap.put("Pimlico", new Integer(1));
	stationmap.put("Pinner", new Integer(5));
	stationmap.put("Plaistow", new Integer(3));
	stationmap.put("Poplar", new Integer(2));
	stationmap.put("Preston Road", new Integer(4));
	stationmap.put("Prince Regent", new Integer(3));
	stationmap.put("Putney Bridge", new Integer(2));
	stationmap.put("Queen's Park", new Integer(2));
	stationmap.put("Queensbury", new Integer(4));
	stationmap.put("Queensway", new Integer(1));
	stationmap.put("Ravenscourt Park", new Integer(2));
	stationmap.put("Rayners Lane", new Integer(5));
	stationmap.put("Redbridge", new Integer(4));
	stationmap.put("Regent's Park", new Integer(1));
	stationmap.put("Richmond", new Integer(4));
	stationmap.put("Roding Valley", new Integer(5));
	stationmap.put("Rotherhithe", new Integer(2));
	stationmap.put("Royal Albert", new Integer(3));
	stationmap.put("Royal Oak", new Integer(2));
	stationmap.put("Royal Victoria", new Integer(3));
	stationmap.put("Ruislip", new Integer(6));
	stationmap.put("Ruislip Manor", new Integer(6));
	stationmap.put("Russell Square", new Integer(1));
	stationmap.put("Seven Sisters", new Integer(3));
	stationmap.put("Shadwell", new Integer(2));
	stationmap.put("Shepherd's Bush (C)", new Integer(2));
	stationmap.put("Shepherd's Bush (H)", new Integer(2));
	stationmap.put("Shoreditch", new Integer(2));
	stationmap.put("Sloane Square", new Integer(1));
	stationmap.put("Snaresbrook", new Integer(4));
	stationmap.put("Southfields", new Integer(3));
	stationmap.put("South Ealing", new Integer(3));
	stationmap.put("South Harrow", new Integer(5));
	stationmap.put("South Kensington", new Integer(1));
	stationmap.put("South Kenton", new Integer(4));
	stationmap.put("South Quay", new Integer(2));
	stationmap.put("South Ruislip", new Integer(5));
	stationmap.put("South Wimbledon", new Integer(4));
	stationmap.put("South Woodford", new Integer(4));
	stationmap.put("Stamford Brook", new Integer(2));
	stationmap.put("Stanmore", new Integer(5));
	stationmap.put("Stepney Green", new Integer(2));
	stationmap.put("Stockwell", new Integer(2));
	stationmap.put("Stonebridge Park", new Integer(3));
	stationmap.put("Stratford", new Integer(3));
	stationmap.put("St. James's Park", new Integer(1));
	stationmap.put("St. John's Wood", new Integer(2));
	stationmap.put("St. Paul's", new Integer(1));
	stationmap.put("Sudbury Hill", new Integer(4));
	stationmap.put("Sudbury Town", new Integer(4));
	stationmap.put("Surrey Quays", new Integer(2));
	stationmap.put("Swiss Cottage", new Integer(2));
	stationmap.put("Temple", new Integer(1));
	stationmap.put("Tooting Bec", new Integer(3));
	stationmap.put("Tooting Broadway", new Integer(3));
	stationmap.put("Tottenham Court Road", new Integer(1));
	stationmap.put("Tottenham Hale", new Integer(3));
	stationmap.put("Tower Gateway", new Integer(1));
	stationmap.put("Tower Hill", new Integer(1));
	stationmap.put("Tufnell Park", new Integer(2));
	stationmap.put("Turnham Green", new Integer(3));
	stationmap.put("Turnpike Lane", new Integer(3));
	stationmap.put("Upminster", new Integer(6));
	stationmap.put("Upminster Bridge", new Integer(6));
	stationmap.put("Upney", new Integer(4));
	stationmap.put("Upton Park", new Integer(3));
	stationmap.put("Uxbridge", new Integer(6));
	stationmap.put("Vauxhall", new Integer(2));
	stationmap.put("Victoria", new Integer(1));
	stationmap.put("Walthamstow Central", new Integer(3));
	stationmap.put("Wanstead", new Integer(4));
	stationmap.put("Wapping", new Integer(2));
	stationmap.put("Warren Street", new Integer(1));
	stationmap.put("Warwick Avenue", new Integer(2));
	stationmap.put("Waterloo", new Integer(1));
	stationmap.put("Wembley Central", new Integer(4));
	stationmap.put("Wembley Park", new Integer(4));
	stationmap.put("Westbourne Park", new Integer(2));
	stationmap.put("Westferry", new Integer(2));
	stationmap.put("Westminster", new Integer(1));
	stationmap.put("West Acton", new Integer(3));
	stationmap.put("West Brompton", new Integer(2));
	stationmap.put("West Finchley", new Integer(4));
	stationmap.put("West Ham", new Integer(3));
	stationmap.put("West Hampstead", new Integer(2));
	stationmap.put("West Harrow", new Integer(5));
	stationmap.put("West India Quay", new Integer(2));
	stationmap.put("West Kensington", new Integer(2));
	stationmap.put("West Ruislip", new Integer(6));
	stationmap.put("Whitechapel", new Integer(2));
	stationmap.put("White City", new Integer(2));
	stationmap.put("Willesden Green", new Integer(3));
	stationmap.put("Willesden Junction", new Integer(3));
	stationmap.put("Wimbledon", new Integer(3));
	stationmap.put("Wimbledon Park", new Integer(3));
	stationmap.put("Woodford", new Integer(4));
	stationmap.put("Woodside Park", new Integer(4));
	stationmap.put("Wood Green", new Integer(3));
	stationmap.put("Brixton", new Integer(2));
	stationmap.put("Amersham", new Integer(10));
	stationmap.put("Bermondsey", new Integer(2));
	stationmap.put("Chesham", new Integer(10));
	stationmap.put("Chalfont & Latimer", new Integer(9));
	stationmap.put("Chorleywood", new Integer(8));
	stationmap.put("Rickmansworth", new Integer(7));
	stationmap.put("Croxley", new Integer(7));
	stationmap.put("Watford", new Integer(8));
	stationmap.put("Ruislip Gardens", new Integer(5));
	stationmap.put("High Barnet", new Integer(5));
	stationmap.put("Totteridge & Whetstone", new Integer(4));
	stationmap.put("Cockfosters", new Integer(5));
	stationmap.put("Oakwood", new Integer(5));
	stationmap.put("Southgate", new Integer(4));
	stationmap.put("Epping", new Integer(6));
	stationmap.put("Theydon Bois", new Integer(6));
	stationmap.put("Debden", new Integer(6));
	stationmap.put("Loughton", new Integer(6));
	stationmap.put("Buckhurst Hill", new Integer(5));
	stationmap.put("Pudding Mill Lane", new Integer(3));
	stationmap.put("Southwark", new Integer(1));
	stationmap.put("Canada Water", new Integer(2));
	stationmap.put("Canning Town", new Integer(3));
	stationmap.put("North Greenwich", new Integer(3));
	stationmap.put("Cutty Sark", new Integer(3));
	stationmap.put("Greenwich", new Integer(3));
	stationmap.put("Deptford Bridge", new Integer(3));
	stationmap.put("Elverson Road", new Integer(3));
	stationmap.put("Lewisham", new Integer(3));
	stationmap.put("New Cross", new Integer(2));
	stationmap.put("New Cross Gate", new Integer(2));
	stationmap.put("West Silvertown", new Integer(3));
	stationmap.put("King George V", new Integer(3));
	stationmap.put("Pontoon Dock", new Integer(3));
	stationmap.put("London City Airport", new Integer(3));
	return stationmap;
    }
}