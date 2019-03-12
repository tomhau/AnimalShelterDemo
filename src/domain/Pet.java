package domain;

public class Pet implements Animal{
    private String type;
    private String name;

    public Pet(String name, String type){
         this.name=name;
         this.type=type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int cost() {
        final int DOGFEE = 500;
        final int DEFAULTFEE = 200;
        if (this.getType().equals("dog")){
            return DOGFEE;
        } else return DEFAULTFEE;
    }
}
