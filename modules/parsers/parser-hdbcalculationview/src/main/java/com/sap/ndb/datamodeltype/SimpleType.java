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


package com.sap.ndb.datamodeltype;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Data type including a semantic description.
 * Replaces the ABAP data element in the CDS meta model
 *
 *
 * <p>Java class for SimpleType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SimpleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/DataModelType.ecore}DataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valueRange" type="{http://www.sap.com/ndb/DataModelType.ecore}ValueRange" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dataElementName" type="{http://www.sap.com/ndb/BaseModelBase.ecore}AbapName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="primitiveType" use="required" type="{http://www.sap.com/ndb/DataModelType.ecore}PrimitiveType" /&gt;
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *       &lt;attribute name="precision" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *       &lt;attribute name="scale" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *       &lt;attribute name="checkEntity" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}FQName" /&gt;
 *       &lt;attribute name="semanticType" type="{http://www.sap.com/ndb/DataModelType.ecore}SemanticType" /&gt;
 *       &lt;attribute name="derived" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="defaultAggregationBehavior" type="{http://www.sap.com/ndb/DataModelType.ecore}AggregationBehavior" /&gt;
 *       &lt;attribute name="globalElementName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleType", propOrder = {
    "valueRange",
    "dataElementName"
})
public class SimpleType
    extends DataType {

  protected List<ValueRange> valueRange;
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NMTOKEN")
  protected List<String> dataElementName;
  @XmlAttribute(name = "primitiveType", required = true)
  protected PrimitiveType primitiveType;
  @XmlAttribute(name = "length")
  protected Short length;
  @XmlAttribute(name = "precision")
  protected Short precision;
  @XmlAttribute(name = "scale")
  protected Short scale;
  @XmlAttribute(name = "checkEntity")
  protected String checkEntity;
  @XmlAttribute(name = "semanticType")
  protected SemanticType semanticType;
  @XmlAttribute(name = "derived")
  protected Boolean derived;
  @XmlAttribute(name = "defaultAggregationBehavior")
  protected AggregationBehavior defaultAggregationBehavior;
  @XmlAttribute(name = "globalElementName")
  protected String globalElementName;

  /**
   * Gets the value of the valueRange property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the valueRange property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getValueRange().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link ValueRange }
   */
  public List<ValueRange> getValueRange() {
    if (valueRange == null) {
      valueRange = new ArrayList<ValueRange>();
    }
    return this.valueRange;
  }

  /**
   * Gets the value of the dataElementName property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the dataElementName property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDataElementName().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link String }
   */
  public List<String> getDataElementName() {
    if (dataElementName == null) {
      dataElementName = new ArrayList<String>();
    }
    return this.dataElementName;
  }

  /**
   * Gets the value of the primitiveType property.
   *
   * @return possible object is
   * {@link PrimitiveType }
   */
  public PrimitiveType getPrimitiveType() {
    return primitiveType;
  }

  /**
   * Sets the value of the primitiveType property.
   *
   * @param value allowed object is
   *              {@link PrimitiveType }
   */
  public void setPrimitiveType(PrimitiveType value) {
    this.primitiveType = value;
  }

  /**
   * Gets the value of the length property.
   *
   * @return possible object is
   * {@link Short }
   */
  public Short getLength() {
    return length;
  }

  /**
   * Sets the value of the length property.
   *
   * @param value allowed object is
   *              {@link Short }
   */
  public void setLength(Short value) {
    this.length = value;
  }

  /**
   * Gets the value of the precision property.
   *
   * @return possible object is
   * {@link Short }
   */
  public Short getPrecision() {
    return precision;
  }

  /**
   * Sets the value of the precision property.
   *
   * @param value allowed object is
   *              {@link Short }
   */
  public void setPrecision(Short value) {
    this.precision = value;
  }

  /**
   * Gets the value of the scale property.
   *
   * @return possible object is
   * {@link Short }
   */
  public Short getScale() {
    return scale;
  }

  /**
   * Sets the value of the scale property.
   *
   * @param value allowed object is
   *              {@link Short }
   */
  public void setScale(Short value) {
    this.scale = value;
  }

  /**
   * Gets the value of the checkEntity property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getCheckEntity() {
    return checkEntity;
  }

  /**
   * Sets the value of the checkEntity property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setCheckEntity(String value) {
    this.checkEntity = value;
  }

  /**
   * Gets the value of the semanticType property.
   *
   * @return possible object is
   * {@link SemanticType }
   */
  public SemanticType getSemanticType() {
    return semanticType;
  }

  /**
   * Sets the value of the semanticType property.
   *
   * @param value allowed object is
   *              {@link SemanticType }
   */
  public void setSemanticType(SemanticType value) {
    this.semanticType = value;
  }

  /**
   * Gets the value of the derived property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isDerived() {
    return derived;
  }

  /**
   * Sets the value of the derived property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setDerived(Boolean value) {
    this.derived = value;
  }

  /**
   * Gets the value of the defaultAggregationBehavior property.
   *
   * @return possible object is
   * {@link AggregationBehavior }
   */
  public AggregationBehavior getDefaultAggregationBehavior() {
    return defaultAggregationBehavior;
  }

  /**
   * Sets the value of the defaultAggregationBehavior property.
   *
   * @param value allowed object is
   *              {@link AggregationBehavior }
   */
  public void setDefaultAggregationBehavior(AggregationBehavior value) {
    this.defaultAggregationBehavior = value;
  }

  /**
   * Gets the value of the globalElementName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getGlobalElementName() {
    return globalElementName;
  }

  /**
   * Sets the value of the globalElementName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setGlobalElementName(String value) {
    this.globalElementName = value;
  }

}
