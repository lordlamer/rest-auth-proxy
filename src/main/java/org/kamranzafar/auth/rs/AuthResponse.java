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

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kamran Zafar
 * 
 */
public class AuthResponse {
	private String status;
	private Map<String, String> lookup = new HashMap<String, String>();

	public AuthResponse() {
		status = "SUCCESS";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Map<String, String> getLookup() {
		return lookup;
	}

	public void setLookup(Map<String, String> lookup) {
		this.lookup = lookup;
	}
}
