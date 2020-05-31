package io.spotnext.kawa.util;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public interface Loggable {
	static Map<Class<?>, Logger> LOGGERS = new HashMap<>();

	default Logger log() {
		final var klass = this.getClass();
		var logger = LOGGERS.get(klass);

		if (logger == null) {
			logger = Logger.getLogger(klass.toString());
			LOGGERS.put(klass, logger);
		}

		return logger;
	}
	
}