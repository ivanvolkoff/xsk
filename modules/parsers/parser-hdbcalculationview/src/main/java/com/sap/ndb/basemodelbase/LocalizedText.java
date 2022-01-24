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


package com.sap.ndb.basemodelbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * For storing a localized text with its language
 *
 *
 * <p>Java class for LocalizedText complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LocalizedText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="language" use="required" type="{http://www.sap.com/ndb/BaseModelBase.ecore}Locale" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalizedText")
public class LocalizedText {

  @XmlAttribute(name = "text", required = true)
  protected String text;
  @XmlAttribute(name = "language", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String language;

  /**
   * Gets the value of the text property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getText() {
    return text;
  }

  /**
   * Sets the value of the text property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setText(String value) {
    this.text = value;
  }

  /**
   * Gets the value of the language property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getLanguage() {
    return language;
  }

  /**
   * Sets the value of the language property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setLanguage(String value) {
    this.language = value;
  }

}
