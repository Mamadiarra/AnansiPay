/*
 * Copyright 2021 Akanza
 * Licensed under the Server Side Public License (SSPL), VERSION 1, OCTOBER 16, 2018;
 */

package com.akanza.anansipay.core;

/**
 * <p>Represents an organisation offering payment services.</p>
 *
 * @author Christian Amani 2021-02-07
 */
public interface Organisation extends PaymentService {

  /**
   * @return Name of organisation
   */
  String name();

  /**
   * @return Description of organisation
   */
  String description();

  /**
   * <p>Effectue l'authentification d'un compte marchand.</p>
   */
  MerchantAccount connectMerchant();

  /**
   * @see #connectMerchant()
   */
  MerchantAccount connectMerchant(String merchantUsername, String merchantPassword);
}
