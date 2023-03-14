package seedu.moneymind.Command;

import seedu.moneymind.Ui;

/**
 * Represents the command to exit the program.
 */
public class ByeCommand implements Command {
    @Override
    public void execute(Ui ui) {
        ui.goodbye();
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
