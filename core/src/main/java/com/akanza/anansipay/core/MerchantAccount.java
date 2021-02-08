/*
 * Copyright 2021 Akanza
 * Licensed under the Server Side Public License (SSPL), VERSION 1, OCTOBER 16, 2018;
 */

package com.akanza.anansipay.core;

/**
 * @author Christian Amani 2021-02-07
 */
public interface MerchantAccount extends Account {

  /**
   * @return Name of the merchant
   */
  String name();

  /**
   * @return Merchant information
   */
  String information();
}
