public class Chrono {
    private int h, m ,s;

    public Chrono(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public String toString(){
        return this.h+"h "+this.m+"m "+this.s+"s";
    }

    public int toSeconds(){
        int res = 0;
        res += this.h * 3600;
        res += this.m * 60;
        res += this.s;
        return res;
    }

    public void normalise(){
        if (this.s > 59){
            int minutes = this.s / 60; 
            this.m += minutes;
            this.s -= 60 * minutes;
        }else if (this.m > 59){
            int heures = this.m / 60;
            this.h += heures;
            this.m -= 60 * heures;
        }
    }

    public boolean equals(Chrono c){
        return this.toSeconds() == c.toSeconds();
    }

    public boolean avant(Chrono c){
        return this.toSeconds() <= c.toSeconds();
    }

    public void avance(int n){
        this.s += n;
        this.normalise();
    }

    public Chrono diff(Chrono c){
        int thisTime = this.toSeconds();
        int cTime = c.toSeconds();
        int ecart = cTime - thisTime;
        Chrono diff = new Chrono(0,0,0);
        diff.avance(ecart);
        diff.normalise();
        return diff;
    }

    public static void main(String[] args) {
        Chrono c1 = new Chrono(10, 15, 33);
        System.out.println(c1.toString());
        System.out.println(c1.toSeconds());
        Chrono c2 = new Chrono(10, 150, 33);
        System.out.println(c2.toString());
        c2.normalise();
        System.out.println(c2.toString());
        Chrono c3 = new Chrono(10, 250, 33);
        c3.normalise();
        System.out.println(c3.toString());
        System.out.println(c2.avant(c3));
        Chrono c4 = new Chrono(3,10,50);
        System.out.println(c4.toString());
        c4.avance(100);
        System.out.println(c4.toString());
        System.out.println(c4.diff(c3));
    }
}
