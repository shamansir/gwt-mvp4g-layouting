package name.shamansir.mvp4glayout.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import name.shamansir.mvp4glayout.client.mvp.ChildEventBus;

public abstract class SafeCallback<T> implements AsyncCallback<T> {
    
    private final ChildEventBus eventBus;
    
    public SafeCallback(ChildEventBus eventBus) {
    	this.eventBus = eventBus;
    }

    @Override
    public void onFailure(Throwable caught) {
    	eventBus.handle(caught);
    }

}
