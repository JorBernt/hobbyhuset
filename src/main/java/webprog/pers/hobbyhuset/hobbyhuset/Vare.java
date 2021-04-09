package webprog.pers.hobbyhuset.hobbyhuset;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Vare {

    private String vNr, betegnelse, hylle;
    private double pris;
    private int antall, katNr;

    public Vare(String vareNr, String betegnelse, String hylle, double pris, int antall, int katNr) {
        this.vNr = vareNr;
        this.betegnelse = betegnelse;
        this.hylle = hylle;
        this.pris = pris;
        this.antall = antall;
        this.katNr = katNr;
    }
}
