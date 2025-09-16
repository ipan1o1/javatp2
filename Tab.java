public class Tab {
    private int debut, fin;
    String[] tableau;

    public Tab(int first, int last){
        if (first < 0 || last < 0){
            System.out.println("Que des nombres entiers svp!");
        }
        this.debut = first;
        this.fin = last;
        this.tableau = new String[last - first];
    }

    public int length(){
        int res = this.fin - this.debut;
        return res;
    }

    public String get(int i){
        return tableau[i];
    }

    public void set(int i, String s){
        tableau[i] = s;
    }

    public static  void main(String[] args) {
        Tab t1 = new Tab(1,7);
        System.out.print(t1.length());
        t1.set(1, "ordi");
        System.out.print(t1.get(1));
    }
}