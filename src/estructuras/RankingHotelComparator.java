package estructuras;

import dominio.Hotel;

import java.util.Comparator;

public class RankingHotelComparator implements Comparator<Object> {
	@Override
	public int compare(Object obj1, Object obj2) {
		Hotel h1 = (Hotel) obj1, h2 = (Hotel) obj2;
		return (((int) h2.getRanking() - (int) h1.getRanking()));
	}
}