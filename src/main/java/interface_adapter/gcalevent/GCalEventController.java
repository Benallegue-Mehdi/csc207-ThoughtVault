package interface_adapter.gcalevent;

import use_case.external_event.ExternalEventInputBoundary;
import use_case.external_event.ExternalEventInputData;

import java.io.IOException;

public class GCalEventController {
    final ExternalEventInputBoundary externalEventUseCaseInteractor;
    public GCalEventController(ExternalEventInputBoundary externalEventUseCaseInteractor) {
        this.externalEventUseCaseInteractor = externalEventUseCaseInteractor;
    }

    public void importEvent(String eventId) throws IOException {
        ExternalEventInputData externalEventInputData = new ExternalEventInputData(eventId);
        externalEventUseCaseInteractor.importEvent(externalEventInputData);
    }

    public void exportEvent(String eventId) throws IOException {
        ExternalEventInputData externalEventInputData = new ExternalEventInputData(eventId);
        externalEventUseCaseInteractor.exportEvent(externalEventInputData);
    }
}
