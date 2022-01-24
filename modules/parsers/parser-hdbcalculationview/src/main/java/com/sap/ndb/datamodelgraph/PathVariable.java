/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2022 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.26 at 10:54:28 AM EET 
//


package com.sap.ndb.datamodelgraph;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * For defining a variable
 *
 *
 * <p>Java class for PathVariable complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PathVariable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/DataModelGraph.ecore}EdgeVariable"&gt;
 *       &lt;attribute name="minLenght" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="maxLength" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathVariable")
public class PathVariable
    extends EdgeVariable {

  @XmlAttribute(name = "minLenght", required = true)
  protected BigInteger minLenght;
  @XmlAttribute(name = "maxLength", required = true)
  protected BigInteger maxLength;

  /**
   * Gets the value of the minLenght property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getMinLenght() {
    return minLenght;
  }

  /**
   * Sets the value of the minLenght property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setMinLenght(BigInteger value) {
    this.minLenght = value;
  }

  /**
   * Gets the value of the maxLength property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getMaxLength() {
    return maxLength;
  }

  /**
   * Sets the value of the maxLength property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setMaxLength(BigInteger value) {
    this.maxLength = value;
  }

}
