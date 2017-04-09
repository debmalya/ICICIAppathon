/**
 * Copyright 2015-2016 Debmalya Jash
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.deb.model;

import java.io.Serializable;

/**
 * @author debmalyajash
 *
 */
public class Treasury implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2231894512465564237L;
	private String treasuryCurrencyPair;
	private String treasuryUserId;
	private String treasuryCustId;
	/**
	 * @return the treasuryCurrencyPair
	 */
	public String getTreasuryCurrencyPair() {
		return treasuryCurrencyPair;
	}
	/**
	 * @param treasuryCurrencyPair the treasuryCurrencyPair to set
	 */
	public void setTreasuryCurrencyPair(String treasuryCurrencyPair) {
		this.treasuryCurrencyPair = treasuryCurrencyPair;
	}
	/**
	 * @return the treasuryUserId
	 */
	public String getTreasuryUserId() {
		return treasuryUserId;
	}
	/**
	 * @param treasuryUserId the treasuryUserId to set
	 */
	public void setTreasuryUserId(String treasuryUserId) {
		this.treasuryUserId = treasuryUserId;
	}
	/**
	 * @return the treasuryCustId
	 */
	public String getTreasuryCustId() {
		return treasuryCustId;
	}
	/**
	 * @param treasuryCustId the treasuryCustId to set
	 */
	public void setTreasuryCustId(String treasuryCustId) {
		this.treasuryCustId = treasuryCustId;
	}
}
