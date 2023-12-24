public class CalcMilesService {
    public int calculate (int ticketPrice) {
        int bonusMile = 1;

        return ticketPrice / 20 * bonusMile;
    }
}
