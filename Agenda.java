import java.util.ArrayList;

public class Agenda {
    private ArrayList<Intervalle> tableau;

    public Agenda(){
        this.tableau = new ArrayList<>();
    }

    public String toString(){
        if (tableau.isEmpty()) return "Agenda Vide";
        String res = "";
        int size = tableau.size();
        for (int i = 0; i < size; i++) {
            res += ""+ (tableau.get(i)).toString();
        }
        return res;
    }

    public static void main(String[] args) {
        
    }
}
