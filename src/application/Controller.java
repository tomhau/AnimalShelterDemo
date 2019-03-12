package application;
import domain.Pet;
import persistance.DB;
import business.Calculate;

public class Controller {

    private DB db = new DB();

    private Calculate cal = new Calculate();
    /**
     * Invoked from the UI !!!
     * @param name
     * @param type
     * @return
     */
    public String animalInfo(String name, String type){

        Pet p = new Pet(name,type);

        // polymorphic examples 1 and 2
        return "info:" + " The total fee pr week is=" + cal.totalCost(p) + ", " + db.insert(p);
    }

}
