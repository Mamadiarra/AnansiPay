/*
 * Copyright 2021 Akanza
 * Licensed under the Server Side Public License (SSPL), VERSION 1, OCTOBER 16, 2018;
 */

package com.akanza.anansipay.core;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * <p>Interface representing business information between an {@link Account} and an {@link
 * Organisation}.</p>
 *
 * @author Christian Amani 2021-02-07
 */
public interface Transaction {

  /**
   * @return Transaction amount
   */
  Money amount();

  /**
   * @return Unique reference for each transaction
   */
  String reference();

  /**
   * @return Reference to identify the account uniquely
   */
  String accountReference();

  /**
   * @return Date of transaction
   */
  LocalDateTime date();

  /**
   * @return Designation of transaction
   */
  String designation();

  /**
   * @return Reference uniquely identifying the customer of an account
   */
  String clientReference();

  /**
   * @return The operator involved in the transaction
   */
  Operator operator();

  /**
   * @return The payment category
   */
  PaymentCategory category();

  /**
   * @return The address to which the user will be redirected if the payment is successful. The
   * address must be specified in full including the protocol used (for example, https://test.ru
   * instead of test.ru).
   */
  String successfulPaymentUrl();

  /**
   * @return The address to which the user is to be redirected in case of a failed payment. The
   * address must be specified in full including the protocol used (for example, https://test.ru
   * instead of test.ru).
   */
  String failedPaymentUrl();

  /**
   * @return Language used for the transaction
   */
  String language();

  /**
   * @return Metadata of the transaction
   */
  Map<String, String> metadata();
}
