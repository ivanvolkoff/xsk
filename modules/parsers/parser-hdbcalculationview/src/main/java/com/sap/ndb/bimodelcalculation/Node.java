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


package com.sap.ndb.bimodelcalculation;

import com.sap.ndb.repositorymodelresource.IDObjectWithDescription;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Node complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Node"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/RepositoryModelResource.ecore}IDObjectWithDescription"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="viewAttributes" type="{http://www.sap.com/ndb/BiModelCalculation.ecore}ViewAttributes" minOccurs="0"/&gt;
 *         &lt;element name="calculatedViewAttributes" type="{http://www.sap.com/ndb/BiModelCalculation.ecore}CalculatedViewAttributes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Node", propOrder = {
    "viewAttributes",
    "calculatedViewAttributes"
})
@XmlSeeAlso({
    DataSource.class,
    GraphView.class,
    CalculationView.class
})
public abstract class Node
    extends IDObjectWithDescription {

  protected ViewAttributes viewAttributes;
  protected CalculatedViewAttributes calculatedViewAttributes;

  /**
   * Gets the value of the viewAttributes property.
   *
   * @return possible object is
   * {@link ViewAttributes }
   */
  public ViewAttributes getViewAttributes() {
    return viewAttributes;
  }

  /**
   * Sets the value of the viewAttributes property.
   *
   * @param value allowed object is
   *              {@link ViewAttributes }
   */
  public void setViewAttributes(ViewAttributes value) {
    this.viewAttributes = value;
  }

  /**
   * Gets the value of the calculatedViewAttributes property.
   *
   * @return possible object is
   * {@link CalculatedViewAttributes }
   */
  public CalculatedViewAttributes getCalculatedViewAttributes() {
    return calculatedViewAttributes;
  }

  /**
   * Sets the value of the calculatedViewAttributes property.
   *
   * @param value allowed object is
   *              {@link CalculatedViewAttributes }
   */
  public void setCalculatedViewAttributes(CalculatedViewAttributes value) {
    this.calculatedViewAttributes = value;
  }

}
