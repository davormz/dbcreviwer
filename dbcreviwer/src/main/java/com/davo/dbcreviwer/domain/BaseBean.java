package com.davo.dbcreviwer.domain;

/**
 * Base class for Model objects. Child objects should implement toString(),
 * equals() and hashCode().
 * @author <a href="davo.rmz@gmail.com">davo</a>
 *
 */
public abstract class BaseBean {
	
	/**
     * Returns a multi-line String with key=value pairs.
     * @return a String representation of this class.
     */
	public abstract String toString();
	
	/**
     * Compares object equality.
     * @param o object to compare to
     * @return true/false based on equality tests
     */
	public abstract boolean equals(Object obj);
	
	/**
     * When you override equals, you should override hashCode. See "Why are
     * equals() and hashCode() importation" for more information:
     * http://www.hibernate.org/109.html
     * @return hashCode
     */
	public abstract int hashCode();


}
