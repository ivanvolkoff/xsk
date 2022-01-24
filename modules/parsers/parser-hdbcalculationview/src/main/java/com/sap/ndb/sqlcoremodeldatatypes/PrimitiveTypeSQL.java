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


package com.sap.ndb.sqlcoremodeldatatypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimitiveTypeSQL.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrimitiveTypeSQL"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TABLE"/&gt;
 *     &lt;enumeration value="ARRAY"/&gt;
 *     &lt;enumeration value="BINTEXT"/&gt;
 *     &lt;enumeration value="CHAR"/&gt;
 *     &lt;enumeration value="VARCHAR"/&gt;
 *     &lt;enumeration value="NCHAR"/&gt;
 *     &lt;enumeration value="NVARCHAR"/&gt;
 *     &lt;enumeration value="TINYINT"/&gt;
 *     &lt;enumeration value="SMALLINT"/&gt;
 *     &lt;enumeration value="INTEGER"/&gt;
 *     &lt;enumeration value="BIGINT"/&gt;
 *     &lt;enumeration value="DECIMAL"/&gt;
 *     &lt;enumeration value="NUMERIC"/&gt;
 *     &lt;enumeration value="REAL"/&gt;
 *     &lt;enumeration value="FLOAT"/&gt;
 *     &lt;enumeration value="DOUBLE"/&gt;
 *     &lt;enumeration value="DATE"/&gt;
 *     &lt;enumeration value="TIME"/&gt;
 *     &lt;enumeration value="TIMESTAMP"/&gt;
 *     &lt;enumeration value="BLOB"/&gt;
 *     &lt;enumeration value="CLOB"/&gt;
 *     &lt;enumeration value="NCLOB"/&gt;
 *     &lt;enumeration value="BINARY"/&gt;
 *     &lt;enumeration value="VARBINARY"/&gt;
 *     &lt;enumeration value="SMALLDECIMAL"/&gt;
 *     &lt;enumeration value="TEXT"/&gt;
 *     &lt;enumeration value="SHORTTEXT"/&gt;
 *     &lt;enumeration value="ALPHANUM"/&gt;
 *     &lt;enumeration value="ST_POINT"/&gt;
 *     &lt;enumeration value="ST_GEOMETRY"/&gt;
 *     &lt;enumeration value="SECONDDATE"/&gt;
 *     &lt;enumeration value="BOOLEAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "PrimitiveTypeSQL", namespace = "http://www.sap.com/ndb/SQLCoreModelDataTypes.ecore")
@XmlEnum
public enum PrimitiveTypeSQL {

  TABLE,
  ARRAY,
  BINTEXT,
  CHAR,
  VARCHAR,
  NCHAR,
  NVARCHAR,
  TINYINT,
  SMALLINT,
  INTEGER,
  BIGINT,
  DECIMAL,
  NUMERIC,
  REAL,
  FLOAT,
  DOUBLE,
  DATE,
  TIME,
  TIMESTAMP,
  BLOB,
  CLOB,
  NCLOB,
  BINARY,
  VARBINARY,
  SMALLDECIMAL,
  TEXT,
  SHORTTEXT,
  ALPHANUM,
  ST_POINT,
  ST_GEOMETRY,
  SECONDDATE,
  BOOLEAN;

  public static PrimitiveTypeSQL fromValue(String v) {
    return valueOf(v);
  }

  public String value() {
    return name();
  }

}
