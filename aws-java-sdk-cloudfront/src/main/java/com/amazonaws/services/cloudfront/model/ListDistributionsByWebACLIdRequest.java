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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ListDistributionsByWebACLIdRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    private String marker;

    private String maxItems;

    private String webACLId;

    /**
     * @param marker
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * @return
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @param marker
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListDistributionsByWebACLIdRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * @param maxItems
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * @return
     */
    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * @param maxItems
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListDistributionsByWebACLIdRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * @param webACLId
     */
    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * @return
     */
    public String getWebACLId() {
        return this.webACLId;
    }

    /**
     * @param webACLId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListDistributionsByWebACLIdRequest withWebACLId(String webACLId) {
        setWebACLId(webACLId);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getWebACLId() != null)
            sb.append("WebACLId: " + getWebACLId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDistributionsByWebACLIdRequest == false)
            return false;
        ListDistributionsByWebACLIdRequest other = (ListDistributionsByWebACLIdRequest) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null
                && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null
                && other.getWebACLId().equals(this.getWebACLId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode
                + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        return hashCode;
    }

    @Override
    public ListDistributionsByWebACLIdRequest clone() {
        return (ListDistributionsByWebACLIdRequest) super.clone();
    }
}