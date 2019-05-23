package io.openshift.booster.service;

public class Accreditation {
    
    //Is the accredidation currently active
    private boolean isActive;
    //Is the accreidation Valid
    private boolean isValid;
    //Specialty (PAM, RHEL, OCP, OSP)
    private String specialty;
    //Specialization (Middleware, Cloud, Data Infra)
    private String specialization;
    //Sales Type (Sales, Sales Engineering, Delivery)
    private String salesType;
    //Who holds the accredidation
    private String employee;

	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the isValid
	 */
	public boolean isValid() {
		return isValid;
	}

	/**
	 * @param isValid the isValid to set
	 */
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	/**
	 * @return the specialty
	 */
	public String getSpecialty() {
		return specialty;
	}

	/**
	 * @param specialty the specialty to set
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	/**
	 * @return the specialization
	 */
	public String getSpecialization() {
		return specialization;
	}

	/**
	 * @param specialization the specialization to set
	 */
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	/**
	 * @return the salesType
	 */
	public String getSalesType() {
		return salesType;
	}

	/**
	 * @param salesType the salesType to set
	 */
	public void setSalesType(String salesType) {
		this.salesType = salesType;
	}
    
    
}
