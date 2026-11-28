public class Undo implements CommandInterface {

    Do u;

    @Override
    public void execute() {
        u.OperationUndo();
    }

    // concrete ocmmand class

    //private do;
    //private param;

    //undo command
    /*
    public String CommandUndo(do d,bool param){
        // do is the reciever class
        // param is the paramaters


        // return the action and command for future logging
        return "Command_Undo" + "Time" + "actions";

    }
    */

}
