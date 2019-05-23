/*
 * Copyright 2016-2017 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.openshift.booster.service;

import java.util.List;

// tag::snippet-greeting[]
public class PartnerInfo {

    //SF ID
    private Int partnerID;
    //Red Hat Account Owner
    private String partnerOwner;
    //Partner Level (SI, ISV, Ready, Premier)
    private String partnerLevel;
    //Partner HeadQuarters
    private String partnerHQ:
    //Description of Partner
    private String description;
    //Partner Name
    private String partnerName;
    //List of partner accredidations
    private List<Accreditation> accreditations;
	/**
	 * @return the partnerName
	 */
	public String getPartnerName() {
		return partnerName;
	}
	/**
	 * @param partnerName the partnerName to set
	 */
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	/**
	 * @return the accreditations
	 */
	public List<Accreditation> getAccreditations() {
		return accreditations;
	}
	/**
	 * @param accreditations the accreditations to set
	 */
	public void setAccreditations(List<Accreditation> accreditations) {
		this.accreditations = accreditations;
	}
}
