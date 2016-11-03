/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.ksc.cdn.model.content;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information about the objects that you
 * want to invalidate.
 * </p>
 */
public class Paths implements Serializable, Cloneable {

    /**
     * The number of objects that you want to invalidate.
     */
    private Integer quantity;

    /**
     * A complex type that contains a list of the objects that you want to
     * invalidate.
     */
    private com.ksc.internal.ListWithAutoConstructFlag<String> items;

    /**
     * The number of objects that you want to invalidate.
     *
     * @return The number of objects that you want to invalidate.
     */
    public Integer getQuantity() {
        return quantity;
    }
    
    /**
     * The number of objects that you want to invalidate.
     *
     * @param quantity The number of objects that you want to invalidate.
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    /**
     * The number of objects that you want to invalidate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param quantity The number of objects that you want to invalidate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Paths withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * A complex type that contains a list of the objects that you want to
     * invalidate.
     *
     * @return A complex type that contains a list of the objects that you want to
     *         invalidate.
     */
    public java.util.List<String> getItems() {
        if (items == null) {
              items = new com.ksc.internal.ListWithAutoConstructFlag<String>();
              items.setAutoConstruct(true);
        }
        return items;
    }
    
    /**
     * A complex type that contains a list of the objects that you want to
     * invalidate.
     *
     * @param items A complex type that contains a list of the objects that you want to
     *         invalidate.
     */
    public void setItems(java.util.Collection<String> items) {
        if (items == null) {
            this.items = null;
            return;
        }
        com.ksc.internal.ListWithAutoConstructFlag<String> itemsCopy = new com.ksc.internal.ListWithAutoConstructFlag<String>(items.size());
        itemsCopy.addAll(items);
        this.items = itemsCopy;
    }
    
    /**
     * A complex type that contains a list of the objects that you want to
     * invalidate.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setItems(java.util.Collection)} or {@link
     * #withItems(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items A complex type that contains a list of the objects that you want to
     *         invalidate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Paths withItems(String... items) {
        if (getItems() == null) setItems(new java.util.ArrayList<String>(items.length));
        for (String value : items) {
            getItems().add(value);
        }
        return this;
    }
    
    /**
     * A complex type that contains a list of the objects that you want to
     * invalidate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items A complex type that contains a list of the objects that you want to
     *         invalidate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Paths withItems(java.util.Collection<String> items) {
        if (items == null) {
            this.items = null;
        } else {
            com.ksc.internal.ListWithAutoConstructFlag<String> itemsCopy = new com.ksc.internal.ListWithAutoConstructFlag<String>(items.size());
            itemsCopy.addAll(items);
            this.items = itemsCopy;
        }

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
        if (getQuantity() != null) sb.append("Quantity: " + getQuantity() + ",");
        if (getItems() != null) sb.append("Items: " + getItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode()); 
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Paths == false) return false;
        Paths other = (Paths)obj;
        
        if (other.getQuantity() == null ^ this.getQuantity() == null) return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false) return false; 
        if (other.getItems() == null ^ this.getItems() == null) return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false) return false; 
        return true;
    }
    
    @Override
    public Paths clone() {
        try {
            return (Paths) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    