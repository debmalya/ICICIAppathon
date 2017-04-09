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
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author debmalyajash
 *
 */
public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8338664253356550093L;
	/**
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}
	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	/**
	 * @return the loanAccountNo
	 */
	public String getLoanAccountNo() {
		return loanAccountNo;
	}
	/**
	 * @param loanAccountNo the loanAccountNo to set
	 */
	public void setLoanAccountNo(String loanAccountNo) {
		this.loanAccountNo = loanAccountNo;
	}
	/**
	 * @return the custId
	 */
	public String getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}
	/**
	 * @return the securitiesSchemeId
	 */
	public String getSecuritiesSchemeId() {
		return securitiesSchemeId;
	}
	/**
	 * @param securitiesSchemeId the securitiesSchemeId to set
	 */
	public void setSecuritiesSchemeId(String securitiesSchemeId) {
		this.securitiesSchemeId = securitiesSchemeId;
	}
	
	private String debitCardNo;
	/**
	 * @return the debitCardNo
	 */
	public String getDebitCardNo() {
		return debitCardNo;
	}
	/**
	 * @param debitCardNo the debitCardNo to set
	 */
	public void setDebitCardNo(String debitCardNo) {
		this.debitCardNo = debitCardNo;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	private String accountNo;
	private String loanAccountNo;
	private String custId;
	private String securitiesSchemeId;
	private String accountType;
	
	private double balance;
	private Set<Payee> setOfPayee = new HashSet<>();
	private Set<Transaction> setOfTransactions = new HashSet<>();
	/**
	 * @return the setOfTransactions
	 */
	public Set<Transaction> getSetOfTransactions() {
		return setOfTransactions;
	}
	/**
	 * @param setOfTransactions the setOfTransactions to set
	 */
	public void setSetOfTransactions(Set<Transaction> setOfTransactions) {
		this.setOfTransactions = setOfTransactions;
	}
	/**
	 * @return the setOfPayee
	 */
	public Set<Payee> getSetOfPayee() {
		return setOfPayee;
	}
	/**
	 * @param setOfPayee the setOfPayee to set
	 */
	public void setSetOfPayee(Set<Payee> setOfPayee) {
		this.setOfPayee = setOfPayee;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	private int score;
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
		

	
	
}
