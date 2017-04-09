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
public class Transaction implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7985665872087015648L;
	
	private String transactionDate;
	private double closingBalance;
	private String accountno;
	private String creditDebitFlag;
	private double transactionAmount;
	private String remark;
	/**
	 * @return the transactionDate
	 */
	public String getTransactionDate() {
		return transactionDate;
	}
	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	/**
	 * @return the closingBalance
	 */
	public double getClosingBalance() {
		return closingBalance;
	}
	/**
	 * @param d the closingBalance to set
	 */
	public void setClosingBalance(double d) {
		this.closingBalance = d;
	}
	/**
	 * @return the accountno
	 */
	public String getAccountno() {
		return accountno;
	}
	/**
	 * @param accountno the accountno to set
	 */
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	/**
	 * @return the creditDebitFlag
	 */
	public String getCreditDebitFlag() {
		return creditDebitFlag;
	}
	/**
	 * @param creditDebitFlag the creditDebitFlag to set
	 */
	public void setCreditDebitFlag(String creditDebitFlag) {
		this.creditDebitFlag = creditDebitFlag;
	}
	/**
	 * @return the transactionAmount
	 */
	public double getTransactionAmount() {
		return transactionAmount;
	}
	/**
	 * @param d the transactionAmount to set
	 */
	public void setTransactionAmount(double d) {
		this.transactionAmount = d;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountno == null) ? 0 : accountno.hashCode());
		result = prime * result + ((creditDebitFlag == null) ? 0 : creditDebitFlag.hashCode());
		result = prime * result + ((transactionDate == null) ? 0 : transactionDate.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (accountno == null) {
			if (other.accountno != null)
				return false;
		} else if (!accountno.equals(other.accountno))
			return false;
		if (creditDebitFlag == null) {
			if (other.creditDebitFlag != null)
				return false;
		} else if (!creditDebitFlag.equals(other.creditDebitFlag))
			return false;
		if (transactionDate == null) {
			if (other.transactionDate != null)
				return false;
		} else if (!transactionDate.equals(other.transactionDate))
			return false;
		return true;
	}
	
	

}
