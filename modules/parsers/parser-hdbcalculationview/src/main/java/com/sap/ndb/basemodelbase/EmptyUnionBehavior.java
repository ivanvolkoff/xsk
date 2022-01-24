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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmptyUnionBehavior.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmptyUnionBehavior"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_ROW"/&gt;
 *     &lt;enumeration value="ROW_WITH_CONSTANTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "EmptyUnionBehavior")
@XmlEnum
public enum EmptyUnionBehavior {


  /**
   * No row form the source will be added to the result of the union - this  means the constant value defined for
   * any mapping is not returned for selects where only columns with a constant mapping are selected.
   */
  NO_ROW,

  /**
   * A row with the constant mapping values (and null for the other columns) is added to the result of the source.
   */
  ROW_WITH_CONSTANTS;

  public static EmptyUnionBehavior fromValue(String v) {
    return valueOf(v);
  }

  public String value() {
    return name();
  }

}
