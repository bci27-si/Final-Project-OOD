public class PadTemplate {

    private boolean hasGrid;
    private boolean hasLines;

    boolean hasGridSnap;
    // invisible snap points if the visual grid is not visible

    private int bg;
    //private int fg;

    private int padWidth;
    private int padHeight;


    /*

    template class for types of drawing pads
    will contain defaults, such as width, height, color, lines / grid for available pads.

     */

    public int gridSnap(){
        if(!hasGridSnap){
            // sets snapping logic for invisible grid

            System.out.println("NOt sure why you called this method");
            return 0;
        }

        // probably default of 100 *100 grid
        // can update later based on screensize
        return 100;
    }


    // Below setup the boolean getters and setters

    //=========================

    public boolean getHasGrid(){
        return this.hasGrid;
    }

    public void setHasGrid(boolean hasGrid){
        this.hasGrid = hasGrid;
    }

    //=========================

    public boolean getHasLines(){
        return this.hasLines;
    }

    public void setHasLines(boolean hasLines){
        this.hasLines = hasLines;
    }



}
