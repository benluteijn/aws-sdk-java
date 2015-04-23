/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the last time an AWS access key was used.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * GetAccessKeyLastUsed action.
 * </p>
 */
public class AccessKeyLastUsed implements Serializable, Cloneable {

    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the access key was most recently used.
     */
    private java.util.Date lastUsedDate;

    /**
     * The name of the AWS service with which this access key was most
     * recently used.
     */
    private String serviceName;

    /**
     * The AWS region where this access key was most recently used. <p>For
     * more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a> in the Amazon Web Services General Reference.
     */
    private String region;

    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the access key was most recently used.
     *
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the access key was most recently used.
     */
    public java.util.Date getLastUsedDate() {
        return lastUsedDate;
    }
    
    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the access key was most recently used.
     *
     * @param lastUsedDate The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the access key was most recently used.
     */
    public void setLastUsedDate(java.util.Date lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }
    
    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the access key was most recently used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastUsedDate The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the access key was most recently used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AccessKeyLastUsed withLastUsedDate(java.util.Date lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
        return this;
    }

    /**
     * The name of the AWS service with which this access key was most
     * recently used.
     *
     * @return The name of the AWS service with which this access key was most
     *         recently used.
     */
    public String getServiceName() {
        return serviceName;
    }
    
    /**
     * The name of the AWS service with which this access key was most
     * recently used.
     *
     * @param serviceName The name of the AWS service with which this access key was most
     *         recently used.
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    
    /**
     * The name of the AWS service with which this access key was most
     * recently used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceName The name of the AWS service with which this access key was most
     *         recently used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AccessKeyLastUsed withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * The AWS region where this access key was most recently used. <p>For
     * more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a> in the Amazon Web Services General Reference.
     *
     * @return The AWS region where this access key was most recently used. <p>For
     *         more information about AWS regions, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a> in the Amazon Web Services General Reference.
     */
    public String getRegion() {
        return region;
    }
    
    /**
     * The AWS region where this access key was most recently used. <p>For
     * more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a> in the Amazon Web Services General Reference.
     *
     * @param region The AWS region where this access key was most recently used. <p>For
     *         more information about AWS regions, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a> in the Amazon Web Services General Reference.
     */
    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     * The AWS region where this access key was most recently used. <p>For
     * more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a> in the Amazon Web Services General Reference.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param region The AWS region where this access key was most recently used. <p>For
     *         more information about AWS regions, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a> in the Amazon Web Services General Reference.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AccessKeyLastUsed withRegion(String region) {
        this.region = region;
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
        if (getLastUsedDate() != null) sb.append("LastUsedDate: " + getLastUsedDate() + ",");
        if (getServiceName() != null) sb.append("ServiceName: " + getServiceName() + ",");
        if (getRegion() != null) sb.append("Region: " + getRegion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLastUsedDate() == null) ? 0 : getLastUsedDate().hashCode()); 
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode()); 
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AccessKeyLastUsed == false) return false;
        AccessKeyLastUsed other = (AccessKeyLastUsed)obj;
        
        if (other.getLastUsedDate() == null ^ this.getLastUsedDate() == null) return false;
        if (other.getLastUsedDate() != null && other.getLastUsedDate().equals(this.getLastUsedDate()) == false) return false; 
        if (other.getServiceName() == null ^ this.getServiceName() == null) return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false) return false; 
        if (other.getRegion() == null ^ this.getRegion() == null) return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false) return false; 
        return true;
    }
    
    @Override
    public AccessKeyLastUsed clone() {
        try {
            return (AccessKeyLastUsed) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    