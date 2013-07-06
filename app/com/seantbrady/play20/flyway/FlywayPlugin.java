package com.seantbrady.play20.flyway;

import com.googlecode.flyway.core.Flyway;
import play.Application;
import play.Configuration;
import play.Logger;
import play.Plugin;
import play.db.DB;

public class FlywayPlugin extends Plugin {

    private final Application application;

    public FlywayPlugin(Application application) {
        this.application = application;
    }

    @Override
    public void onStart() {
        Configuration configuration = application.configuration();
        // you can now access the application.conf settings, including any custom ones you have added
        Logger.info("MyExamplePlugin has started");

        // Create the Flyway instance
        Flyway flyway = new Flyway();

        // Point it to the database
        flyway.setDataSource(DB.getDataSource());

        // Start the migration
        flyway.migrate();
    }

    @Override
    public void onStop() {
        // you may want to tidy up resources here
        Logger.info("MyExamplePlugin has stopped");
    }
}
