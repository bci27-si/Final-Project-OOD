public class Highlighter extends UtensilFactory{



    @Override
    public String utensilWidth() {
        this.width = 10;

        return "DEFAULT Utensil Width: ";
    }

    @Override
    public String utensilTransparency() {
        return "Default Utensil Transparency: ";
    }
}
