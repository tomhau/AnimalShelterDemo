package persistance;

import domain.Pet;

public class DB {


    /**
     *
     * @param p The Pet to insert
     * @return The message (Success or Failure)
     */
    public String insert(Pet p){

        return "inserted successfully this type of animal:"+p.getType();
    }

}
