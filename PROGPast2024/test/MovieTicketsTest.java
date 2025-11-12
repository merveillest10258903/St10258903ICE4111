

import org.junit.Test;
import static org.junit.Assert.*;

public class MovieTicketsTest {

    @Test
    public void testTotalMovieSales() {
        MovieTickets mt = new MovieTickets();
        int[] sales = {3000, 1500, 1700};
        int total = mt.TotalMovieSales(sales);
        assertEquals(6200, total);
    }

    @Test
    public void testTopMovie() {
        MovieTickets mt = new MovieTickets();
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] totals = {6200, 6300};
        String top = mt.TopMovie(movies, totals);
        assertEquals("Oppenheimer", top);
    }
}
