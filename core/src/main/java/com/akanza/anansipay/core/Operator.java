/*
 * Copyright 2021 Amani Christian Cyrille Alves
 * Licensed under the Server Side Public License (SSPL), VERSION 1, OCTOBER 16, 2018;
 */

package com.akanza.anansipay.core;

/**
 * <p>Interface representing a financial or telecom service operator.</p>
 *
 * @author Christian Amani 2021-02-07
 */
public interface Operator {

  /**
   * @return Operator name
   */
  String name();

  /**
   * @return Operator description
   */
  String description();
}
