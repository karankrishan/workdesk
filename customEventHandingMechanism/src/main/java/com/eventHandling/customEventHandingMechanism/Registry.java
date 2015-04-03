package com.eventHandling.customEventHandingMechanism;

import java.util.HashMap;
import java.util.Map;

/**
 * @author KARAN KRISHAN
 *
 */
public class Registry {
	private static Map<Event, IHandler> hashMap = new HashMap<Event, IHandler>();

	public static <T, R> void register(Event<T, R> event, IHandler handler) {
		hashMap.put(event, handler);
	}

	public static <T, R> void fireEvent(Event<T, R> event) {
		IHandler iHandler = hashMap.get(event);
		iHandler.handle(event);
	}
}
