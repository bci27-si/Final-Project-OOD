public class Draw implements CommandInterface{

    private Marking draw;
    //private param input;

    // command for calling execute on draw

    @Override
    public void execute() {
        draw.operationDraw();
    }



}

/*

    public String CommandDraw(){

        return "Command_Undo" + "Time" + "actions";
    }

 */
