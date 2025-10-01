package models;

import java.util.logging.Logger;

public class Satellite {
    private static final Logger logger = Logger.getLogger(Satellite.class.getName());

    private String orientation;
    private String solarPanels;
    private int dataCollected;

    public Satellite() {
        this.orientation = "North";
        this.solarPanels = "Inactive";
        this.dataCollected = 0;
        logger.info("Satellite initialized: " + this);
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
        logger.info("Orientation set to: " + orientation);
    }

    public void activatePanels() {
        this.solarPanels = "Active";
        logger.info("Solar Panels activated.");
    }

    public void deactivatePanels() {
        this.solarPanels = "Inactive";
        logger.info("Solar Panels deactivated.");
    }

    public void collectData() {
        if (this.solarPanels.equals("Active")) {
            this.dataCollected += 10;
            logger.info("Data collected. Total: " + this.dataCollected);
        } else {
            logger.warning("Cannot collect data. Solar Panels are inactive.");
        }
    }

    @Override
    public String toString() {
        return "Orientation: " + orientation + ", Solar Panels: " + solarPanels + ", Data Collected: " + dataCollected;
    }
}
