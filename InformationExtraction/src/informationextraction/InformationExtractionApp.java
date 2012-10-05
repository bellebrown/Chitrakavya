package informationextraction;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

public class InformationExtractionApp extends SingleFrameApplication {

    @Override protected void startup() {
        show(new InformationExtractionView(this));
    }

    @Override protected void configureWindow(java.awt.Window root) {
    }

    public static InformationExtractionApp getApplication() {
        return Application.getInstance(InformationExtractionApp.class);
    }

    public static void main(String[] args) {
        launch(InformationExtractionApp.class, args);
    }
}
