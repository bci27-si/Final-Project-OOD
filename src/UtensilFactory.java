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

    //=========================

    public String utensilWidth(double wth){


        return "Utensil Width: " + wth;
    }

    public String utensilTransparency(double transparency){


        return "Utensil Transparency: " + transparency;
    }

    //=========================

    public void setTransparency(double transparency) {
        this.transparency = transparency;
    }
    public double getTransparency() {
        return transparency;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    //=========================


}


