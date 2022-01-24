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


package com.sap.ndb.bimodeldatafoundation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds the layout properties the whole InformationModel
 *
 *
 * <p>Java class for InformationModelLayoutProperties complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="InformationModelLayoutProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="relativeWidthScenario" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="dataFoundationExpanded" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="logicalJoinExpanded" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationModelLayoutProperties")
public class InformationModelLayoutProperties {

  @XmlAttribute(name = "relativeWidthScenario")
  protected Integer relativeWidthScenario;
  @XmlAttribute(name = "dataFoundationExpanded")
  protected Boolean dataFoundationExpanded;
  @XmlAttribute(name = "logicalJoinExpanded")
  protected Boolean logicalJoinExpanded;

  /**
   * Gets the value of the relativeWidthScenario property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getRelativeWidthScenario() {
    return relativeWidthScenario;
  }

  /**
   * Sets the value of the relativeWidthScenario property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setRelativeWidthScenario(Integer value) {
    this.relativeWidthScenario = value;
  }

  /**
   * Gets the value of the dataFoundationExpanded property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isDataFoundationExpanded() {
    return dataFoundationExpanded;
  }

  /**
   * Sets the value of the dataFoundationExpanded property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setDataFoundationExpanded(Boolean value) {
    this.dataFoundationExpanded = value;
  }

  /**
   * Gets the value of the logicalJoinExpanded property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isLogicalJoinExpanded() {
    return logicalJoinExpanded;
  }

  /**
   * Sets the value of the logicalJoinExpanded property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setLogicalJoinExpanded(Boolean value) {
    this.logicalJoinExpanded = value;
  }

}
