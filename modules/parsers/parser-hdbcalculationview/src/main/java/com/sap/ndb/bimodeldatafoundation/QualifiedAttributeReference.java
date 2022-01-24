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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Models a link to an attribute that can either be in the local or an external resource.
 * Could als be acheived by resource:QualifiedNameReference
 *
 *
 * <p>Java class for QualifiedAttributeReference complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="QualifiedAttributeReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="attributeName" use="required" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}AlphanumericName" /&gt;
 *       &lt;attribute name="dimensionUri" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}RepositoryUri" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedAttributeReference")
public class QualifiedAttributeReference {

  @XmlAttribute(name = "attributeName", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String attributeName;
  @XmlAttribute(name = "dimensionUri")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String dimensionUri;

  /**
   * Gets the value of the attributeName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getAttributeName() {
    return attributeName;
  }

  /**
   * Sets the value of the attributeName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setAttributeName(String value) {
    this.attributeName = value;
  }

  /**
   * Gets the value of the dimensionUri property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDimensionUri() {
    return dimensionUri;
  }

  /**
   * Sets the value of the dimensionUri property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDimensionUri(String value) {
    this.dimensionUri = value;
  }

}
