public class Pen extends UtensilFactory{


    Pen(double width, double transparency) {
        super(width, transparency);
    }

    @Override
    public String utensilWidth() {
        return "DEFAULT Utensil Width: ";
    }

    @Override
    public String utensilTransparency() {
        return "Default Utensil Transparency: ";
    }


}
