package hw12;

public class Plane {
    private Pilot pp;
    private Stuards ss;
    private Laggage ll;
    private Passanger pass;

    public Plane(Pilot pp, Stuards ss, Laggage ll, Passanger pass) {
        this.pp = pp;
        this.ss = ss;
        this.ll = ll;
        this.pass = pass;
    }

    public Pilot getPp() {
        return pp;
    }

    public Stuards getSs() {
        return ss;
    }

    public Laggage getLl() {
        return ll;
    }

    public Passanger getPass() {
        return pass;
    }
}
