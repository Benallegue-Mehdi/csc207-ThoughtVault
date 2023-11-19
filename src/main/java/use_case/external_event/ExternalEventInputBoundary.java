package use_case.external_event;

import java.io.IOException;

public interface ExternalEventInputBoundary {
    boolean importEvent(String eventId) throws IOException;
    boolean exportEvent(String eventId) throws IOException;
}
