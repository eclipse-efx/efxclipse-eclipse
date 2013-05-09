/**
 */
package org.eclipse.fx.ide.rrobot.model.task;

import java.io.InputStream;
import java.util.Map;

public interface Generator<F extends File> {
	InputStream generate(F file, Map<String, Object> data);

} // Generator
