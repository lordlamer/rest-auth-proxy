/**
 * Copyright 2012 Kamran Zafar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 * 
 */
package org.kamranzafar.auth.rs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author Kamran Zafar
 * 
 */
public class Configuration {
	private final static Properties config = new Properties();
	private static Logger logger = Logger.getLogger(Configuration.class.getName());

	static {
		try {
			logger.info("Loading auth server configuration...");
			config.load(new FileInputStream(new File(new File(System.getProperty("user.dir")), "conf/auth.conf")));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static Properties getConfig() {
		return config;
	}
}
