package andriyklus.footballmanager.init;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartupInitializer {

    private final DataInitializerService dataInitializerService;

    public StartupInitializer(DataInitializerService dataInitializerService) {
        this.dataInitializerService = dataInitializerService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady() {
        dataInitializerService.initializeDatabase();
    }
}