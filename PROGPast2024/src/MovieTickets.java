

// MovieTickets.java
//Question1
//Determine the top performing movie
//totalsales = {6200, 6300}
// movies = { Napolean, Oppenheimer}
public class MovieTickets implements IMovieTickets {
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0;
        for (int sales : movieTicketSales) {
            total += sales;
        }
        return total;
    }// use the override

    public String TopMovie(String[] movies, int[] totalSales) {
        int maxSales = 0;
        String topMovie = "";
        for (int i = 0; i < totalSales.length; i++) {
            if (totalSales[i] > maxSales) {
                maxSales = totalSales[i];
                topMovie = movies[i];
            }
        }
        return topMovie;
    }
}
