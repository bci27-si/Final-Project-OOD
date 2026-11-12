public abstract class UtensilFactory {

    // standard width of the utensil
    double width;
    double transparency;

    /*
    UtensilFactory(double width, double transparency) {
        this.width = width;
        this.transparency = transparency;
    }
    */


    public abstract String utensilWidth();
    public abstract String utensilTransparency();

    public String utensilWidth(double width){

        return "Utensil Width: " + width;
    };

    public String utensilTransparency(double transparency){


        return "Utensil Transparency: " + transparency;
    };







}
