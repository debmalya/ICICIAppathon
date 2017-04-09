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
public class Payee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4005550147603712291L;
	private String payeeName;
	private String payeeAccountNo;
	private String custid;
	private String payeeid;
	private String shortname;
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((payeeAccountNo == null) ? 0 : payeeAccountNo.hashCode());
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
		Payee other = (Payee) obj;
		if (payeeAccountNo == null) {
			if (other.payeeAccountNo != null)
				return false;
		} else if (!payeeAccountNo.equals(other.payeeAccountNo))
			return false;
		return true;
	}
	/**
	 * @return the payeeName
	 */
	public String getPayeeName() {
		return payeeName;
	}
	/**
	 * @param payeeName the payeeName to set
	 */
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	/**
	 * @return the payeeAccountNo
	 */
	public String getPayeeAccountNo() {
		return payeeAccountNo;
	}
	/**
	 * @param payeeAccountNo the payeeAccountNo to set
	 */
	public void setPayeeAccountNo(String payeeAccountNo) {
		this.payeeAccountNo = payeeAccountNo;
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
	 * @return the payeeid
	 */
	public String getPayeeid() {
		return payeeid;
	}
	/**
	 * @param payeeid the payeeid to set
	 */
	public void setPayeeid(String payeeid) {
		this.payeeid = payeeid;
	}
	/**
	 * @return the shortname
	 */
	public String getShortname() {
		return shortname;
	}
	/**
	 * @param shortname the shortname to set
	 */
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Payee [payeeName=" + payeeName + ", payeeAccountNo=" + payeeAccountNo + ", custid=" + custid
				+ ", payeeid=" + payeeid + ", shortname=" + shortname + "]";
	}
	
	
}
