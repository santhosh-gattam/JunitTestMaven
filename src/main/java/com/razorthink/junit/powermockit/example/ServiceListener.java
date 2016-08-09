package com.razorthink.junit.powermockit.example;

public interface ServiceListener {
	void onSuccess(Service service);
	void onFailure(Service service);
}
