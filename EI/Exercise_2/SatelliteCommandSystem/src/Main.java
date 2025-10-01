import models.Satellite;
import invoker.SatelliteController;
import commands.*;

public class Main {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        SatelliteController controller = new SatelliteController();

        // Add commands
        controller.addCommand(new RotateCommand(satellite, "South"));
        controller.addCommand(new ActivatePanelsCommand(satellite));
        controller.addCommand(new CollectDataCommand(satellite));
        controller.addCommand(new RotateCommand(satellite, "East"));
        controller.addCommand(new CollectDataCommand(satellite));
        controller.addCommand(new DeactivatePanelsCommand(satellite));

        // Execute all commands
        controller.executeCommands();

        // Print final state
        System.out.println("Final Satellite State:");
        System.out.println(satellite);
    }
}
