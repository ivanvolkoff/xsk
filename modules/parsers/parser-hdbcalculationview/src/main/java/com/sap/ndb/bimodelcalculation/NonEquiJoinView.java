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

import com.sap.ndb.basemodelbase.Cardinality;
import com.sap.ndb.basemodelbase.JoinType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The NonEquiJoinView (NEJ) allows join conditions with various comparisons (EQ, NE, LT, GT, LE, GE) on several columns.
 * It will not be	allowed as a join to a shared dimension (not part of a star join).
 * Since the NEJ will be mapped to the predicate join in the calculation engine, no
 * customer-defined calculations or filters are allowed.
 * The predicate join requires conditions on the input sources,
 * not the targets as in other nodes. The	optimize join columns flag is not supported in the NEJ.
 * There is also no support for the 'dynamic join property' or the 'ignore multiple outputs for filter	property'.
 *
 *
 * <p>Java class for NonEquiJoinView complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NonEquiJoinView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/BiModelCalculation.ecore}CalculationView"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="joinAttribute" type="{http://www.sap.com/ndb/BiModelCalculation.ecore}NonEquiJoinAttribute"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="joinType" use="required" type="{http://www.sap.com/ndb/BaseModelBase.ecore}JoinType" /&gt;
 *       &lt;attribute name="cardinality" type="{http://www.sap.com/ndb/BaseModelBase.ecore}Cardinality" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEquiJoinView", propOrder = {
    "joinAttribute"
})
public class NonEquiJoinView
    extends CalculationView {

  @XmlElement(required = true)
  protected NonEquiJoinAttribute joinAttribute;
  @XmlAttribute(name = "joinType", required = true)
  protected JoinType joinType;
  @XmlAttribute(name = "cardinality")
  protected Cardinality cardinality;

  /**
   * Gets the value of the joinAttribute property.
   *
   * @return possible object is
   * {@link NonEquiJoinAttribute }
   */
  public NonEquiJoinAttribute getJoinAttribute() {
    return joinAttribute;
  }

  /**
   * Sets the value of the joinAttribute property.
   *
   * @param value allowed object is
   *              {@link NonEquiJoinAttribute }
   */
  public void setJoinAttribute(NonEquiJoinAttribute value) {
    this.joinAttribute = value;
  }

  /**
   * Gets the value of the joinType property.
   *
   * @return possible object is
   * {@link JoinType }
   */
  public JoinType getJoinType() {
    return joinType;
  }

  /**
   * Sets the value of the joinType property.
   *
   * @param value allowed object is
   *              {@link JoinType }
   */
  public void setJoinType(JoinType value) {
    this.joinType = value;
  }

  /**
   * Gets the value of the cardinality property.
   *
   * @return possible object is
   * {@link Cardinality }
   */
  public Cardinality getCardinality() {
    return cardinality;
  }

  /**
   * Sets the value of the cardinality property.
   *
   * @param value allowed object is
   *              {@link Cardinality }
   */
  public void setCardinality(Cardinality value) {
    this.cardinality = value;
  }

}
