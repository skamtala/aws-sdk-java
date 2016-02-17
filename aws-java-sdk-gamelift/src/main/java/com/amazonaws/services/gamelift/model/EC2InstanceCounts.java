/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.gamelift.model;

import java.io.Serializable;

/**
 * <p>
 * Current status of fleet capacity. The number of active instances should match
 * or be in the process of matching the number of desired instances. Pending and
 * terminating counts are non-zero only if fleet capacity is adjusting to an
 * <a>UpdateFleetCapacity</a>request, or if access to resources is temporarily
 * affected.
 * </p>
 */
public class EC2InstanceCounts implements Serializable, Cloneable {

    /**
     * <p>
     * Ideal number of active instances in the fleet.
     * </p>
     */
    private Integer dESIRED;
    /**
     * <p>
     * Number of instances in the fleet that are spinning up but not yet active.
     * </p>
     */
    private Integer pENDING;
    /**
     * <p>
     * Actual number of active instances in the fleet.
     * </p>
     */
    private Integer aCTIVE;
    /**
     * <p>
     * Number of instances in the fleet that are no longer active but haven't
     * yet been terminated.
     * </p>
     */
    private Integer tERMINATING;

    /**
     * <p>
     * Ideal number of active instances in the fleet.
     * </p>
     * 
     * @param dESIRED
     *        Ideal number of active instances in the fleet.
     */
    public void setDESIRED(Integer dESIRED) {
        this.dESIRED = dESIRED;
    }

    /**
     * <p>
     * Ideal number of active instances in the fleet.
     * </p>
     * 
     * @return Ideal number of active instances in the fleet.
     */
    public Integer getDESIRED() {
        return this.dESIRED;
    }

    /**
     * <p>
     * Ideal number of active instances in the fleet.
     * </p>
     * 
     * @param dESIRED
     *        Ideal number of active instances in the fleet.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public EC2InstanceCounts withDESIRED(Integer dESIRED) {
        setDESIRED(dESIRED);
        return this;
    }

    /**
     * <p>
     * Number of instances in the fleet that are spinning up but not yet active.
     * </p>
     * 
     * @param pENDING
     *        Number of instances in the fleet that are spinning up but not yet
     *        active.
     */
    public void setPENDING(Integer pENDING) {
        this.pENDING = pENDING;
    }

    /**
     * <p>
     * Number of instances in the fleet that are spinning up but not yet active.
     * </p>
     * 
     * @return Number of instances in the fleet that are spinning up but not yet
     *         active.
     */
    public Integer getPENDING() {
        return this.pENDING;
    }

    /**
     * <p>
     * Number of instances in the fleet that are spinning up but not yet active.
     * </p>
     * 
     * @param pENDING
     *        Number of instances in the fleet that are spinning up but not yet
     *        active.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public EC2InstanceCounts withPENDING(Integer pENDING) {
        setPENDING(pENDING);
        return this;
    }

    /**
     * <p>
     * Actual number of active instances in the fleet.
     * </p>
     * 
     * @param aCTIVE
     *        Actual number of active instances in the fleet.
     */
    public void setACTIVE(Integer aCTIVE) {
        this.aCTIVE = aCTIVE;
    }

    /**
     * <p>
     * Actual number of active instances in the fleet.
     * </p>
     * 
     * @return Actual number of active instances in the fleet.
     */
    public Integer getACTIVE() {
        return this.aCTIVE;
    }

    /**
     * <p>
     * Actual number of active instances in the fleet.
     * </p>
     * 
     * @param aCTIVE
     *        Actual number of active instances in the fleet.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public EC2InstanceCounts withACTIVE(Integer aCTIVE) {
        setACTIVE(aCTIVE);
        return this;
    }

    /**
     * <p>
     * Number of instances in the fleet that are no longer active but haven't
     * yet been terminated.
     * </p>
     * 
     * @param tERMINATING
     *        Number of instances in the fleet that are no longer active but
     *        haven't yet been terminated.
     */
    public void setTERMINATING(Integer tERMINATING) {
        this.tERMINATING = tERMINATING;
    }

    /**
     * <p>
     * Number of instances in the fleet that are no longer active but haven't
     * yet been terminated.
     * </p>
     * 
     * @return Number of instances in the fleet that are no longer active but
     *         haven't yet been terminated.
     */
    public Integer getTERMINATING() {
        return this.tERMINATING;
    }

    /**
     * <p>
     * Number of instances in the fleet that are no longer active but haven't
     * yet been terminated.
     * </p>
     * 
     * @param tERMINATING
     *        Number of instances in the fleet that are no longer active but
     *        haven't yet been terminated.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public EC2InstanceCounts withTERMINATING(Integer tERMINATING) {
        setTERMINATING(tERMINATING);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDESIRED() != null)
            sb.append("DESIRED: " + getDESIRED() + ",");
        if (getPENDING() != null)
            sb.append("PENDING: " + getPENDING() + ",");
        if (getACTIVE() != null)
            sb.append("ACTIVE: " + getACTIVE() + ",");
        if (getTERMINATING() != null)
            sb.append("TERMINATING: " + getTERMINATING());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2InstanceCounts == false)
            return false;
        EC2InstanceCounts other = (EC2InstanceCounts) obj;
        if (other.getDESIRED() == null ^ this.getDESIRED() == null)
            return false;
        if (other.getDESIRED() != null
                && other.getDESIRED().equals(this.getDESIRED()) == false)
            return false;
        if (other.getPENDING() == null ^ this.getPENDING() == null)
            return false;
        if (other.getPENDING() != null
                && other.getPENDING().equals(this.getPENDING()) == false)
            return false;
        if (other.getACTIVE() == null ^ this.getACTIVE() == null)
            return false;
        if (other.getACTIVE() != null
                && other.getACTIVE().equals(this.getACTIVE()) == false)
            return false;
        if (other.getTERMINATING() == null ^ this.getTERMINATING() == null)
            return false;
        if (other.getTERMINATING() != null
                && other.getTERMINATING().equals(this.getTERMINATING()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDESIRED() == null) ? 0 : getDESIRED().hashCode());
        hashCode = prime * hashCode
                + ((getPENDING() == null) ? 0 : getPENDING().hashCode());
        hashCode = prime * hashCode
                + ((getACTIVE() == null) ? 0 : getACTIVE().hashCode());
        hashCode = prime
                * hashCode
                + ((getTERMINATING() == null) ? 0 : getTERMINATING().hashCode());
        return hashCode;
    }

    @Override
    public EC2InstanceCounts clone() {
        try {
            return (EC2InstanceCounts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}