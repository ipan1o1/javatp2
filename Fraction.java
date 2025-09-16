public class Fraction {
    private int n, d;

    public Fraction(int n, int d){
        this.n = n;
        this.d = d;
        if (d<0){
            System.out.println("Le dénominateur doit etre positif! ");
        }
    }

    public String toString(){
        if (d==1){
            return ""+this.n;
        }else{
            return this.n+"/"+this.d;
        }
    }

    public Fraction add(Fraction f){
        this.n += f.n;
        this.d += f.d;
        return this;
    }

    public Fraction mul(Fraction f){
        this.n *= f.n;
        this.d *= f.d;
        return this;
    }

    public boolean egale(Fraction f){
        return this.n == f.n && this.d == f.d;
    }

    public int compareTo(Fraction f){
        if (this.n / this.d > f.n / f.d){
            return 1;
        }else if (this.n / this.d < f.n / f.d){
            return -1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Fraction t1 = new Fraction(9, 78);
        Fraction t2 = new Fraction(3, 5);
        Fraction t3 = new Fraction(10, 2);
        System.out.println(t1.toString());
        t1.add(t2);
        System.out.println(t1.toString());
        t1.mul(t3);
        System.out.println(t1.toString());
        System.out.println(t1.egale(t3));
        System.out.println(t1.compareTo(t3));
        System.out.println(t3.compareTo(t3));
        System.out.println(t3.compareTo(t1));
    }
}
