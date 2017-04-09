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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author debmalyajash
 *
 */
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7999292440395765819L;
	private List<Account> accountList;
	private List<Treasury> treasuryList;
	private String policyNo;
	private String policyHolderPanNo;
	private String policyHolderEmailAddress;
	private String policyHolderMobileNo;
	private String policyHolderDob;
	private long dob;
	private String corpId;
	private String ucc;
	private String custid;
	private String rmmobile;
	private String userid;
	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * @return the rmmobile
	 */
	public String getRmmobile() {
		return rmmobile;
	}
	/**
	 * @param rmmobile the rmmobile to set
	 */
	public void setRmmobile(String rmmobile) {
		this.rmmobile = rmmobile;
	}
	/**
	 * @return the custid
	 */
	public String getCustid() {
		return custid;
	}
	/**
	 * @param custid the custid to set
	 */
	public void setCustid(String custid) {
		this.custid = custid;
	}
	/**
	 * @return the ucc
	 */
	public String getUcc() {
		return ucc;
	}
	/**
	 * @param ucc the ucc to set
	 */
	public void setUcc(String ucc) {
		this.ucc = ucc;
	}
	/**
	 * @return the corpId
	 */
	public String getCorpId() {
		return corpId;
	}
	/**
	 * @param corpId the corpId to set
	 */
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}
	/**
	 * @return the dob
	 */
	public long getDob() {
		return dob;
	}
	public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	/**
	 * @return the policyHolderDob
	 */
	public String getPolicyHolderDob() {
		return policyHolderDob;
	}
	/**
	 * @param policyHolderDob the policyHolderDob to set
	 * @throws ParseException 
	 */
	public void setPolicyHolderDob(String policyHolderDob) throws ParseException {
		dob =sdf.parse(policyHolderDob).getTime();
		this.policyHolderDob = policyHolderDob;
	}
	/**
	 * @return the policyHolderMobileNo
	 */
	public String getPolicyHolderMobileNo() {
		return policyHolderMobileNo;
	}
	/**
	 * @param policyHolderMobileNo the policyHolderMobileNo to set
	 */
	public void setPolicyHolderMobileNo(String policyHolderMobileNo) {
		this.policyHolderMobileNo = policyHolderMobileNo;
	}
	/**
	 * @return the policyHolderEmailAddress
	 */
	public String getPolicyHolderEmailAddress() {
		return policyHolderEmailAddress;
	}
	/**
	 * @param policyHolderEmailAddress the policyHolderEmailAddress to set
	 */
	public void setPolicyHolderEmailAddress(String policyHolderEmailAddress) {
		this.policyHolderEmailAddress = policyHolderEmailAddress;
	}
	/**
	 * @return the policyHolderPanNo
	 */
	public String getPolicyHolderPanNo() {
		return policyHolderPanNo;
	}
	/**
	 * @param policyHolderPanNo the policyHolderPanNo to set
	 */
	public void setPolicyHolderPanNo(String policyHolderPanNo) {
		this.policyHolderPanNo = policyHolderPanNo;
	}
	/**
	 * @return the policyNo
	 */
	public String getPolicyNo() {
		return policyNo;
	}
	/**
	 * @param policyNo the policyNo to set
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	/**
	 * @return the accountList
	 */
	public List<Account> getAccountList() {
		return accountList;
	}
	/**
	 * @param accountList the accountList to set
	 */
	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	/**
	 * @return the treasuryList
	 */
	public List<Treasury> getTreasuryList() {
		return treasuryList;
	}
	/**
	 * @param treasuryList the treasuryList to set
	 */
	public void setTreasuryList(List<Treasury> treasuryList) {
		this.treasuryList = treasuryList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [accountList=" + accountList + ", treasuryList=" + treasuryList + ", policyNo=" + policyNo
				+ ", policyHolderPanNo=" + policyHolderPanNo + ", policyHolderEmailAddress=" + policyHolderEmailAddress
				+ ", policyHolderMobileNo=" + policyHolderMobileNo + ", policyHolderDob=" + policyHolderDob + ", dob="
				+ dob + ", corpId=" + corpId + ", ucc=" + ucc + ", custid=" + custid + ", rmmobile=" + rmmobile
				+ ", userid=" + userid + "]";
	}
	
	
 }
