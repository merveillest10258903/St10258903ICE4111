
// Main.java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[][] ticketSales = {
            {3000, 1500, 1700}, // Napoleon
            {3500, 1200, 1600}  // Oppenheimer
        };

        MovieTickets movieTickets = new MovieTickets();
        int[] totalSales = new int[movies.length];

        System.out.println("Movie Report:");
        System.out.println("Movie\t\tJan\tFeb\tMar\tTotal");

        for (int i = 0; i < movies.length; i++) {
            int total = movieTickets.TotalMovieSales(ticketSales[i]);
            totalSales[i] = total;
            System.out.println(movies[i] + "\t" 
                + ticketSales[i][0] + "\t" 
                + ticketSales[i][1] + "\t" 
                + ticketSales[i][2] + "\t" 
                + total);
        }

        String topMovie = movieTickets.TopMovie(movies, totalSales);
        System.out.println("\nTop Performing Movie: " + topMovie);
    }
}
