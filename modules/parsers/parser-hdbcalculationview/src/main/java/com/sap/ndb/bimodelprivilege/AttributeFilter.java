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


package com.sap.ndb.bimodelprivilege;

import com.sap.ndb.sqlcoremodelaccesscontrol.ValueFilter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AttributeFilter complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AttributeFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/BiModelPrivilege.ecore}Filter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valueFilter" type="{http://www.sap.com/ndb/SQLCoreModelAccessControl.ecore}ValueFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hierarchyFilter" type="{http://www.sap.com/ndb/BiModelPrivilege.ecore}HierarchyFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="procedureFilter" type="{http://www.sap.com/ndb/BiModelPrivilege.ecore}ProcedureFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="attributeName" use="required" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}BIName" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeFilter", propOrder = {
    "valueFilter",
    "hierarchyFilter",
    "procedureFilter"
})
public class AttributeFilter
    extends Filter {

  protected List<ValueFilter> valueFilter;
  protected List<HierarchyFilter> hierarchyFilter;
  protected List<ProcedureFilter> procedureFilter;
  @XmlAttribute(name = "attributeName", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String attributeName;

  /**
   * Gets the value of the valueFilter property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the valueFilter property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getValueFilter().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link ValueFilter }
   */
  public List<ValueFilter> getValueFilter() {
    if (valueFilter == null) {
      valueFilter = new ArrayList<ValueFilter>();
    }
    return this.valueFilter;
  }

  /**
   * Gets the value of the hierarchyFilter property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the hierarchyFilter property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getHierarchyFilter().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link HierarchyFilter }
   */
  public List<HierarchyFilter> getHierarchyFilter() {
    if (hierarchyFilter == null) {
      hierarchyFilter = new ArrayList<HierarchyFilter>();
    }
    return this.hierarchyFilter;
  }

  /**
   * Gets the value of the procedureFilter property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the procedureFilter property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getProcedureFilter().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link ProcedureFilter }
   */
  public List<ProcedureFilter> getProcedureFilter() {
    if (procedureFilter == null) {
      procedureFilter = new ArrayList<ProcedureFilter>();
    }
    return this.procedureFilter;
  }

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

}
