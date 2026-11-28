public class Erase implements CommandInterface {

    // command for calling execute on erase

    private Marking erase;
    //private param input;

    @Override
    public void execute() {
        erase.operationErase();
    }


}

/*
public String EraseCommand() {


        return "Command_Undo" + "Time" + "actions";
    }

 */
