//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13676;
        int bonusMile = 1;
        int milesAccrued = ticketPrice / 20 * bonusMile;

        System.out.println("Вам начислено: " + milesAccrued + " бонусных мили");

    }
}