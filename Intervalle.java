public class Intervalle {
    private Chrono debut, fin;

    public Intervalle(Chrono c1, Chrono c2){
        if (c1.avant(c2)){
            this.debut = c1;
            this.fin = c2;
        }else{
            this.debut = c1;
            this.fin = c1;
        }
    }

    public String toString(){
        return debut.toString() + " - " + fin.toString();
    }

    public Chrono duree(){
        Chrono diff = debut.diff(fin);
        return diff;
    }

    public boolean avant(Intervalle i){
        return (this.fin).avant(i.debut);
    }

    public boolean conflit(Intervalle i){
        return (this.debut).avant(i.fin) && (i.debut).avant(this.fin);
    }

    public static void main(String[] args) {
        Chrono c1 = new Chrono(10, 15, 33);
        Chrono c2 = new Chrono(13,10,50);
        
        Intervalle i1 = new Intervalle(c1, c2);
        System.out.println(i1.toString());
        System.out.println(i1.duree());
        
        Intervalle i2 = new Intervalle(c2, c1);
        System.out.println(i2.toString());
        System.out.println(i1.avant(i2));

    }
}
